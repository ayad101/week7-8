/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

/**
 *
 * @author ayad
 */

import dataaccess.UserDB;
import models.Role;
import models.User;
import java.util.List;

public class UserService {

    private UserDB userDB = new UserDB();

    public User get(String email) throws Exception {
        User user = this.userDB.get(email);
        return user;
    }

    public List<User> getAll() throws Exception {
        List<User> users = userDB.getAll();
        return users;
    }

    public boolean insert(String email, Boolean active, String firstName, String lastName, String password, Role role) throws Exception {
        User user = new User(email, active, firstName, lastName, password, role);
        return this.userDB.insert(user);
    }

    public boolean update(String email, Boolean active, String firstName, String lastName, String password, Role role) throws Exception {
        User user = new User(email, active, firstName, lastName, password, role);
        return this.userDB.update(user);
    }

    public boolean delete(String email) throws Exception {
        User user = new User();
        user.setEmail(email);
        return this.userDB.delete(user);
    }

    /**
     *
     * @return
     */
    public List<User> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}