package com.study;

import java.io.Serializable;

/**
 * Created with Chenquan.
 * Description:
 * Date: 2019-01-04
 * Time: 10:58
 */
public class User implements Serializable{
    /**
     * 序列化与反序列化中的条件：
     * 1、serialVersionUID必须一致 ：序列化失败
     * 2、包名也必须一致 ：json转换的时候失败
     */
    private static final long serialVersionUID = -1L;

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
