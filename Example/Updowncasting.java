class A{
    public void show(){
        System.out.println("in a show");
    }
}
class B extends A{
    public void show1(){
        System.out.println("in b show");
    }
}

public class Updowncasting {
    public static void main(String args[]){
        double d = 12.3;
        int i = (int) d;
        System.out.println(i);

        A obj = (A) new B();// which (A) implicitily exits we need not to type cast. it's called upcasting means we refering child to parent class.
        obj.show();// here we  can call only show method because reference class a super class and it doesnot even know the child class exists and their nethods.

        B obj1 = (B) obj;// here we are refering the parent class with child class means downcasting.
        obj1.show();
    }
}
