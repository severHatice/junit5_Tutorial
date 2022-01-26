package org.junit.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class J03_TestingExceptions {

    /*
   assertThrow() metodu --> belirtilen işlemin (executable) belirtilen türde bir Exception oluşturup oluşturmadığını
   test eder.
       Dolayısıyla 2 parametre alır.
       1. parametre --> expected(beklenen) Exception(istisna) türü,
       2. parametre --> actual(oluşacak)  çalıştırılacak olan işlemdir.
   Eğer işlem belirtilen türde bir exception oluşturursa test başarılı olur.TEST PASSED
   Ama exception oluşmaz ise veya türü yanlış olursa test başarısız olur.TEST FAILED
  TRİCKK : Exception.io türünde parent-child ilişkisi var ise yine test başarılı sayılır.
*/

    @Test
    @DisplayName("NumberFormatException")
    void testException01(){
        String strSayi="1234";
        assertThrows(Exception.class,()->Integer.parseInt(strSayi));//failed
        // String strSayi="123a4";
        //assertThrows(Exception.class,()->Integer.parseInt(strSayi));//fpassed--dynamic
        assertThrows(NumberFormatException.class,()->Integer.parseInt(("571")));//failed dynamic degil
    }

    @Test
    @DisplayName("NumberFormatException")
    void testException02(){
       String str=null;
       String str1="gokhan";
      // assertThrows(NullPointerException.class,()->str.length());//passed dynamic
        assertThrows(NullPointerException.class,()->str1.length());// failed dynamic

    }

    @Test
    @DisplayName("illegalargumentexception test")
    void testException03(){
     //assertThrows(IllegalArgumentException.class,()->yasYazdir(-2));
        assertThrows(IllegalArgumentException.class,()->yasYazdir(12));


    }
    @Test
    @DisplayName("aritmetikexception test")
    void testException04(){
        // assertThrows(ArithmeticException.class,()->bol(5,0));//passed
       // assertThrows(ArithmeticException.class,()->bol(5,1));//failed




    }

    int bol(int a, int b){
        return a/b;

    }
    void yasYazdir(int yas){
        if(yas<0){
            throw new IllegalArgumentException();

        }else System.out.println(yas);
    }
}
