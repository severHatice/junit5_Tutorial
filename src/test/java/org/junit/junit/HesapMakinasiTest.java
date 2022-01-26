package org.junit.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HesapMakinasiTest {

    @Test
    @DisplayName("sayilari toplar")//kullanici veya yoneticinin bilgilendirilmesi icin teste etiket create eder ve
    //consola print eder
    void topla() {
            assertEquals(3,HesapMakinasi.topla(1,2));
        //   assertEquals(5,HesapMakinasi.topla(1,2));}
    }

    @Test
    @DisplayName("sayilaari carpar")
    void carp() {

        assertAll(()->assertEquals(2.6,HesapMakinasi.carp(2,1.3)),
        ()-> assertEquals(4.8,HesapMakinasi.carp(2,2.4)),
        ()->assertEquals(-2.7,HesapMakinasi.carp(-3,0.9)),
        ()->assertEquals(-18,HesapMakinasi.carp(3,-6))
        );




//        assertEquals(2.6,HesapMakinasi.carp(2,1.3));
//        assertEquals(4.8,HesapMakinasi.carp(2,2.4));
//        assertEquals(-2.7,HesapMakinasi.carp(-3,0.9));
//        assertEquals(-18,HesapMakinasi.carp(3,-6));

    }
}