package io.zipcoder;

/**
 * Created by roberthitchens3 on 1/28/16.
 */
public class Human {
    private String name;
    private int age;
    private String gender;
    private String occupation;
    private String address;

    public Human(String name, int age, String gender, String occupation, String address){
        this.name =name;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;
        this.address = address;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }
    public String getOccupation(){
        return occupation;
    }
    public String getAddress(){
        return address;
    }
    public void printInformation(){
        System.out.println("Name: "+name +"\n" + "Age: " + age + "\n" +"Gender: " +"\n" +"Occupation: " + occupation + "\n"+"Address: "+address);
    }

}
