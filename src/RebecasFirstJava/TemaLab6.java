package RebecasFirstJava;

import java.util.ArrayList;
import java.util.List;

public class TemaLab6 {
    public static void main(String[] args) {
        List <Integer> myList= new ArrayList();
        myList.add(1);
        myList.add(4);
        myList.add(65);
        myList.add(345);
        System.out.println (myList.get(0));
        System.out.println(myList.get(1));
        System.out.println(myList.get(2));
        System.out.println(myList.get(3));
        LogicalOp op= new LogicalOp();
        op.addToList(myList, 10);
        System.out.println(myList);

        op.PrintList(myList);

        op.ReverseList(myList);

        List<String> MyList1= new ArrayList<>();
        int x=2;
        String y="grey";
        MyList1.add("red");
        MyList1.add("blue");
        MyList1.add("Black");
        MyList1.add("white");
        op.AddToMyList1(MyList1,x,y);
        System.out.println(MyList1);

        List<String> myList3=new ArrayList<>();
        myList3.add("45");
        myList3.add("2");
        myList3.add("65");
        op.MoveList(myList3,"something");
        myList3.add(0,"something");
        System.out.println(myList3);

        List<String> GetThePosition= new ArrayList<>();
        GetThePosition.add("100");
        GetThePosition.add("101");
        GetThePosition.add("102");
        System.out.println("Pe pozitia 0 este valoarea:" +GetThePosition.get(0));
        System.out.println("Pe pozitia 1 este valoarea:" +GetThePosition.get(1));
        System.out.println("Pe pozitia 2 este valoarea:" +GetThePosition.get(2));
    }

    }


