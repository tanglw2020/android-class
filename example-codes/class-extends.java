package com.example.libextends;

class Person {
    public String name;
    public int age;
    // v2
//    private String name;
//    private int age;
    // v3
//    private String name;
//    private int age;
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return  this.name;
    }
    public void setAge(int age)
    {
        this.age =age;
    }
    public int getAge(){
        return this.age;
    }

    public String move()
    {
        return("Person move anyway");
    }

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    Person(){
//        this.name = "name";
//        this.age = 36;
    }
}

class Student extends  Person{
    private int score;

    public void setScore(int score)
    {
        this.score = score;
    }
    public int getScore()
    {
        return this.score;
    }
    public void printInfo()
    {
        System.out.printf("name:%s age:%d",this.name, this.age);
    }

    public Student(String name, int age, int score) {
//        super(name,age);
        this.score = score;
    }

    @Override
    public String move()
    {
        return("Student move fast");
    }
}

public class MyClass3 {

    public static void main(String[] args) {
        System.out.println("This is a class for extends");

        Person p1 = new Person("SpiderMan",103);
        Student std1 = new Student("Student1",12, 89);
        System.out.println("name: "+std1.getName());
        System.out.println("age: "+std1.getAge());
        System.out.println("score: "+std1.getScore());

        // Override
        System.out.println("std1.move()"+std1.move());
        System.out.println("p1.move()"+p1.move());

        // Polymorphic
        Person p = std1;
        System.out.println("std1.move()"+p.move());
        p = p1;
        System.out.println("p1.move()"+p.move());
//      std3.move();

    }

}