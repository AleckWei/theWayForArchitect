package com.example.rxCodeDemo.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.rxCodeDemo.R;

import static com.example.rxtest.rxcode.day3.RxJavaByMySelf.testCreateMyself;
import static com.example.rxtest.rxcode.day3.RxJavaByMySelf.testMapMyself;
import static com.example.rxtest.rxcode.day3.RxJavaByMySelf.testScheduler;
import static com.example.rxtest.rxcode.day3.RxJavaByMySelf.testSelfFlatMap;

/**
 * 这里主要是对自己写的rxJava核心代码进行测试
 */
public class Day3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_three);

        Button btnSelfCreate = findViewById(R.id.btn_test_self_create);
        btnSelfCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                testCreateMyself();
            }
        });

        Button btnSelfMap = findViewById(R.id.btn_test_self_map);
        btnSelfMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                testMapMyself();
            }
        });

        Button btnTestSelfFlatMap = findViewById(R.id.btn_test_self_flatMap);
        btnTestSelfFlatMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                testSelfFlatMap();
            }
        });

        Button btnTestSelfScheduler = findViewById(R.id.btn_test_self_scheduler);
        btnTestSelfScheduler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                testScheduler();
            }
        });
    }
}