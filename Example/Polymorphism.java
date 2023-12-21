/*here we are about to study the polymorphism concept which means having two meanings one is poly = many , morphism = behaviour.
 * let us take an eg of a person who behaves differently at different places like home , school , along with friends. so here we came to know that one person behaves differently accoirding to different places.
 * polymorphism is of two types:
 * compile time(method overloading)(static polymorphism)(Early binding).
 * run time(methods overriding)(dynamic polymorphism)(Late binding).
 * compile time which means we are providing  values at compiling of our java file to class file in the main method execution same like giving different parameters of same method  called as method overloading.
 * run time which means inheritance concept is mustand should otherwise we cannot implement runtime polymorphism.
 * Dynamic Method Dispatch is the one most import topic of polymorphism we going to implement below.
 */


 class A
 {
    public void show()
    {
        System.out.println("In a class");
    }
 }

 class B extends A
 {
    public void show()
    {
        System.out.println("In b class");
    }
 }
  
class C extends A
{
    public void show()
    {
        System.out.println("In c class");
    }
}

class D
{
    public void show()
    {
        System.out.println("In the d class");
    }
}

public class Polymorphism {
    public static void main(String args[]){
        A obj = new A(); 
        obj.show();

        obj = new B();// here reference variable of one class is left hand side and the object creation of other class variable in right hand side.
        obj.show();// same method but the reference decides which class method to call , the priority gives to the right hand assigned class name but on one condition that is it should be extended class of parent class.

        obj = new C();
        obj.show();

        D obj = new D();// this wont works because it is not part of parent class the error occurs saying it is not part of parent class.
        obj.show();
    }
}
