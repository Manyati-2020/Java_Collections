package zubair.com;

import java.util.*;

public class MainActivity {

    public static void main(String[] args) {

        Collections collections = new Collections();
        ArrayPrac newArray = new ArrayPrac();
        SetPrac newSet = new SetPrac();
        MapPrac newMap = new MapPrac();

        newArray.Array();
        System.out.println(newArray.alist);
        newArray.alist.add(3,"Zubair");

        System.out.println("Updated List");
        System.out.println(newArray.alist);


        newSet.AddNumbers();
        newSet.numbers.add(5002);
        System.out.println(newSet.numbers);


        collections.AddValue();
        System.out.println(collections.values);


        newMap.MapSet();

    }
}
