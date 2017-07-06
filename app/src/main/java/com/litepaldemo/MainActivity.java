package com.litepaldemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.litepaldemo.model.User;

import org.litepal.crud.DataSupport;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";

    private Button btn_insert;
    private Button btn_delete;
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
                break;
            case R.id.btn_query:
                query();
                break;
            default:
                break;
        }
    }

    private void insert() {
        User user = new User();
        user.setName("name_" + count++);
        user.setAge(10 + count);
        user.save();
    }

    private void deleteAll() {
    }

    private void update() {

    }

    private void query() {
       User user = DataSupport.findFirst(User.class);

    }
}
