package service_locator;

import container.*;


public class ServiceLocatorTests extends junit.framework.TestCase{

    public void testServiceLocator() throws Exception{
        ApplicationContext ctx = Factory.createApplicationContext("./service_locator/README.TXT");
 
        ServiceLocatorI serviceLocator = ctx.getBean("serviceLocator");

        System.out.println("Liste des services accessibles: ");
        for(String service : ctx){
            System.out.println("\t" + service);
        }
        System.out.println("------------------------------------------------");
        for(String service : serviceLocator){
            System.out.println("\t" + service);
        }
        
        question1.exemples.Table table = serviceLocator.lookup("table");
        table.ajouter(33);table.ajouter(33);
        assertEquals(2,table.taille());
        
        question2.Context context = serviceLocator.lookup("context");
        assertTrue(context.executeStrategy(10, 5)==15);
        
        question2.Context context2 = serviceLocator.lookup("context2");
        assertTrue(context2.executeStrategy(10, 5)==5);
        
        question2.Context context3 = serviceLocator.lookup("context3");
        assertTrue(context3.executeStrategy(10, 5)==50);
    }
    
   
}
