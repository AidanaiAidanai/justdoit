package com.company;

import java.util.Arrays;

public class Pupil {
    private String name;
    private int year;
    private int[] age;

    public Pupil(String name, int year,int[]age) {
        this.year = year;
        this.age = age;
        this.name = name;
        System.out.println("it's about the pupil who study in sebat");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int[] getAge() {
        return age;
    }

    public void setAge(int[] age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", age=" + Arrays.toString(age) +
                '}';
    }
}
