package RebecasFirstJava;

public class Calculator {
    public  int sum(int n1, int n2) {
        int sum = n1 + n2;
        return sum;
    }
    void suma (double n1, double n2){
        System.out.println(n1+n2);
    }
    public  int impartire(int n3, int n4){
        int impartire=n3/n4;
        return impartire;
    }
    void impartirea (int n3, double n4){
        System.out.println(n3/n4);
    }

    public  int calcul (int x, int y , int z) {
        int calcul = (x + (y * z));
        return calcul;
    }
    void calculul (int x, double y, long z){
        System.out.println(x+(y*z));
    }
    public  int calcul1(int a, int b, int c){
        int calcul1= (((a+b) % c));
        return calcul1;
    }
    void calculation (double a, double b, float c){
        System.out.println((a+b)%c);
    }

}


