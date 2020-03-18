package zubair.com;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class MapPracTest {
    private Map<Integer, String> newMap;

    @Before
    public void setUp() throws Exception {
        newMap = new HashMap<Integer, String>();
    }

    @Test
    public void testMapInit(){
        assertTrue(newMap.isEmpty());
        assertTrue(newMap.size() == 0);
    }

    @Test
    public void testAddElements(){
        newMap.put(50,"Zubair");
        newMap.put(1, "Craig");
        newMap.put(280, "Frank");


        assertEquals(newMap.containsKey(1), newMap.containsValue("Craig") );


        newMap.put(685, "Liesl");

        assertTrue(newMap.size()==4);
    }

    @Test
    public void testRemoveElement(){
        newMap.put(50,"Zubair");
        newMap.put(1, "Craig");
        newMap.put(280, "Frank");

        newMap.remove(1);
        Assert.assertTrue(newMap.size() == 2);

        if (true){
            System.out.println("Successfully removed");
        }

    }

    @Test
    public void FailTest(){
        Assert.fail("FailTest Reached");
        // System.out.println("This is my fail test");

    }
}