package dao;

import org.springframework.stereotype.Component;
@Component
public class AcountDao {
    public void addAccount(){
        System.out.println(getClass()+ " : doing my db work : adding an account");
    }
}
