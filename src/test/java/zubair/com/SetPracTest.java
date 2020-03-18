package zubair.com;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class SetPracTest {

    private Set<Integer> numbers;

    @Before
    public void setUp() throws Exception {
        numbers = new HashSet<>();

    }
    @Test
    public void testListInit(){
        assertTrue(numbers.isEmpty());
        assertTrue(numbers.size() == 0);
    }

    @Test
    public void testAddElements(){
        numbers.add(50);
        numbers.add(1);
        numbers.add(280);


        assertEquals(numbers.contains(50), true );
        assertEquals(numbers.contains(1), true);
        assertEquals(numbers.contains(280), true);

        numbers.add(685);

        assertEquals(numbers.contains(50), true );
        assertEquals(numbers.contains(1), true);
        assertEquals(numbers.contains(280), true);
        assertEquals(numbers.contains(685), true);

        assertTrue(numbers.size()==4);
    }


    @Test
    public void testRemoveElement(){
        numbers.add(50);
        numbers.add(1);
        numbers.add(280);

        Assert.assertEquals(numbers.remove(50) , true );
        Assert.assertTrue(numbers.size() == 2);
    }

    @Test
    public void FailTest(){
        Assert.fail("FailTest Reached");
       // System.out.println("This is my fail test");

    }
}