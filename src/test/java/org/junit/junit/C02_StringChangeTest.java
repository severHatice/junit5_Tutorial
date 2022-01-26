package org.junit.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class C02_StringChangeTest {

    C02_StringChange strChange;//class static olmadigindan strchange obje create edildi metod cagirmak icin

    @BeforeEach
    void setUp() {
        strChange=new C02_StringChange();
        System.out.println("test verisi girisi yapildi");
    }

    @AfterEach
    void tearDown() {
        strChange=null;
        System.out.println("test verisi silin di");
    }

    @ParameterizedTest
    @CsvSource(value={"BC,ABC","'',AA","B,B","BCDE,BCDE"})
    void ilkIkiASil(String kirpilmis,String girdi) {

        assertEquals(kirpilmis,strChange.ilkIkiASil(girdi));
      // assertTrue(kirpilmis.equals(strChange.ilkIkiASil(girdi)));
        System.out.println("ilk akis silindi");
    }
}