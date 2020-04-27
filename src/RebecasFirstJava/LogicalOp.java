package RebecasFirstJava;

public class LogicalOp {
    public static int checkBiggerNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public String checkTextFastTrack(String text) {
        if (text.equals("FastTrackIt")) {
            return "Learning text comparison";
        } else {
            return "Got to try some more";
        }
    }

    public String VerifyText(String text) {
        int n = 2;
        if (text.equals("FastTrackIt") && (n <= 3)) {
            return ("FastTrackIt " + n);

        } else {
            return ("FastTrackIt2 " + n);
        }
    }

    public String TestTheSnow(int x) {
        if ((x > 8) || (x == 6)) {
            return ("The amount of snow this winter was: " + x);
        } else {
            return ("The forecast snow is:" + x);
        }
    }

    public String TestTheNumbers(int nr) {
        if (nr > 3 && nr != 4) {
            return ("The number is greater than 3 and not equal to 4 ");
        } else {
            if (nr == 4) {
                return ("The number is equal to 4 ");
            } else {
                return ("The number is lower than 3 ");
            }
        }
    }

     public String  SwitchNumber(int a) {
        switch (a) {
            case 5:
                return ("The number is: 5");
            case 10:
               return ("The number is: 10");
            case 25:
                return ("The number is: 25");


        }
         return ("null");
     }
     public String isEvenNumber(int b){
        if(b%2==0){
            return ("true");
        }else{
            return ("false");
        }
     }
     public  String isEligibleToVote(int age){
        if(age>=18){
            return ("true ");
        }else{
            return("false ");
        }
     }
    public String ComparisonNumbers (int w, int y, int z){
        if(w>y && w>z){
            return ("Cel mai mare numar este: w= " + w);
        }else{
            if(y>w && y>z){
                return("Cel mai mare numar este: y= " + y);
            }else{
                return("Cel mai mare numar este: z= " + z);
            } } }
}
