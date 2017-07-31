package com.company.zchi;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

public class Main {
    public static void main(String[] args) {
        int[] a={1,2,3};
        StdOut.println(a);
        StdDraw.line(0,1,0.4,0.4);
    }

    private static int gcd(int p,int q){
        if(q==0)return p;
        int r=p%q;
        return gcd(q,r);
    }

    private static int[] test(int[] a){
        a[3]=0;
        return a;
    }


}


