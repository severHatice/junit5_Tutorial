package org.junit.junit;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class J06_TestingPerformance {

    @Test
    void performance(){//iddia ediyorum ki bu metod 2 saniyede calissin//performans kontrlu
       // assertTimeout(Duration.ofSeconds(2), ()->IntStream.rangeClosed(0,1000000).sum());//akistaki 1 ile 100 arasinda ki sayilari topla
       // assertTimeout(Duration.ofSeconds(2), ()->IntStream.rangeClosed(0,100000).forEach(System.out::print));
       // assertTimeout(Duration.ofSeconds(2), ()->IntStream.rangeClosed(0,100000)).forEach(System.out::print);
        //ustte print asset.. dahil degil bundan dolayi sorgu daha hizli olur
        assertTimeout(Duration.ofMillis(1),()-> LongStream.rangeClosed(0,100000)).forEach(System.out::print);
    }

}
