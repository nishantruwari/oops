public class B extends A {
    B() {

    }

    static {
        System.out.println("Static block of B");
    }

    B(int a, int b) {
        super(a, b);
        System.out.println("I am param of B");

    }

    B(int a, String s) {
        super(a, s);
        System.out.println("I am param 2 of B");
    }

}
