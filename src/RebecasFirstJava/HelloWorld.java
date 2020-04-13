package RebecasFirstJava;

public class HelloWorld {
    public static void main(String args[]){
        System.out.println("Hello");
        System.out.println("Rebeca");
        int sum, n1=23, n2=33;
        sum=n1+n2;
        System.out.println("suma este " +sum);
        int total, num1=30, num2=5;
        total=num1/num2;
        System.out.println("Impartirea numerelor este " + total);
        int calcul1, calcul2, calcul4;
        float calcul3;
        calcul1=( -5 + 8 * 6);
        System.out.println("Rezultatul a) este " +calcul1);
        calcul2=((55+9) % 9);
        System.out.println("Rezultatul b) este " +calcul2);
        calcul3 = (20 + ((-3 * 5) / 8));
        System.out.println("Rezultatul c) este " +calcul3);
        calcul4=(5 + 15 / 3 * 2 - 8 % 3);
        System.out.println("Rezultatul d) este " +calcul4);
    }

}
