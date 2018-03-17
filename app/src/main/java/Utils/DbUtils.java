package Utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/3/17/017.
 */

public class DbUtils {
    //获取服务器url
    public static String getUrl(){
        return "localhost";
    }
    public static List<Map<String,Object>> getMessList(){
        //从数据库获取位置放错的图书信息下面数据仅用于测试
        List<Map<String, Object>>dataList = new ArrayList<Map<String, Object>>();
        Map<String, Object> map=new HashMap<String, Object>();
        map.put("current","当前位置");
        map.put("name","书名");
        map.put("correct","正确位置");
        dataList.add(map);
        String[] current={"1","2","5","9","10"};
        String[] name={"小王子","小王子","小王子","小王子","小王子"};
        String[] correct={"3","5","4","7","8"};

        for(int i=0;i<current.length;i++){
            Map<String, Object> m=new HashMap<String, Object>();
            m.put("current",current[i]);
            m.put("name",name[i]);
            m.put("correct",correct[i]);
            dataList.add(m);
        }
        return dataList;
    }
}
