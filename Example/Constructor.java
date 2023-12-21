/*here the need of constructor is defines that for every object creation it got created in heap memory, for every method stack got created.
 * before the values got assigned , the default value for integer will be zero and the string type will be null.
 * the constructor are created to display the default values for our instance variables.
 * before assigning values to the instance variables once the object got created the default value turns to 0 or null.
 * the constructor are created to assign the default values so that it defines the minimum criteria to enter the application.
 * the constructor looks like a method having (), and there is no return type and the name itself the class name.(eg: public Human()) which called as default constructor.
 * when we want to perform any operation its better to do in methods rather than dont do openly just by assigning values of them in public.
 * when ever we want to connect with the data base , the connection activity happens in the constructor block itself.
 * the java itself creates constructor for us even if we not creates them previously.
 */
class Human{
    private int age;
    private String name;

    public Human()// constructor name is like class name only.
    {
        age = 26;
        name ="sri charan";
        System.out.println("this is constructor block");// for every object creation the constructor block is called first.
    }

    

    public Human(int age, String name) {            // parameterized constructor which states that constructor overloading which mean same name but different parameters.
        this.age = age;
        this.name = name;
    }



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

public class Constructor {
    public static void main(String args[]){
        Human obj = new Human();
        //System.out.println(obj.getName() + " : " + obj.getAge());// we write before assigning hence default values got assigned.
        obj.setAge(21);
        obj.setName("Durga Devi");
        Human obj1 = new Human(26 ,"x");// for every new object creation constructor called.
        System.out.println(obj1.getName() + " : " + obj1.getAge());
    }
    
    
    
}










