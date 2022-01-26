package org.junit.junit;

import org.junit.jupiter.api.*;

import java.lang.annotation.Repeatable;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class J05_TestRepeatedDisable {

    @AfterEach
    void aftermetod(){
        System.out.println("after calisti");
        System.out.println("********");
    }

    @BeforeEach
    void beforemetod(){
        System.out.println("before calisti");
        System.out.println("*********");
    }

    @RepeatedTest(5)
    @Test
    @DisplayName("ToContaines test")
    void testToContain(){

        boolean olusan = "mustafa".contains("hi");//false  bunlar test verileri
        boolean beklenen= false;
        assertEquals(olusan,beklenen,"string degeri barindirmaz");// passed
        System.out.println("contains test calisti");

    }
@RepeatedTest(7)
@DisplayName("topla test 7 kez run edilir")
    void topla(){
        assertEquals(5,(2+3));
    System.out.println("topla test acildi");
}
@Disabled//ignore etmek istedigin metodun ustune eklersin
@Test
    void disablemetod(){
   String str="yasasin";
   assertEquals(28,str.length());
}

}
