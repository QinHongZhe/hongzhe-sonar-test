import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class HelloWorldTest {
    @Test
    public void testFunc(){
        String s = "test";
        assertEquals(s, HelloWorld.testFunc("test"));
    }
}
