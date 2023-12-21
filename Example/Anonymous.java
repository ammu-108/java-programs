/*here we are discussing about naming Convention.
 * camel casting....
 * for classes and  interface  we use Example or Solution . (capital starting letter).
 * for variables and methods  we use example, marks , a, methods() example()  (small letters for variables followed by = value;).
 * constants  PIE, MATH, SUM,...(only capitals).
 * constructors Human() (it is method bcz of () and capital letter starting which is of class name).
 * for adding two or more name we simply use like firstSecondThird which means capitalize every word or we can also use all small letters or - between them which is of another language, but we can use.
 * for every time object created in heap of jvm.
 * for every methods stack memeory are created, actually the when the object creates  it is called as reference variable holding value of address where it is placed in the heap memory.
 */

 class A 
 {
    public A()
    {
        System.out.println("the object created");
    }
    public void show()
    {
        System.out.println(" in the show method");
    }
 }
 public class Anonymous {
    public static void main(String args[]){
        //int marks;
        //marks=90;
        //actually in this object creation two steps are performed one is declaration and assigning value.
       // A obj;//declare
        //obj=new A();// assigning 
       // A obj = new A();//reference object creation means we provide name called obj for object creation
        new A().show();// we directly call methods after object creates. // we can also creates object with out previous statement this is called as anonymous object creation.(no name).but we can methods simply using like 
        //obj.show();
    }
    
}
