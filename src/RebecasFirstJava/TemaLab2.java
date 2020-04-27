package RebecasFirstJava;

public class TemaLab2 {

    public static void main(String[] args) {
        int rezultat = sum(23, 33);
        System.out.println(rezultat);

        int rezultat1= impartire(30,5);
        System.out.println(rezultat1);

        int rezultat2= calcul(-5, 8, 6);
        System.out.println(rezultat2);

        int rezultat3= calcul1(55, 9, 9);
        System.out.println(rezultat3);
    }

    public static int sum(int n1, int n2) {
        int sum = n1 + n2;
        return sum;
    }
    public static int impartire(int n3, int n4){
        int impartire=n3/n4;
        return impartire;
    }
    public static int calcul (int x, int y , int z) {
        int calcul = (x + (y * z));
        return calcul;
    }
    public static int calcul1(int a, int b, int d){
        int calcul1= (((a+b) % d));
        return calcul1;
    }
    //////////////////////////////////////////////////

    public static class RestulImpartirii {
        public static void main(String[] args) {
            int a=15, b=4;
            int rez=(a%b);
            System.out.println("Restul impartirii este " +rez);
}}
    ////////////////////////////////////////////////

    public static class MediaNumerelor {
        public static void main(String[] args) {
            int rez = SUM(10, 20, 30);
            System.out.println(rez);
        }

        private static int SUM (int a, int b, int c) {
            int SUM=(a+b+c)/3;
            return SUM;

        }
    }
    //////////////////////////////////////////////////

    public static class Java {
        public static void main (String[] args) {
            System.out.println ("    J         a      v        v       a       ");
            System.out.println ("    J      a    a    v        v    a     a    ");
            System.out.println("J    J      aaaaa       V   V        aaaaa      ");
            System.out.println("  JJ       a      a       V         a     a     ");
        }}

        ///////////////////////////////////////////////
        public static class Celsius {
            public static void main(String[] args) {
                // C = 5/9 * (F -32)
                float grade= C(60);
                System.out.println(grade);
            }
            public static float C( int f){
                float C =(f-32)*5/9;
                return C;
            }
        }
    ////////////////////////////////////////////////

    public static class Ilustratie {
        public static void main(String[] args) {
            System.out.println(" +\"\"\"\"\"+");
            System.out.println("[| o o |]");
            System.out.println(" |  ^  |");
            System.out.println(" | '-' |");
            System.out.println(" +-----+");

        }
    }
    ////////////////////////////////////////////
    public static class Viteza {
        public static void main(String[] args) {
            int marime =m(10);
            System.out.println(marime);
        }
        public static int m(int Viteza){
            int m= 10*40; //1 inch =40 m
            return m;
        }
    }

}


