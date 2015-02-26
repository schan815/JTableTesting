package com.chan.stanley;

public class Student
{
    public static enum Grade {
        A, B, C;
    }
     
    private int id;
    private String name;
    private Grade grade;
    private String union;
    private int num;
 
    public Student(int id, String name, Grade grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        
    }
 
    public int getId()
    {
        return id;
    }
 
    public void setId(int id)
    {
        this.id = id;
    }
 
    public String getName()
    {
        return name;
    }
 
    public void setName(String name)
    {
        this.name = name;
    }
 
    public Grade getGrade()
    {
        return grade;
    }
 
    public void setGrade(Grade grade)
    {
        this.grade = grade;
    }
 
}