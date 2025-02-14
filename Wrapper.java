public class Wrapper {
    public static void main(String[] args) {
//        when we make primitive to classes known as wrapper class
//        int--Integer
//        long--Long
//        with the help of this we can manipulate function and stuff on primitives.
Integer num=54;


//if a variable is declared as final we cant reassign it.
        final int a=86;
//        a=98;
        final int b;
        b=6;
        System.out.println(b);
//       in above example a can't be reassign and will be constant.
//        but in case of object we cant reassign object but we can change property related to it which are not declared final inside the declaration of class.
        final StringBuilder str=new StringBuilder("cbrhvbhbv");
        str.deleteCharAt(4);
        System.out.println(str);
//        str=new StringBuilder("rnvr");

    }
}
class Section {
    final int students = 10;
//    it must be initialised because it cant be  changed that's why final.
//@Override
protected void finalise() throws Throwable{
    System.out.println("memory get free");
}
//when object dwstruction happens in java(done automatically) you can specify what should be done when it happens by simply overriding the finalise method.
}