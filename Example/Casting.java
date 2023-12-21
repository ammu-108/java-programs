class Casting{
    public static void main(String args[]){
        int a= 12;
        int c= 259;
        byte b =(byte)c;
        System.out.println(b);//if range crosses modulus function been implemented.
        float f = 12.3f;
        int w =(int)f;
        System.out.println(w);// it cuts the pointed values.
        byte q=10;
        byte x=20;
        int result = q*x;
        System.out.println(result);//here type promotion happens even we multiply byte the value ranges out of the range value so it got promoted.
        
    }
}