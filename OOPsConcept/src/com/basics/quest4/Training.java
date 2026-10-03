package com.basics.quest4;

public class Training {

    public String[] showCourses() {
        System.out.println("Course Details: ");

        String[] courses = {"Java", "Python", "SQL"};

        return courses;
    }

    public void showTrainers(String... names) {
        System.out.println("Trainers List: ");

        for (String name : names) {
            System.out.println(name);
        }
    }
}