package question2;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import container.*;
/**
 * The test class ContextTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ContextTest extends junit.framework.TestCase
{
    /**
     * Default constructor for test class ContextTest
     */
    public ContextTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    public void testContext(){
        ApplicationContext ctx = Factory.createApplicationContext("./question2/README.TXT");
        Context context = ctx.getBean("context");
        assertTrue(context.executeStrategy(10, 5)==15);
    }
    
    public void testContext2(){
        ApplicationContext ctx = Factory.createApplicationContext("./question2/README.TXT");
        Context context = ctx.getBean("context2");
        assertTrue(context.executeStrategy(10, 5)==5);
    }
    
    public void testContext3(){
        ApplicationContext ctx = Factory.createApplicationContext("./question2/README.TXT");
        Context context = ctx.getBean("context3");
        assertTrue(context.executeStrategy(10, 5)==50);
    }
}
