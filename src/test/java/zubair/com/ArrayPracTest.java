package zubair.com;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ArrayPracTest {
    private List<String> list;


    @Before
    public void setUp() throws Exception {

        list = new ArrayList<String>();
    }

    @Test
    public void testListInit(){
        assertTrue(list.isEmpty());
        assertTrue(list.size() == 0);
    }

    @Test
    public void testAddElements(){
        list.add(0, "Zubair");
        list.add(1, "Riyaad");
        list.add(2, "Frank");

        assertEquals("Zubair", list.get(0));
        assertEquals("Riyaad", list.get(1));
        assertEquals("Frank", list.get(2));

        list.add(1, "Liesl");

        assertEquals("Zubair", list.get(0));
        assertEquals("Liesl", list.get(1));
        assertEquals("Riyaad", list.get(2));
        assertEquals("Frank", list.get(3));

        assertTrue(list.size()==4);
    }


    @Test
    public void testSetElement(){
        list.add(0, "Zubair");
        list.add(1, "Riyaad");
        list.add(2, "Frank");

        list.set(1, "Craig");

        Assert.assertEquals("Zubair", list.get(0));
        Assert.assertEquals("Craig", list.get(1));
        Assert.assertEquals("Frank", list.get(2));
    }

    @Test
    public void testRemoveElement(){
        list.add(0, "Zubair");
        list.add(1, "Riyaad");
        list.add(2, "Frank");

        Assert.assertEquals("Frank", list.remove(2));
        Assert.assertTrue(list.size() == 2);
    }

    @Test
    public void FailTest(){
        fail();
        System.out.println("This is my fail test");

    }
}