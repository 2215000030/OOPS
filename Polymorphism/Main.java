package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes a=new Shapes();
                a.Area();
                Circle circle=new Circle();
                circle.Area();
                Shapes b=new Circle();
                b.Area();
    }
}
