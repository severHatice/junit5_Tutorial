package org.junit.junit;

import java.util.Arrays;

public class C03_ArrayEsitMi {

    // iki arrayin esitligini kiyaslayan metod creat ediniz

    public static boolean arrayKiyasla(Object [] a, Object[] b){
        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a,b);
    }
}
