package ua.dbase.main;

import org.hibernate.*;
import ua.dbase.dao.impl.UsersDAOImpl;
import ua.dbase.entitis.UsersEntiti;
import ua.dbase.util.HibernateSessionFactory;

import java.util.List;

/**
 * Created by liny on 29.11.15.
 */
public class Start {

    public static void main(String[] args) {
        System.out.println("Hibernate tutorial");

        UsersDAOImpl usersDAOImpl = new UsersDAOImpl();
        usersDAOImpl.sessionStart();
        int maxId ;
        String sql = "SELECT MAX(id_user) FROM users";
        SQLQuery query= usersDAOImpl.sQLQuery(sql);
        String results=String.valueOf(query.list());
        results =results.replace("[","");
        results =results.replace("]","");
        maxId= Integer.parseInt(results);

        System.out.println(maxId);
        maxId=maxId+1;
        int count=maxId+3;
        String name="Nik";
        for (int i=maxId;i<count;i++) {
            //UsersEntiti usersEntiti = new UsersEntiti(i,name+i,"VN"+i,"tt"+i);
            //usersDAOImpl.saveUsers(usersEntiti);
            //System.out.println("Set data--"+usersEntiti.getLogin());
        }
        System.out.println("All - "+usersDAOImpl.usersList());
        System.out.println("id 4 = "+usersDAOImpl.retriveUser(4));
        usersDAOImpl.removeUser(4);
        usersDAOImpl.sessionClose();


    }
}
