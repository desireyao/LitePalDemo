package com.litepaldemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.litepaldemo.model.User;
import com.litepaldemo.model.UserInfo;

import org.litepal.crud.DataSupport;
import org.litepal.crud.callback.FindMultiCallback;
import org.litepal.crud.callback.SaveCallback;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";

    private Button btn_insert;
    private Button btn_delete;
    private Button btn_update;
    private Button btn_query;

    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_insert = (Button) findViewById(R.id.btn_insert);
        btn_insert.setOnClickListener(this);

        btn_delete = (Button) findViewById(R.id.btn_delete);
        btn_delete.setOnClickListener(this);

        btn_update = (Button) findViewById(R.id.btn_update);
        btn_update.setOnClickListener(this);

        btn_query = (Button) findViewById(R.id.btn_query);
        btn_query.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.btn_insert:
                insert();
                break;
            case R.id.btn_delete:
                deleteAll();
                break;
            case R.id.btn_update:
                update();
                break;
            case R.id.btn_query:
                query();
                break;
            default:
                break;
        }
    }

    private void insert() {
        count++;
        User user = new User();
        user.setName("name_" + count);
        user.setAge(10 + count);
        user.setId_card("34088119910818" + count);

//        UserInfo userInfo = new UserInfo();
//        userInfo.setId_card(user.getId_card());
//        userInfo.setAddress("安徽合肥");
//        userInfo.setCountry("中国");
//        userInfo.saveOrUpdate();

        boolean b = user.save();
        Toast.makeText(getApplicationContext(), b ? "数据保存成功" : "数据保存失败", Toast.LENGTH_SHORT).show();

//        boolean b = user.saveOrUpdate();
//        Toast.makeText(getApplicationContext(), b?"数据保存成功":"数据保存失败",
//                Toast.LENGTH_SHORT).show();

//        List<User> users = new ArrayList<>();
//        for (int i = 0; i < 10000; i++) {
//            count++;
//            User user = new User();
//            user.setName("name_" + count);
//            user.setAge(10 + count);
//            users.add(user);
//        }

//        Log.e(TAG, "onStart--->" + "currentTime = " + System.currentTimeMillis());
//        DataSupport.saveAllAsync(users).listen(new SaveCallback() {
//            @Override
//            public void onFinish(boolean success) {
//                Log.e(TAG, "onFinish--->success = " + success
//                        + ",currentTime = " + System.currentTimeMillis());
//            }
//        });
//
//
//        DataSupport.findAllAsync(User.class).listen(new FindMultiCallback() {
//            @Override
//            public <T> void onFinish(List<T> t) {
//                List<User> users = (List<User>) t;
//                Log.e(TAG, "onFinish--->findAllAsync = " + users.size()
//                        + ",currentTime = " + System.currentTimeMillis());
//            }
//        });
    }

    private void deleteAll() {
        DataSupport.deleteAll(User.class);
        DataSupport.deleteAll(UserInfo.class);
    }

    private void update() {
        User user = new User();
        user.setAge(99);
        boolean success = user.saveOrUpdate("name = ?" , "name_1");
        Toast.makeText(getApplicationContext(),success?"修改成功":"修改失败",Toast.LENGTH_SHORT).show();
    }

    private void query() {
//        DataSupport.findAllAsync(User.class).listen(new FindMultiCallback() {
//            @Override
//            public <T> void onFinish(List<T> t) {
//                List<User> users = (List<User>) t;
//                Log.e(TAG, "query--->onFinish--->findAllAsync = " + users.size()
//                        + ",currentTime = " + System.currentTimeMillis());
//            }
//        });

//        User user = DataSupport.findLast(User.class);
//        List<UserInfo> userInfos = DataSupport.where("id_card = ?", user.getId_card()).find(UserInfo.class);
//        Log.e(TAG, "userInfos = " + userInfos);

        User user = DataSupport.order("name").findFirst(User.class);
        Log.e(TAG, "user--->" + user);
    }
}
