/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;

/**
 *
 * @author ayad
 */
public class Role implements Serializable {

    private int id;
    private String name;
    private int roleId;
    private String roleName;

    public Role() {

    }

    public Role(int id, String name) {
        this.id = id;
        this.name = name;

    }

    /**
     *
     * @param roleId
     * @param roleName
     */
    public Role(int roleId, String roleName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.roleId = roleId;
        this.roleName = roleName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}