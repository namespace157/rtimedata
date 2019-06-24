package com.sdjictec.bqdrtime.rtimedata.entity;

public class UserTest {
    private int id;
    private String username;
    private int age;
    private String sex;

    public UserTest() {
    }

    public UserTest(int id, String username, int age, String sex) {
        this.id = id;
        this.username = username;
        this.age = age;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}