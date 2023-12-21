/* static variable is used inorder to remain the same value for every object created.
 * static block is used in order to initialize the static variable as well.
 * and class loads first and then objects gets instantiated.
 * for this we have to create a static block along with a constructor block . 
 * here the class loads first and static block runs first later then constructor block runs only when objects created.
 * if no objects get creates the class doesnot loads and static block not get implemented.
 * we can also implements the static block without object creation using class(class).forname("class name of we created").
 * 
 * here we are also going to discuss about static methods where a static keyword is included.
 * and there is no need of object to call the static method, where we can actually call with class name itself.
 * the nonstatic instance varaibles are not used inside the static method where only static methods are used.
 * the question for y ? beacause instance variables can creates multiple objects where static variable is same for all objects so if we use nonstatic variable then what object does it belongs to hence not used.
 * if we have object reference we can use them .
 */

class Mobile{
    int price;// instance variable
    String brand;
    static String rating;// static variable

    /*  public Mobile()// method of constructor calling in main method.
     {
        int price =50000;
        String brand ="realme";
        System.out.println("this is constructor");
     }

     static
     {
        rating="excellent";
        System.out.println("this is static block");
     }*/

    public void display(){// instance method.
        System.out.println(brand + " : " + price + " : " + rating);
    }

    public static void display1(Mobile mb){//static method. using class reference.
        System.out.println(mb.brand + " : " + mb.price + " : " + rating);
    }
}


/*from starting onwards we are using main method wth static keyword,
 * because if we not use static we need to create object for Static class so the first execution itself start from main method if we not use static 
 * how can it executes,so deadlock situation comes inorder to solve this we simple use static keyword in main method so that no object creation required.
*/
public class Static{
    public static void main(String args[])throws ClassNotFoundException{
        Mobile mb = new Mobile();
        mb.price = 10000;
        mb.brand = "nokia";
        Mobile.rating = "okish";
        
        Mobile mb1 = new Mobile();
        mb1.price = 15000;
        mb1.brand = "realme";
        Mobile.rating = "good";

        Mobile.rating = "Excellent";
        //mb.display();
        //mb1.display();
        Mobile.display1(mb1);//we can directly use class name to call static method.and also call specific object using reference.
    }
}
