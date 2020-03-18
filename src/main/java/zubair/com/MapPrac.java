package zubair.com;


import java.util.HashMap;
import java.util.Map;

public class MapPrac {

    Map<String,String> map = new HashMap<String, String>();

    public void MapSet() {
        map.put("5", "Zubair");
        map.put("6", "Frank");
        map.put("2", "Craig");
        map.put("1", "Frank");

        System.out.println(map);
    }


}
