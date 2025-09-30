package ua.opnu;

import java.util.ArrayList; // для використання ArrayList
import java.util.List; // для використання List

public class Student {
    private String name;
    private int year;
    private List<String> courses;

    public Student(String name, int year ) {
    if (name == null || name.isBlank()) {
        throw new IllegalArgumentException("Ім'я не має бути пустим");
    }
    if (year < 1 || year > 4) {
        throw new IllegalArgumentException("Рік навчання має бути від 1 до 4");
    }
    this.name = name;
    this.year = year;
    this.courses = new ArrayList<>();
    }

    public void addCourse(String courseName) {
        if (courseName != null && !courseName.isBlank()) {
            courses.add(courseName);
        }
    }

    public void dropAll() {
        courses.clear();
    }

    public int getCourseCount() {
        return courses.size();
    }

    public String getName() {
        return name;
    }

    public int getTuition() {
        return year * 20000; // 20000 - вартість навчання за 1 рік
    }

    public int getYear() {
        return year;
    }
}
