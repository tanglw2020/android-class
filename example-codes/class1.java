package com.example.libhello;

import java.util.ArrayList;
import java.util.Scanner;

public class MyClass1 {

    public static void main(String[] args) {

        if(false)
        {
            // part 1
            byte ab = 20;
            short bs = 134;
            int ci = (int) 3.3;
            long dl = 9000000000000000000L;

            System.out.println("===part 1===");
            System.out.println(ab);
            System.out.println(bs);
            System.out.println(ci);
            System.out.println(dl);

            // how get sizeof of a datatype
            System.out.println(Byte.BYTES);
            System.out.println(Byte.MAX_VALUE);
            System.out.println(Byte.MIN_VALUE);
        }

        if(false)
        {
            System.out.println("===part 2===");
            float ff = 4.3f;
            double gd = 5.34e4;
//            int i1 = 2/0;
            float f1 = 1.0f / 0;  // may lead to serious problem
            System.out.println(ff);
            System.out.println(gd);
            System.out.println(f1 * 2);
            System.out.println(1.0f / 10);
            System.out.println(1.0f - 9.0f / 10);
            System.out.println(Double.BYTES);
            System.out.println(Double.MAX_VALUE);
            System.out.println(Double.MIN_VALUE);
        }

        if(false)
        {
            // part 3
            System.out.println("===part 3===");
            boolean b1 = true && false;
            boolean b2 = 12 < 2;
            System.out.println(b1);
            System.out.println(b2);

            // b ? x : y
            int a = 3;
            int b = 5;
            int m = a > b ? a : b;  // 
            // abs??

            int score = 70;
            char grade = score >= 90 ? 'A' : (score >= 60 ? 'B' : 'C');
            score = 91;
            grade = score >= 90 ? 'A' : (score >= 60 ? 'B' : 'C');
            System.out.printf("score:%d grad:%c\n", score, grade);
            score = 67;
            grade = score >= 90 ? 'A' : (score >= 60 ? 'B' : 'C');
            System.out.printf("score:%d grad:%c\n", score, grade);
            score = 45;
            grade = score >= 90 ? 'A' : (score >= 60 ? 'B' : 'C');
            System.out.printf("score:%d grad:%c\n", score, grade);
        }

        if(false)
        {
            System.out.println("===part 4===");
            String s = "hello";   // auto type tranform
            String t = s;
            s = "world" + 234;
            System.out.println("t:"+t);
            System.out.println("s:"+s);

            String s1 = null;
            String s2 = "dfhsdhxdghh";
            System.out.println(s1 == "");
            System.out.println(s2.indexOf("dg"));
        }

        if(false)
        {
            // part 5
            System.out.println("===part 5===");
            int[] iList = new int[3];
            for (int i = 0; i < iList.length; i++) {
                System.out.println(String.valueOf(i) + ":" + iList[i]);
                iList[i] = i + 3;
            }
            for (int i : iList) {
                System.out.println(i);
            }

            ArrayList arrayList = new ArrayList();
            arrayList.add("rt");
            arrayList.add(45);
            arrayList.add(9.0);
            for (int i = 0; i < arrayList.size(); i++)
                System.out.println(arrayList.get(i));
            System.out.println(arrayList.toString());
        }

        if(false)
        {
            System.out.println("===part 6===");
            System.out.print("1 ");
            System.out.print("2 ");
            System.out.print("3 ");
            System.out.println("4 ");
            System.out.print("5 ");
            System.out.printf("int:%d float:%.3f\n", 6, 8.12343);
        }

        if(false)
        {
            System.out.println("===part 7===");
            Scanner scanner = new Scanner(System.in);
            if(scanner.hasNext())
            {
                String s1 = scanner.next();
                System.out.println(s1);
            }
            else
            {
                System.out.println("no next find");
            }

            if(scanner.hasNextLine()) {
                String s2 = scanner.nextLine();
                System.out.println(s2);
            }
            else
            {
                System.out.println("no nextLine find");
            }

            if(scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println(i);
            }
            else
            {
                System.out.println("no int find");
            }
        }

        if(false)
        {
            System.out.println("===part 8===");
            System.out.print("for:");
            for(int i=0; i<3; i++)
            {
                System.out.print(i+" ");
            }
            System.out.println();

            System.out.print("while:");
            int i=0;
            while(i<3)
            {
                System.out.print(i+" ");
                i++;
            }
            System.out.println();

            System.out.print("do-while:");
            i=0;
            do
            {
                System.out.print(i+" ");
                i++;
            }while(i<3);
            System.out.println();
        }

        if(false){
            System.out.println("===part 9===");
            int option = 2;
            switch (option) {
                case 1:
                    System.out.println("Selected 1");
                    break;
                case 2:
                    System.out.println("Selected 2");
                    break;
                case 3:
                    System.out.println("Selected 3");
                    break;
                default:
                    System.out.println("Not selected");
                    break;
            }
        }
    }
}