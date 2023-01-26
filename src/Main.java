public class Main {
    public static void main(String[] args) {
        //Tasks 1-4
        byte a = 2;
        byte b = 10;
        System.out.println(a);
        System.out.println(b);

        short c = 12;
        short d = 25;
        System.out.println(c);
        System.out.println(d);

        int e = 152;
        int f = -2714;
        System.out.println(e);
        System.out.println(f);

        long g = 148961L;
        long h = 54815881L;
        System.out.println(g);
        System.out.println(h);

        //Task5
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        //Tasks 6-9
        float j = 224.15f;
        float k = 2651.5188f;
        System.out.println(j);
        System.out.println(k);

        double l = 158.658;
        double m = 187.32329;
        System.out.println(l);
        System.out.println(m);

        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);

        //All the values can be only  asigned to "double" and can be used with "float" only after adding "f" after the value

        //Tasks 10-11
        char n = 'n';
        char o = 'o';
        System.out.println(n);
        System.out.println(o);

        //Tasks 12-13
        boolean p = true;
        boolean q = false;
        System.out.println(p);
        System.out.println(q);

        //13 the value of year is long, but is required to be int

    /*18
        long max = 3123456789; (exceed the range)
        double d = 1000_.00; ('_' can not be used)
        char i =’i’; char j=’j’; char ij = i +j; (addition must be done with casting)
        int 7a = 8; (variable name does not match JavaBean Conventions)
        long h = h  + 8;(correct)
        int n, m = 11; m = n; (must get values seperately)

         */

        //Tasks 14-17

        //Automatic Widening Casting
        int aa = 7;
        long bb;

        bb = aa;
        System.out.println(bb);

        //Automatic Widening Casting
        int myInt = 7;
        double myDouble;
        myDouble = myInt;
        System.out.println(myDouble);

        //Manual Narrowing Casting
        double dd = 9.78d;
        int ii ;
        ii = (int) dd;
        System.out.println(ii);

        //Manual Narrowing Casting
        int ff = 9999;
        byte gg;
        gg = (byte) ff;
        System.out.println(gg);


    }


}