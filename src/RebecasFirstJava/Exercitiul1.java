package RebecasFirstJava;

public class Exercitiul1 {

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
    public static int calcul1(int a, int b, int c){
        int calcul1= (((a+b) % c));
        return calcul1;
    }
}


