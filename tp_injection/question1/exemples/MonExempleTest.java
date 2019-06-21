package question1.exemples;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import container.*;

/**
 * The test class MonExempleTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MonExempleTest extends junit.framework.TestCase
{
    /**
     * Default constructor for test class MonExempleTest
     */
    public MonExempleTest()
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
    
    public void test_monExemple(){
        ApplicationContext ctx = Factory.createApplicationContext("./question1/exemples/README.TXT");
        MonExemple monExemple = ctx.getBean("calcul");
        assertEquals("15+3 = 18", monExemple.toString());
    }
    public void test_monExemple2(){
        ApplicationContext ctx = Factory.createApplicationContext("./question1/exemples/README.TXT");
        MonExemple monExemple = ctx.getBean("calcul2");
        assertEquals("15-3 = 12", monExemple.toString());
    }
    
    public void test_monExemple3(){
        ApplicationContext ctx = Factory.createApplicationContext("./question1/exemples/README.TXT");
        MonExemple monExemple = ctx.getBean("calcul3");
        assertEquals("15*3 = 45", monExemple.toString());
    }
    
    public void test_monExemple4(){
        ApplicationContext ctx = Factory.createApplicationContext("./question1/exemples/README.TXT");
        MonExemple monExemple = ctx.getBean("calcul4");
        assertEquals("15/3 = 5", monExemple.toString());
    }
}
