package main;

/**
 * Created by SerP on 27.03.2016.
 */

interface A {

    int sum(int x, int y);

}
class B implements A{

    public int diff(int x, int y){return x - y;}

    public int sum(int x, int y){return x + y;}

}

class C extends B{

    public int mult(int x, int y){return x * y;}

    public int diff(int x, int y){return y - x;}

}


    class M {
        public static void main(String[] args) {
            A aB = new B();

            A aC = new C();

            B bB= new B();

            B bC= new C();

            C cC = new C();


            if (bC.diff(1, 2) == 1)
                System.out.println("true bC");
            /*
            if (aB.diff(1, 1) == 0)
                System.out.printf("aB");
            if (bC.mult(2, 2) == 4)
                System.out.printf("bC");
                */
            if (bB.diff(1, 2) == 1)
                System.out.println("true bB");
            if (aC.sum(1, 1) == 2)
                System.out.println("true aC");

        }
    }


