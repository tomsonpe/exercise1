package AssignmentTp3;

import junit.framework.Test;
import junit.framework.TestCase;
import java.lang.*;


import java.lang.annotation.Annotation;
import junit.framework.TestSuite;


/**
 * Unit test for simple App.
 */
import java.util.ArrayList;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{

    App obj1 = new App();

    public void testInt() throws Exception {

        assertEquals(obj1.calInteger(1,2),3);
    }

    public void testFloat() throws Exception {
        assertEquals(obj1.calculateFloat(1.3,2.4),3.7);
    }

    public void testNotNull() throws Exception {
        ArrayList list=App.notNullFunction(0);
        assertNotNull(list);
    }

    public void testNull() throws Exception {
        ArrayList list= new ArrayList();
        list=App.nullFunction(7);
        assertNull(list);
    }
    public void testFail() throws Exception {
        assertFalse(obj1.failMessage(32,34));
    }




   /*@Test(timeout=12)
    public void testTime() throws Exception
    {
        assertEquals(obj1.time(5),1);
    }
    @Test(expected=ArithmeticException.class)
    public void testException() throws Exception
    {
        assertEquals(obj1.exception(5,0),1);
    }
*/

}
