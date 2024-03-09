package TAHMID_2022521460125;

public class Lab2 {
    public static void main(String[] args) {
        
        System.out.println(comboString("Hello", "hi"));  
        System.out.println(comboString("hi", "Hello"));     
        System.out.println(comboString("aaa", "b"));         
        System.out.println(comboString("ooorrreee", "code"));         
        System.out.println(comboString("lotaile", "codekori"));         
    
        String a="korlam",b="code";
        System.out.println(comboString(a,b));         
    }

    public static String comboString(String a, String b) {
        if (a.length() < b.length()) {
            return a + b + a;
        } else {
            return b + a + b;
        }
    }
}