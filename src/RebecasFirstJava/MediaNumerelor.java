package RebecasFirstJava;

public class MediaNumerelor {
    public static void main(String[] args) {
        int rez = SUM(10, 20, 30);
        System.out.println(rez);
    }

         private static int SUM (int a, int b, int c) {
             int SUM=(a+b+c)/3;
             return SUM;

        }
    }



