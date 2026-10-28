package classSnacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayTest {

    @Test
    public void testShortesWord(){
        Array array = new Array();
        String input = "God is good";
        String expected = "is";
        String actual = array.shortestWord(input);
        assertEquals(expected,actual);
    }

    @Test
    public void testAsecendingOrder(){
        Array array = new Array();
        int[] input = {2,6,5,1,7};
        int[] expected = {1,4,25,36,49};
        int[] actual = array.ascendingOrder(input);
        assertArrayEquals(expected,actual);
    }
}


