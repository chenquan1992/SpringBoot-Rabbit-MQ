package com.study;

import java.io.Serializable;

/**
 * Created with Chenquan.
 * Description:
 * Date: 2019-01-04
 * Time: 10:58
 */
public class User implements Serializable{


    private static final long serialVersionUID = 3663745782061251209L;
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
