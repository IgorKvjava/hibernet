package ua.dbase.dao.interfaces;

import ua.dbase.entitis.UsersEntiti;

import java.util.List;

/**
 * Created by liny on 29.11.15.
 */
public interface UsersDAO {
    public void saveUsers(UsersEntiti user);
    public List<UsersEntiti> usersList();
    public void removeUser(Integer idUser);
    public UsersEntiti retriveUser(Integer idUser);
}
