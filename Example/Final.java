/* here we are discussing about the final keyword which means it can be used infront of - variable, class, method .
 * once we make our variables final we cannot try to change them .
 * in c++ we use the word called CONSTANT but in java we have the keyword called final.
 * final used in methods used to stop method overriding problem.
 * 
 * here let us have glimpse on object class which is the default super class of our class in the program.
 * object class has many methods in them like .equals  ,  .toString  ,  hashcode if we dont declare them in our defined class they execute according to the java inbuilt.
 * if we mention the same methods in our class then what methods we creates only executes not the object class methods.
 * we can directly get code from sourcecode option provided by ide automatically.
*/
class A{
    public final void show(){
        System.out.println("by durga");
    }
    public void plus(int n1 , int n2){
        System.out.println(n1 + n2);
    }
}
class B extends A{ // if we use final before the parent class then it cannot be extended by other classes.
    public void show()// cannot override method which is final in the parent class.
    {
        System.out.println("by devi");
    }
}
public class Final {
    public static void main(String args[]){
        //final int a = 12;// final variable
        int a= 4;
        System.out.println(a);
        A obj = new B();
        obj.plus(8,6);
        obj.show();
        
    }
}
