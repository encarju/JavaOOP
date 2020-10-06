package model;

public class Student {
    private int age;
    private int idNumber;
    private String gender;
    private String name;

    public Student (int idNumber, String name, int age, String gender){
        this.idNumber = idNumber;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //Getters
    public int getIdNumber(){
        return this.idNumber;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getGender(){
        return this.gender;
    }

    //Setters
    public void setIdNumber(int idNumber){
        this.idNumber = idNumber;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

}
