/*  this is called method overloading.which means having same method names but different parameters or different data types.
the solution method overloading is came from the problem called the user can pass the values of, 
this choice and that may creates many methods and for every method we need to create an object method overloading came to exist
 that posses same name having different parameters and also accepts different data type values.*/

class Calculator{
    int n=80; // instance variable.
    public int add(int num1, int num2){// local variables
        return num1+num2;
    }
    public int add(int num1, int num2, int num3){
        return num1+num2+num3;
    }
    public double add(double num1, double num2){
        return num1+num2;

    }
}
public class Methodoverload {
   public static void main(String args[]){
    Calculator cal = new Calculator(); // for every class(component) we need to create an object(cal) to intialize the class and its properties (methods).
    int result = cal.add(9,5);// for every int return type there should be print statment inorder to print its return value.
    //System.out.println(result);
    Calculator cal1 = new Calculator();// here we create another object for same class inorder to differentiate that they are different storages in heap
    cal1.n=90;// we can change the value of one object that donot reflect on other obj.
    System.out.println(cal.n);
    System.out.println(cal1.n);

   } 
}
