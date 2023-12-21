/*method overriding means having same method names with same parameters but the execution statements are different.
 * the child class method overrides the parent class method .
 * method overriding concept is occurs in concept of inheritence only.
 */
class Calc// parent class
{
    public int add(int n1 , int n2)
    {
        return n1 + n2;
    }
}

class AdvCalc extends Calc//child class
{
    public int add(int n1 , int n2)
    {
        return n1 + n2 + 1;
    } 
}

public class Methodoverriding {
    public static void main(String args[]){
        AdvCalc a = new AdvCalc();
        int result = a.add(3,4);
        System.out.println(result);
    }   
}
