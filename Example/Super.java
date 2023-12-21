/* in this file we are going to discuss about super keyword and this keyword. 
 * when we create an object it calls the respective class constructor. if it is subclass it also calls the constructor of super class first later subclass.
 * this is happens when in case of default constructors.
 * we we pass the value in object creation the it display default of super class and parameterized of sub class.
 * every class in java extends the super class called object class which is default one by java .we need not to mention them explicitily. which has so many methods.
 * here b class extends a but not both a and object it is a mutilevel inheritence not multiple.
 * if we want  both constructors of B and default one of A. we need to use this keyword in the parameterized constructor of B.
*/

class A
{
    public A()//default
    {
        super();//inbuilt method of every constructor we given explicitily
        System.out.println(" in a");
    }

    public A(int n)//parameterized
    {
        super();//inbuilt
        System.out.println(" in a int");
    }
    
}
class B extends A
{
    public B()//default
    {
        super();//inbuilt here we provides the value as parameter which refers to the parameterized constructor of super class.
        System.out.println(" in b");
    }
    
    public B(int n)//parameterized
    {
        //super(5);//inbuilt, so here it calls the super class constructor which is default one. if we pass the parameter then it calls parameterized constructor of super class.
        this();// which refers to excecute the constructor of current class , i.e. default constructor of class B which inturn calls default of super class.
        System.out.println(" in b int");
    }
}
public class Super {
    public static void main(String args[]){
        B obj = new B(5);// after executes it calls constructor of class b which is parameterized only we provides the parameter.
        //B obj = new B();// here it calls the super class of default one.
    }
    
}
