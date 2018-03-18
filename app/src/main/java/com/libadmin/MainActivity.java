package com.libadmin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import Utils.SubmitButton;

public class MainActivity extends AppCompatActivity {

    private SubmitButton btn1;
    private SubmitButton btn2;
    private SubmitButton btn3;
    private SubmitButton btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(SubmitButton)findViewById(R.id.main_btn1);//图书管理
        btn2=(SubmitButton)findViewById(R.id.main_btn2);//自动巡检
        btn3=(SubmitButton)findViewById(R.id.main_btn3);//乱书归位
        btn4=(SubmitButton)findViewById(R.id.main_btn4);//机器人设置
        initBtn();
    }
    void initBtn(){
        initBtn1();
        initBtn2();
        initBtn3();
        initBtn4();
    }
    void initBtn1(){

    }
    void initBtn2(){//自动巡检
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(MainActivity.this,InspectionActivity.class);
                startActivity(intent);
            }
        });
    }
    void initBtn3(){//乱书归位
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(MainActivity.this,CorrectActivity.class);
                startActivity(intent);
            }
        });
    }
    void initBtn4(){//机器人设置
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(MainActivity.this,SetingActivity.class);
                startActivity(intent);
            }
        });
    }
}
