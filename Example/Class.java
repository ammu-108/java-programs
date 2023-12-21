class Calculator{ 
    int a;                              // this is design for an object
    public int add(int n1,int n2){
        int r1 = n1+n2;
        return r1;                              // class contains methods they behave as they created.
    }
    public int sub(int n1 , int n2){
        int r2=n2-n1;
        return r2;
    }
}

public class Class {
    public static void main(String args[]){
        int num1 = 12;                      // here JVM is providing some memory for creating object of our design.
        int num2 = 20;                      // here cal is a reference variable.
        Calculator cal = new Calculator(); // we create an object for our design so called class or calculator
         int result = cal.add(num1,num2); // we pass values to method of created object of the class.
         int result1 = cal.sub(10,30); // we can pass the address of values or direct values.
         System.out.println(result);        //we need to print the return values.
         System.out.println(result1);
    }

    public static void forName(String string) {
    }
    
}
