package org.junit.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class J04_TestingParametric {

    @Test
    void uzunlukSifirdanByk(){

        assertTrue("yildiz".length()>0);
        assertTrue("suleyman".length()>2);//mesela eger burada failed olursa sonrakiler calismaz############
        // bu durum asla tavsiye edilmez..interview sorusu#####################################
        assertTrue("omer".length()>3);
        assertTrue("kursat".length()>4);
    }
    //tekil sart...
    /*
    length() metodu ile asagidaki sartlar icin 0'dan buyuk deger return ettigini test ediniz
    Sartlar: yildiz,suleyman,omer,kursat --> bu datalar testi nasil gecer
     */

    @ParameterizedTest
    @ValueSource(strings = {"yildiz","suleyman","omer","z","kursat"})//failed
   // @ValueSource(strings = {"yildiz","suleyman","omer","kursat"})//passed
    void uzunlukSifirdanBykPrmtrl(String str){// @ValueSource(strings = {"yildiz","suleyman","omer","kursat"}) parametre elemanlari
                                                   //,etoda parametre olarak  donguye girerek run edilir//perde arkasinda calisir
        assertTrue(str.length()>2);
    }

    // COKLU SART -->her parametre elemani key value ikili ile test metodunda run edilir

    @ParameterizedTest
    @CsvSource(value = {"yildiz,YILDIZ","suleyman,SULEYMAN","omer,OMER","kursat,KURSAT"}) //comma-separated values virgulle ayrilmis degerler
    void testBykHrfCvr(String byk, String isim){

        assertEquals(byk,isim.toLowerCase());
    }

    @ParameterizedTest(name="Expected(BUYUKHARF):{0},actual(cevirilecek):{1}")// CsvFileSource syntax
    //belirli bir dosyadan datalari okutarak test icin parametre olarak kullanir
    //src/test/resource klasoru altindaki dosyaya direk ulasir

   @CsvFileSource(resources="/data",numLinesToSkip=1)//direk file in ismiyle giris yapilir
    //1.satir haric verileri parameter olarak test metoduna run eder
    void test(String cevirilecek, String bykHarf){

        assertEquals(bykHarf,cevirilecek.toUpperCase());

    }

}
