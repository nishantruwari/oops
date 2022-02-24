
//order of execution Static > init > constructor > method  
public class A {
    int a, b, c;
    String s;
    // init block are always run before constructor and run in order as they are
    // placed.
    // there can be multiple init block in a program.And all will run one by one
    // before constructor whenever object is called.
    // init block >
    {
        this.a = 1;
        System.out.println("Init block" + a);
    }

    // static block only run once when class is loaded in memory.
    // there can be multiple static block in a single class
    // if we are on jdk1.6 or previous we can print something on screen without
    // having main() method but
    // after jdk 1.6 it would throw an error.

    static {
        System.out.println("Static is called here");
    }

    A() {
        a = 0;
        b = c = 0;
        s = "";
        System.out.println("I m default constructor of class A");

    }

    A(int a) {
        this();
        this.a = a;
        System.out.println("I am param constructor of class A");
    }

    A(int a, int b) {
        this(a);
        this.b = b;
        System.out.println("This is second param constructor of class A");
    }

    A(int a, String s) {
        this();
        this.a = a;
        this.s = s;
        System.out.println("I am param constructor of A with int and string ");
    }

}
