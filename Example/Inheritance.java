/*here we are discussing about inheritance concept which means interm we are inheriting the properties of parent class by child class or base class by derived class or super class by sub class.
 * for every .java file after compling the class file is created ,later if we include any classes in this seperate class files are also created.
 * we can include the parent class externally or inthe .java file itself.
 * the structre is child class extends parent class.
 * they may be multi- level inheritance which means child class extends its parent class which may further extends its parent class.
 * if only two classes there then called as single level inheritance.
 * the object is creates for grand child class only which extends all its parent and grand parent class.
 * multiple inheritance is not supported in java because is two parents classes having same method when obj created by child class then which parent class method is to be executed.
 * this is called as multiple ambiguity (confuse state to choose) hence java donot support this. but it may possible by interfaces which not yet discussed.
 */
class Calc//grand parent class
{
    public int add(int n1 , int n2)
    {
        return n1 + n2;
    }
     
    public int sub(int n1 , int n2)
    {
        return n2 - n1;
    }
}

class AdvCalc extends Calc//parent class
{
    public int multi(int n1 , int n2)
    {
        return n1*n2;
    } 

    public int div(int n1 , int n2)
    {
        return n2/n1;
    }
}
class VeryAdvCalc extends AdvCalc // child class
{
    public double power(double n1 , double n2)
    {
        return Math.pow(n1, n2);
    }
}

public class Inheritance {
    public static void main(String args[]){
        VeryAdvCalc c = new VeryAdvCalc();// only creates for grand child class.
        int r1 = c.add(5,9);// actually these are not present in the veryAdvCalc class but presemt in the parent class.so executes
        int r2 = c.sub(3,7);
        int r3 = c.multi(3,4);
        int r4 = c.div(12,6);
        double r5 = c.power(2.0, 3.0);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " "  + r5);
    }
}
