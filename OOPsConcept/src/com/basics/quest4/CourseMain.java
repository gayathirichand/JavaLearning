package com.basics.quest4;


public class CourseMain {

    public static void main(String[] args) {

        Training training = new Training();
        training.showTrainers("Roshan", "Mohan");

        String[] courses = training.showCourses();

        for (String course : courses) {
            System.out.println(course);
        }
    }
}