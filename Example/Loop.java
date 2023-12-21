public class Loop {
    public static void main(String args[]){
        /*int i = 2;
        while(i<6)
        {
            System.out.println("hello " + i);
            i++;
        }
        System.out.println("THANKYOU LOOP");*/
        // nested while as like day and hours in a week
        /*int i = 1;
        while(i<8)
        {
            System.out.println("day " + i);
            int j= 1;
            while(j<25)
            {
                System.out.println("time is " + j%100);
                j++;
            }
            i++;
        }
        System.out.println("Days completed");*/
        // do- while statements
        /*int i =4;
        do{
            System.out.println("Hello friends");
            i--;
        }
        while(i>3);*/
        //nested for loops
        for(int i=1;i<=7;i++){
            System.out.println("day "+ i);
            for(int j=9;j<j+9;j++){
                System.out.println("hour "+j +  " -" + "hour "+(j+1));
            }
        }
    }
}
