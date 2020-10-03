package com.example.libclass;

class Person {
    public String name;
    public int age;

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return  this.name;
    }

    Person(){}
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class PersonPrivate {
    public String name;
    private int age;

    public void setAge(int age)
    {
        this.age =age;
    }
    public int getAge(){
        return this.age;
    }

    PersonPrivate(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class Book {
    public String name;
    public String author;
    public float price;
}

public class MyClass2 {
    public static void main(String[] args){
        System.out.println("This is a class for class");

        Person ming = new Person();
        ming.name = "ming";
        ming.age = -12;
        System.out.println(ming.name+":"+ming.age);

        ming.setName("daming");
        System.out.println(ming.getName()+":"+ming.age);

//        Person hua = new Person("hua",11);

        //
        PersonPrivate fang = new PersonPrivate("fang", 15);
//        fang.age = 12;

        // static func and var examples
        System.out.println("PI:"+Math.PI);
        System.out.println("E:"+Math.E);
        System.out.println("cos(pi/2):"+Math.cos(Math.PI/2));
        System.out.println("e(0.0):"+Math.exp(0.0));

        // overload examples
        String s = "Test string";
        int t= (int)'t';
        int n1 = s.indexOf(t);
        int n2 = s.indexOf('t');
        int n3 = s.indexOf("st");
        int n4 = s.indexOf("st", 4);
        System.out.println("indexof:"+n1);
        System.out.println("indexof:"+n2);
        System.out.println("indexof:"+n3);
        System.out.println("indexof:"+n4);


    }
}