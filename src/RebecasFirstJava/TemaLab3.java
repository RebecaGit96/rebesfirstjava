package RebecasFirstJava;

public class TemaLab3 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        int n1;
        int n2;
        int sum = c.sum(23, 33);
        System.out.println(sum);

        int n3 = 30;
        int n4 = 5;
        int impartire = c.impartire(n3, n4);
        System.out.println(impartire);

        int x = (-5);
        int y = 8;
        int z = 6;
        int calcul = c.calcul(x, y, z);
        System.out.println(calcul);

        int a = 55;
        int b = 9;
        int d = 9;
        int calcul1 = c.calcul1(a, b, d);
        System.out.println(calcul1);


           }}