package com.timbuckalka.mylibary;

/**
 * Created by dev on 5/11/2015.
 */
public class Series {

    public static long nSum(int n) {
        return (n * (n + 1)) /2;
    }



    public static long factorial(int n) {
        if(n == 0) {
            return 0;
        }
        long fact = 1;
        for (int i=1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }



    public static long fibonacci(int n) {
        if(n == 0) {
            return 0;
        } else if(n == 1) {
            return 1;
        }
        long nMinus1 = 1;
        long nMinus2 = 0;
        long fib = 0;
        for(int i= 1; i<n; i++) {
            fib = (nMinus2 + nMinus1);
            nMinus2 = nMinus1;
            nMinus1 = fib;
        }
        return fib;
    }
}


// Series class generated in com.timbuchalka.mylibrary package when naming new class in form
// "com.timbuchalka.mylibrary.Series"
// wrotee all the necessary methods in the Series class and tested with main method and then deleted Main.
// file --> project struture --> atrtifacts --> "+" --> JAR --> from modules with dependencies --> leave main empty and press ok -->
    // build --> built artifact --> Build
    // finder --> documents --> PackagesChallenge --> out --> packageChallenge and there is the java file we built

//wheen importing the class to another project: file --> project strucuture -> libaries --> "+" --> java --> go into documents and
// unfortanately scroll manually since the seach features doesn't appeaer to be finding any folder names --> find thee PackagesChallenge
// foldeere --> out --> artifacts --> click the file and add it. --> external libraries in main side bar and see that the class got added

