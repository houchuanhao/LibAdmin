package com.libadmin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.main_btn1);//图书管理
        btn2=(Button)findViewById(R.id.main_btn2);//自动巡检
        btn3=(Button)findViewById(R.id.main_btn3);//乱书归位
        btn4=(Button)findViewById(R.id.main_btn4);//机器人设置
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
