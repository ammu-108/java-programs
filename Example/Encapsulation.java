/*here we are dicussing about encapsulation which means binding data with  methods.
 * the term encapusulation is used beacause to restrict the outsiders to access our data variables only way is to privitize them'
 * later getName method is used to fetch the them which were declared inside the same class.
 * and we can create an object and we call the method using object reference.
 * we can also initiallize values using set method inside the class so that using object reference we set values to private variables in main method.
 * we assigning values using methods and getting values using methods using private keyword as it is restricted to others.but can accesible inside the class methods.
 * here we are encapsulating methods with data.i.e. binding private variables to methods.
 * 
 * here we also discussed about getter and setter methods which are helpful for getting a value and setting a value.
 * this keyword is used in setmethod so that we need not to use another local variable "a" which refers to same object.
 * dont create object and pass object to set method i will create just use the this keyword.
 * this is a keyword which refers to the current object, which means the object calling the methods(here the obj calls set method).
 */
class Human{
    private int age;
    private String name;

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
}

public class Encapsulation {
    public static void main(String args[]){
        Human obj = new Human();
        obj.setAge(13);
        obj.setName("durgadevi");
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
    
    
    
}
