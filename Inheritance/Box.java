package Inheritance;

public class Box {
    int l;
    int h;
    int w;
    Box(int l, int h, int w) {
      super();  /* call the object class constructor*/
        this.l = l;
        this.h = h;
        this.w = w;
    }
    Box(){
        this.l = 0;
        this.h = 0;
        this.w = 0;
    }

}
