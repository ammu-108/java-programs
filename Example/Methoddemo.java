class Car{
    public String modelType(){
        return "This is XUV 500 high and model";
    }
    public void milageValue(int hr){
        if(hr==5)
            System.out.println("450km");
        else if(hr<5)
            System.out.println("lessthan 350km");
        else 
            System.out.println("Morethan 450km");
    }
    public void color(){
        System.out.println("Red");
    }
    public int cost(){
        return 50_00_000;
    }
}


public class Methoddemo {
    public static void main(String args[]){
        Car c = new Car();
        String value = c.modelType();
        System.out.println(value);
        c.milageValue(7);
        c.color();
        int x = c.cost();
        System.out.println(x);
    }
}
