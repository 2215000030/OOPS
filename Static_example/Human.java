package Static_example;

public class Human {
//    all the properties and stuff that is not related to object but related to class itself ,we declared those are static.
//    static properties are common to all objects of a class.
    int age;
    String name;
    static long population;
//    population for all the humans will be same so we make it as static
//    convention is access the static variables by class name.
//    static means we can access static stuff without creating a instance variables of that class.
//    if we call non-static methods and stuff inside the static methods it will throw an error because static means we r without object  but if we r calling non static then from where we will arrange object for that.
//    but inside non-static static stuff is totally fine.
    public static void greet(){
        System.out.println("hello");
//        System.out.println(this.age);
//        static means without object then this will point to what that'swhy it is error.
//        public static void main is static because of same reason.

    }
    Human(){
        Human.population+=1;
//        access by class name.
    }
//    there can only be one public class inside a .java file which must be matched to file name.
//   ✅ One public class per file (filename must match the public class name).
//✅ Multiple non-public classes allowed in the same file.
//❌ Multiple public classes in one file will cause a compilation error.
//✅ Separate files for multiple public classes.


//    Key Points:
//
//    You can have multiple main methods in different classes inside a single file.
//    JVM executes the main method of the class you specify when running java <ClassName>.
//    Each main method is independent; no conflicts occur unless explicitly called from another class.
//    If you don’t specify a class, Java will throw an error because it won’t know which main to execute.



//    ❌ Non-static members (variables & methods) require an object to get memory.
//✅ Static members get memory when the class is loaded, without needing an object.
//📌 If no object is created, non-static members never exist in memory.

//    What is a Static Block?
//
//A static block (also called a static initializer) is a block of code that runs once when the class is loaded into memory.
//It is defined using static { } and is used for initializing static variables or executing code that should run only once.
//    When Does a Static Block Execute?
//    Executes before the main() method.
//    Executes when the class is loaded into the JVM memory.
//    Runs only once per class, no matter how many objects are created.

//    Static blocks execute in the order they appear.
//main() runs after all static blocks.

//    Key Points to Remember
//
//✔ Runs once per class (when class is loaded).
//✔ Executes before main() and constructors.
//✔ Used for initializing static variables and resources.
//✔ Multiple static blocks execute in order.
//✔ Does not depend on object creation.

//    ❌ A top-level class cannot be static.
//✅ Only inner (nested) classes can be static inside another class.
//📌 Reason: A static class must belong to something, but a top-level class is already independent.

}
class Outside{
    static class Test{
        String name;
        static int a=9;
        Test(String name){
            this.name=name;
        }
        static{
            System.out.println("test");
        }
    }
    static{
//        Test a=new Test("lafda");
        System.out.println(Test.a);
    }
//    static int a;
//    int b;
//    static{
//        System.out.println("static block");
//        System.out.println(Outside.a);
////        System.out.println(Outside.b);
//    }

//✅ A static inner class is not automatically loaded with the outer class.
//✅ It gets loaded only when a static member is accessed or an object is created.
//✅ JVM treats the static inner class almost like a separate top-level class.
//✅ Memory for static members is allocated in the Method Area, while non-static members get memory in the Heap only when an object is created.

//🔹 Static variables and static methods are resolved at compile time.
//🔹 Their memory is allocated at class loading time (runtime).
//
//🔹 What is a Singleton Class?
//A singleton class ensures only one instance of the class exists in the JVM at a time.
//It provides a single global access point to that instance.
//🔹 Why Use Singleton?
//✅ Saves memory – Only one object is created.
//✅ Used in shared resources like databases, logging, caching, etc.
//✅ Prevents multiple object creation and ensures data consistency.

    public static void main(String[] args) {
        System.out.println("main");
    }

}
