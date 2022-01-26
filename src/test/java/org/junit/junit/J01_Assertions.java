package org.junit.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

public class J01_Assertions {

    @Test
    @DisplayName("test assort")
    void testToAssert(){
        int actual = "zekeriya".length();
        int beklenen = 8;

//        assertEquals(8,actual);//bu inline style dir. tavsiye edilmez ,degerlerin manuel girilmesi istenmez######interview sorusu
 //      assertEquals(beklenen,actual);
       assertEquals(actual,beklenen,"beklenen ve actual deger esit degil");// virgul atip yorum yazabilirsin
        //##################message hata durumunda print edilir interview sorulur(test failed)

        //1 assertEquals--> pozitif test :expected ve actual durumlarinin esit olmasini test eder esit olmasi halinde test passed olur
        // assertEquals(4,"islam".length(),"inline style tavsiye edilmez ");

        //2 assertNotEquals--> negatif test: expected ve actual durumlarinin esit OLMAMASINI test eder esit olmaMAsi halinde test passed olur
        assertNotEquals(9,actual);

        //3 assertTrue --> pozitif test: olusturulan sart (boolean) true ise test passed olur
        assertTrue(beklenen==actual);//passed
       beklenen=7;
      // assertTrue(beklenen==actual);

       //4 asserFalse--> negatif test : olusturulan sort (boolean) false ise test passed
        assertFalse(beklenen==actual);

    }
    @Test
    @DisplayName("convertupper testi")
    void testConvertUpper(){

        String beklenen = "ABDULLAH";
        String olusan= "abdullah".toUpperCase();
        assertEquals(beklenen,olusan);// test datalari esitse passed

        beklenen= "ABDULLAh";
       // assertTrue(beklenen.equals(olusan));//failed

        assertFalse(beklenen.equals(olusan));//passed//beklenen degerle olusan degerin ayni olmadigini iddia ediyorum

        olusan=null;

       assertNull(olusan,"olusan deger null degil");//burada mesaji failed durumda yazar//passed
        assertNotNull(beklenen);//failed
        olusan="kursat";
        assertNotNull(olusan);//passed

    }

    @Test
    @DisplayName("ToContaines test")
    void testToContaines(){

        boolean olusan = "mustafa".contains("hi");//false  bunlar test verileri
        boolean beklenen= false;
        assertEquals(olusan,beklenen,"string degeri barindirmaz");// passed

    }

    @Test
    @DisplayName("array test")
    void testArray(){
        String str= "javacanlara selam olsun ayaginza das degmesin";
        String olusan[]=str.split(" ");
        String beklenen []= {"javacanlara","sela","olsun","ayaginza","das","degmesin"};//passed
        assertArrayEquals(beklenen,olusan,"agam arraylerin farkli");//passed
        assertArrayEquals(beklenen,olusan,"agam arraylerin farkli");//passed  array contents differ at index [1], expected: <sela> but was: <selam>


    }
}
