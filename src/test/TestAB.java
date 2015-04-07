package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import AB.*;

/**
 * Created by garrus on 15/04/07.
 */
public class TestAB{

    @Test
    public void testAB(){
        AB testAB=new AB();
        System.out.println(testAB.createString(2,0));
        System.out.println(testAB.createString(3,2));
        System.out.println(testAB.createString(5,8));
        System.out.println(testAB.createString(10,17));
        for(int i=0;i<=25;i++) {
            System.out.println(i);
            System.out.println(testAB.createString(10, i));
        }
    }
}
