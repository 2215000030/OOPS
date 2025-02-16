package Inheritance;

//class which extend other class known as child class where as extended class is known as base class.
//we inherit a class by using extends keyword.
public class BoxWeight extends Box {
    int weight;
    public BoxWeight() {
        this.weight = 0;
    }
//    in above example every instance of class boxweight  also has all three properties which every instance of box class have.
//    But when we extends any class we have access to all properties except those declared as private.

//    now the question arises if boxWeight instance have access to l,w,h then it must be initialised from the constructor of boxweight
//    so it is basically done by the super keyword
//    super keyword basically call the constructor of parent class
//    super keyword must be the first statement in the child class constructor.
//    here in upper constructor of box weight we did not call parent constructor using super then it is called bydefault with 0 arguments.
//    internally : super()
    public BoxWeight(int weight,int l,int w,int h) {
        super(l,w,h);
        this.weight = weight;
    }
//    another use case of super keyword is that if we want to access any properties of parent class, can be accessed using super.l.
//    it can also be accessed by this.l but suppose if parent and child class both have same name variables then how to distinguish so child class by this and parent class by super.
    Box box=new BoxWeight();
//    upper declaration is totally fine but you cant access boxweight properties but what you can access depend upon reference variables types and all l,w,h initialised in BoxWeight constructor.
//    BoxWeight boxWeight=new Box();
//    upper is not fine because refernce variable is of boxweight so weight can be accessed but not initialise in Box() constructor.
//    circular inheritance results into error.
//    multiple inheritance is not supports in java.
//    every single class extend object class.
//     A class can not extend more than one class but a class can be inherited by so many classes.

//    final class can not be extended.(so if we want to prevent inheritance make the class final).


}
