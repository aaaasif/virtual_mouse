public class Lab2 {
    public static void main(String[] args) {
        
        System.out.println(comboString("Hello", "hi"));  
        System.out.println(comboString("hi", "Hello"));     
        System.out.println(comboString("aaa", "b"));         
        System.out.println(comboString("nunununu", "dudu"));         
        System.out.println(comboString("danakata", "pori"));         
    
        String a="chudi",b="Tore";
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
