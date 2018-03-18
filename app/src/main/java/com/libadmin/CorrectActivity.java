package com.libadmin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import Utils.SubmitButton;

public class CorrectActivity extends AppCompatActivity {

    Utils.SubmitButton btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correct);
        btn1=(SubmitButton)findViewById(R.id.inspection_btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(CorrectActivity.this,com.libadmin.Correct.getPositionActivity.class);
                startActivity(intent);
            }
        });

    }
}
