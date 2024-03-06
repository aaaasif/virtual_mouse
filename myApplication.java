// package example.week2;

// import java.util.*;
// import java.io.*;

 public class myApplication {

//     public static void main(String[] args){
//     PrintWriter out = new PrintWriter(System.out, true);
//     Vector<String> v = new Vector<String>();
//     for(int i=0;i<args.length;i++){
//         v.add(args[i]);

//     }


//     out.println(v);
// }
// }



//public class DecimalToHexadecimal {
//     public static void main(String[] args) {
//         String literals = "0123456789ABCDEF";
//         int a = 10; 
//         int c=32;
       
//         StringBuilder b = new StringBuilder();
//         StringBuilder d = new StringBuilder();

//         System.out.println("("+a+")_10==("+b+")_16");
//         System.out.println("("+c+")_10==("+d+")_16");
//     }
// }

//public class DecimalToHexadecimal {
    public static void main(String[] args) {
        String literals = "0123456789ABCDEF";
        int a = 10;
        int c = 32;

        StringBuilder b = decimalToHexadecimal(a);
        StringBuilder d = decimalToHexadecimal(c);

        System.out.println("(" + a + ")_10 == (" + b + ")_16");
        System.out.println("(" + c + ")_10 == (" + d + ")_16");
    }

    private static StringBuilder decimalToHexadecimal(int decimal) {
        String literals = "0123456789ABCDEF";
        StringBuilder result = new StringBuilder();

        while (decimal > 0) {
            int remainder = decimal % 16;
            result.insert(0, literals.charAt(remainder));
            decimal /= 16;
        }

        if (result.length() == 0) {
            result.append("0");
        }

        return result;
    }
}
