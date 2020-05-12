package RebecasFirstJava;

public class Main {
    public static void main(String[] args) {
        LogicalOp op = new LogicalOp();
        int biggest = op.checkBiggerNumber(2, 3);
        System.out.println("The bigger number is " + biggest);

        String text = ("FastTrack");
        System.out.println(op.checkTextFastTrack(text));

        String textul=("FastTrackIt");
        System.out.println(op.VerifyText(textul));

        int x = 5;
        System.out.println(op.TestTheSnow(x));

        int nr=6;
        System.out.println(op.TestTheNumbers(nr));

        int a=10;
        System.out.println(op.SwitchNumber(a));

        int b=4;
        System.out.println(op.isEvenNumber(b));

        int age=16;
        System.out.println(op.isEligibleToVote(age));

        int w=10, y=22, z=3;
        System.out.println(op.ComparisonNumbers(w,y,z));

        int i=85;
       op.Counting(i);

       int  first=100, second=85;
        op.ReverseCounting(first, second);

        int s=10, p=20;
        op.CountingBetween(s,p);

        int l=5, k=10;
        op.ComparisonAndCounting(k,l);

        int j=1;
        op.NumerelePare(j);

        int r=1;
        op.NumereleImpare(r);

        int number=95;
        System.out.println(op.SumaNumerelor(number));

        int number1=90;
        System.out.println(op.MediaNumerelor(number1));

    }}


