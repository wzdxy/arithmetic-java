package com.company.zchi;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import org.omg.CosNaming.NamingContextPackage.NotEmpty;

public class Chapter1 {
    public static void main(String[] argv) {
//        StdOut.println("\n>>>>>> >>>>>> >>>>>> >>>>>> >>>>>> 1.1.1");
//        Q1_1_1();

//        StdOut.println("\n>>>>>> >>>>>> >>>>>> >>>>>> >>>>>> 1.1.2");
//        Q1_1_2();

//        StdOut.println("\n>>>>>> >>>>>> >>>>>> >>>>>> >>>>>> 1.1.3");
//        Q1_1_3();

//        StdOut.println("\n>>>>>> >>>>>> >>>>>> >>>>>> >>>>>> 1.1.5");
//        Q1_1_5();

//        StdOut.println("\n>>>>>> >>>>>> >>>>>> >>>>>> >>>>>> 1.1.6");
//        Q1_1_6();

        StdOut.println("\n>>>>>> >>>>>> >>>>>> >>>>>> >>>>>> 1.1.7");
        Q1_1_7();
    }

    private static void Q1_1_1() {
        StdOut.println((0 + 15) / 2);
        StdOut.println((2.0e-6 * 100000000.1));
        StdOut.println(true && false || true && true);
    }

    private static void Q1_1_2() {
        StdOut.println((1 + 2.236) / 2);             //3.236/2=1.618 (转换为float)
        StdOut.println(1 + 2 + 3 + 4.0);               //10.0
        StdOut.println(4.1 >= 4);                  //true (转换为float)
        StdOut.println(1 + 2 + "3");                 //"33"
    }

    private static void Q1_1_3() {
        int count = 0;
        int[] inputs = new int[3];
        while (!StdIn.isEmpty()) {
            inputs[count++] = StdIn.readInt();
            if (count > 2) break;
        }
        if (inputs[0] == inputs[1] && inputs[1] == inputs[2]) StdOut.println("equal");
        else StdOut.println("not equal");
    }

    private static void Q1_1_5() {
        double x = StdIn.readDouble();
        double y = StdIn.readDouble();
        if (x > 0 && x < 1 && y > 0 && y < 1) StdOut.println(true);
        else StdOut.println(false);
    }

    private static void Q1_1_6() {
        int f = 0, g = 1;
        for (int i = 0; i <= 15; i++) {
            StdOut.println(f);
            f=f+g;
            g=f-g;  //f-g=(f`+g)-g=f`; 0 1 , 1 0 , 1 1 , 2 1 , 3 2 , 5 3 , 8 5 , 13 8 , 21 13
        }
    }

    private static void Q1_1_7(){
        double t=9.0;
        while (Math.abs(t-9.0/t)>.001){
            t=(9.0/t+t)/2.0;
            StdOut.printf("%.5f\n",t);
        }

        int sum=0;
        for (int i=1;i<1000;i++){
            for (int j=0;j<i;j++){
                sum++;
            }
        }
        StdOut.println(sum);


    }


}
