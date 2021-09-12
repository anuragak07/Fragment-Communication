package com.masai.fragmentcommunication;

import java.io.Serializable;

public class Model implements Serializable {
    private String Name;
    private int Age;
    private String Percentage;
    private String Grade;

    public Model(String name, int age, String percentage, String grade) {
        Name = name;
        Age = age;
        Percentage = percentage;
        Grade = grade;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public String getPercentage() {
        return Percentage;
    }

    public String getGrade() {
        return Grade;
    }
}
