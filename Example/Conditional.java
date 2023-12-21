import javax.lang.model.util.ElementScanner14;

public class Conditional {
    public static void main (String args[]){
        /*int x= 10;
        int y= 300;
        int z= 45;
        if(x>y && x>z)
            System.out.println(x);
        else if(y>z)
            System.out.println(y);
        else
            System.out.println(z);*/
        // ternary operators
        /*int n=4;    
        int result =0;  
        result = n%2==0 ? 10 : 20 ;
        System.out.println(result);*/
        // switch conditions
        int n = 7;

        switch(n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("invalid day");
        }


    }
}
