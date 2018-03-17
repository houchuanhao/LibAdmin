package com.libadmin.Correct;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.SimpleAdapter;

import com.libadmin.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Utils.DbUtils;

public class getPositionActivity extends AppCompatActivity {
    GridView gv;
    List<Map<String, Object>> dataList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_position);
        gv=(GridView)findViewById(R.id.getPosition_gv);
        String[] from={"current","name","correct"};
        int[] to={R.id.current,R.id.name,R.id.correct};
        dataList= DbUtils.getMessList();
        SimpleAdapter adapter = new SimpleAdapter(this, dataList, R.layout.position_item, from, to);
        gv.setAdapter(adapter);

    }
}
