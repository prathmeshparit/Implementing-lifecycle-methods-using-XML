package dev.prathmesh.app;

public class Student
{
    private int id;
    public Student(){}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }

    public void init()
    {
        System.out.println("Student initialized");
    }

    public void destroy()
    {
        System.out.println("Student Destroyed");
    }

}
