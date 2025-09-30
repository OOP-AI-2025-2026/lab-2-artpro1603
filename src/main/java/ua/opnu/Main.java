package ua.opnu;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Іван Шевченко", 2);

        student.addCourse("ООП");
        student.addCourse("Вища математика");
        student.addCourse("Фізика");
        student.addCourse("Українська мова");

        System.out.println(student.getName() + ": кількість вивчаємих дисциплін - " + student.getCourseCount());
        System.out.println(student.getName() + ": рік навчання - " + student.getYear());
        System.out.println(student.getName() + ": заплатив за навчання - " + student.getTuition());
    }
}