import java.util.*;
public class Intro {
    public static void main(String[] args) {
        Car bmw=new Car(20000,"blue",4);
        System.out.println(bmw.price+" "+bmw.color+" "+bmw.seats);
        bmw.changeprice(30000);
        System.out.println(bmw.price+" "+bmw.color+" "+bmw.seats);
        Car audi=new Car(bmw);
//        Car swift=new Car("blue",5,6);
//        upper object creation is invalid because in place of String we can't pass integer.
        System.out.println(audi.price+" "+audi.color+" "+audi.seats);

//        when you create any object it made int heap memory and its referencing variable is in stack memory.
//        by default value of object is null;
    }
}
class Car{
    int price;
    String color;
    int seats;
    public void changeprice(int price){
       price=price;
//       here unable to identify which price you r talking about so it treat it as price=price ,so it does not change.
    }
    Car(int price,String color,int seats){
        this.price=price;
        this.color=color;
        this.seats=seats;
    }
//    constructor in which copying value from other object.
    Car(Car old){
        price=old.price;
        color=old.color;
        seats=old.seats;
    }
    Car(){
//        this is how you call other constructor from one.
//        internallt:new Car(x,y,z)
        this(1000,"red",1);
    }
//    primitives are stored in stack memory while objects are in heap memory.

}
