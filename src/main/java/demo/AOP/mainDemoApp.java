package demo.AOP;

import dao.AcountDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class mainDemoApp {
    public static void main(String[] args){
        //read spring config file
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(demoConfig.class);

        //get the bean from spring container
        AcountDao theacountDAO = context.getBean("dao.AccountDao ",AcountDao.class);
        //call the business method
        theacountDAO.addAccount();

        //close context
        context.close();
    }
}
