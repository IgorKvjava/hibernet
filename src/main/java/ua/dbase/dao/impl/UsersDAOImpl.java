package ua.dbase.dao.impl;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import ua.dbase.entitis.UsersEntiti;
import ua.dbase.dao.interfaces.UsersDAO;
import ua.dbase.util.HibernateSessionFactory;

import java.util.List;

/**
 * Created by liny on 29.11.15.
 */

public class UsersDAOImpl implements UsersDAO {

   private Session session;
    //Для SQL запроса
    public SQLQuery sQLQuery(String sql){
        SQLQuery query;
        return query = session.createSQLQuery(sql);
    }
    //Старт сесиии БД
    public void sessionStart(){
        session=HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        System.out.println("Start");
    }
    //Закрытие сесии БД
    public void sessionClose(){
        session.getTransaction().commit();
        session.close();
        System.out.println("session Close");

    }
    //Запись данных в таблицу
    public void saveUsers(UsersEntiti user) {
        session.save(user);
    }
    //метод для получения списка
    public List<UsersEntiti> usersList() {
        return session.createQuery("from UsersEntiti").list();
    }
    //удаление по id
    public void removeUser(Integer idUser) {
        if(retriveUser(idUser)!=null){
        UsersEntiti user = (UsersEntiti) session.load(
                UsersEntiti.class, idUser);
        System.out.println("user --- "+user+" --- delete");
        //if (null != user) {
            session.delete(user);
        }
        else System.out.println("user--"+idUser+ "--is apsend");
    }
    //получение даныых по id
    public UsersEntiti retriveUser(Integer idUser) {
        Query q = session.createQuery("from UsersEntiti where idUser = :id");
        q.setLong("id", idUser);
        return (UsersEntiti) q.uniqueResult();
    }
}
