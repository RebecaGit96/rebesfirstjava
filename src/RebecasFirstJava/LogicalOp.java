package RebecasFirstJava;

import java.util.List;

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

    public String SwitchNumber(int a) {
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

    public String isEvenNumber(int b) {
        if (b % 2 == 0) {
            return ("true");
        } else {
            return ("false");
        }
    }

    public String isEligibleToVote(int age) {
        if (age >= 18) {
            return ("true ");
        } else {
            return ("false ");
        }
    }

    public String ComparisonNumbers(int w, int y, int z) {
        if (w > y && w > z) {
            return ("Cel mai mare numar este: w= " + w);
        } else {
            if (y > w && y > z) {
                return ("Cel mai mare numar este: y= " + y);
            } else {
                return ("Cel mai mare numar este: z= " + z);
            }
        }
    }


    public void Counting(int nr) {
        for (int i = nr; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println("//");
    }

    public void ReverseCounting(int first, int second) {
        for (first = 100; first > second; first--) {
            System.out.print(first + " ");
        }
        System.out.println();
    }

    public void CountingBetween(int s, int p) {
        for (s = 10; s <= p; s++) {
            System.out.print(s + " ");
        }
        System.out.println();

    }

    public void ComparisonAndCounting(int k, int l) {
        if (k > l) ;
        for (l = 5; l <= k; l++) {
            System.out.print(l + " ");
        }
        System.out.println();
    }

    public void NumerelePare(int j) {
        for (j = 1; j <= 100; j++) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
        }
        System.out.println();
    }

    public void NumereleImpare(int r) {
        for (r = 1; r <= 100; r++) {
            if (r % 2 == 1) {
                System.out.print(r + " ");
            }
        }
        System.out.println();
    }

    public String SumaNumerelor(int number) {
        int sum = 0;
        for (int i = number; i <= 100; i++) {
            sum = sum + i;
        }
        return ("suma numerelor este:" + sum);
    }

    public String MediaNumerelor(int number1) {
        float sum = 0;
        float media = 0;
        int count = 0;
        for (int i = number1; i <= 100; i++) {
            sum = sum + i;
            count = (100 - number1);
            media = sum / count;
        }
        return ("media numerelor este: " + media);

    }

    public void MetodaWhile(int h) {
        do {
            System.out.print(h + " ");
            h++;
        }
        while (h <= 100);
        System.out.println();

    }

    public void ReverseWhile(int v) {
        do {
            System.out.print(v + " ");
            v--;
        }
        while (v >= 90);
        System.out.println();
    }

    public void CountingBetweenWhile(int m, int n) {
        do {
            System.out.print(m + " ");
            m++;
        }
        while (m <= n);
        System.out.println();
    }

    public void ComparisonAnsCountingWhile(int u, int t) {
        if (u > t)
            do {
                System.out.print(t + " ");
                t++;
            }
            while (t <= u);
        System.out.println();
    }

    public void NrPareWhile(int no) {

        do {
            if (no % 2 == 0)
                System.out.print(no + " ");
            no++;
        }
        while (no <= 100);
        System.out.println();
    }

    public void NrImpareWhile(int on) {
        do {
            if (on % 2 == 1)
                System.out.print(on + " ");
            on++;
        }
        while (on <= 100);
        System.out.println();
    }

    public void sumAndAverageWhile() {
        int firstNumber = 111;
        int secondNumber = 8899;
        double sum = 0;
        int count = 0;
        while (firstNumber <= secondNumber) {
            sum += firstNumber;
            firstNumber++;
            count++;
        }
        System.out.println(sum);
        double average = sum / count;
        System.out.println("The average of the numbers is: " + average);
    }

    public void printPattern() {
        for (int j = 7; j >= 1; j--) {
            String text = "";
            for (int i = j; i >= 1; i--) {
                text = text + "*";
            }
            System.out.println(text);
        } }

    public void MyArray (){
         int[] MyArray=new int[100];
         for(int i=0; i<100; i++) {
             MyArray[i] = i + 1;
        System.out.print(MyArray[i]+ " ");
    }}

    public void  addToList (List<Integer> myList, int qa){
        myList.add(qa);
    }
    public void PrintList(List<Integer> list){
        int position = 2;
        for(int i = position; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
    public void ReverseList (List<Integer> List){
        for(int i=3; i>-1; i--)
            System.out.println(List.get(i));
    }
    public void AddToMyList1 (List <String> Mylist1, int x, String y){
        Mylist1.add(x, y);

    }
    public void MoveList(List<String> myList3, String name){
        myList3.add(name);
   }

}










