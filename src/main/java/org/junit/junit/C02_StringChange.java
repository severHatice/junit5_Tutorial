package org.junit.junit;

public class C02_StringChange {
/*
Verilen bir String'deki ilk iki harf içinde A var ise bunları silen method create ediniz.
AACD->CD
ABC ->BC
AA  ->""
A   ->""
B   ->B
 */
    public String ilkIkiASil(String str){

        if(str.length()<=2){
            return str.replaceAll("A","");
        }

        String str2=str.substring(0,2);
        String str3=str.substring(2);

        return str2.replaceAll("A","")+str3;
    }

}
