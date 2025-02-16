package Polymorphism;

public class Shapes {
    void Area(){
        System.out.println("I m in shape");
    }
}
//polymorphism -means many ways to represent
//2 types of polymorphism
//1.compile time(static):achieved by method overloading
//method Overloading:name of function is same but argument,body,return type etc. will be different.
//Constructor overloading is example of this.
//which one will run decide at compile time so this is known as compile time polymorphism.

//2.run-time(Dynamic):achieved by method overriding
//method overriding:everything will be same except body of function.
//Shapes a=new Circle();
//a.Area()
//now what can be accessible depend on type of reference variable and which one will be accessible depend on Object type.
//suppose in above call if Area is not present in Circle class then it should use Area of its parent class and it will definitely be present in parent class because you have create the refernce variable of parent class.
//now which one will run depend on object type and we know that object is created at run time so method overriding happens at run  time.
//that's why it is known as run time polymorphism.
//final methods can not be overridden and final class cannot be Inherited.
//static methods can be inherited but can't be overridden.'

