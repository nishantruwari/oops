public class C extends B {
    int q;
    {
        q = 0;
    }

    C() {
        super();
        q = 0;

        System.out.println("I am default constructor of C");

    }

    C(int a, int b) {
        // this();
        // this();
        super(a, b);

        System.out.println("I am param of class C");

    }

    C(int a, String s) {
        super(a, s);

    }

}
