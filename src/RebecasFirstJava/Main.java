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
    }}


