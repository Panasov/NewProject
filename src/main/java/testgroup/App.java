package testgroup;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        printMessage("hello");
        System.out.println(calc(3));
        String str = "!!!";
        System.out.println(str + "123");
        pruntHi();
        ptintHello("Hello");
        ptintHello("Goodbye");
        plus(9);
        System.out.println("==============");

        int a = 10;
        if (a > 5) {
            System.out.println("a больше 5");
        }

        int b = 20;
        if (b > 10) {
            System.out.println("b больше 10");
        } else {
            System.out.println("b мельне или равно 10");
        }
        // Оператор switch
        int c = 30;
        switch (c) {
            case 1: System.out.println("c равно 1");
            break;
            case 30: System.out.println("с равно 30");
            break;
            default: System.out.println("с не равно 1 или 30");
        }
        // Тенарный оператор
        int d = 40;
        String result = d > 30 ? "d больше 30" : "d меньше или равно 30";
        System.out.println(result);


        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("-------------------");
        int f = 0;
        while (f < 3) {
            System.out.println(f);
            f++;
        }
        System.out.println("-------------------");
        int g = 6;
        do {
            System.out.println(g);
            g++;
        } while (g < 2);

        //Блочный оператор
        int h = 5;
        {
            int j = 6;
            System.out.println(h);
            System.out.println(j);
        }
        System.out.println(h);

        System.out.println("***");

        int[] array = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        for (int i = 0; i < array.length; i++) {
           // System.out.println(i);
            System.out.println(array[i]);
        }

        System.out.println("*****");
        // for each
        int[] arrays = {1, 2, 3, 4, 5};
        for (int element : arrays) {
            System.out.println(element);
        }
        System.out.println("######");

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int[] ar : arr) {
            for (int el : ar) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
        System.out.println("======");

        List<Integer> qq = new ArrayList<>();
        qq.add(1);
        qq.add(2);
        qq.add(3);
        for (int i = 0; i < qq.size(); i++) {
            System.out.println(qq.get(i));
        }
        System.out.println("-------------");
        List<String> strq = new ArrayList<>();
        strq.add("qwe");
        strq.add("qwa");
        strq.add("qas");
        for (int i = 0; i < strq.size(); i++) {
            System.out.println(strq.get(i));
        }

        //Сканер
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int aa = scanner.nextInt();
        if (aa > 0) {
            System.out.println("Число больше 0");
        } else if (aa < 0) {
            System.out.println("Число меньше 0");
        } else if (aa == 0) {
            System.out.println("Это число 0");
        }
        scanner.close();
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static int calc(int x) {
        return x * x;
    }
    public static void pruntHi (){
        System.out.println("Привет всем!");
    }
    public static void ptintHello (String sms) {
        System.out.println(sms);
    }
    public static void plus (int pl) {
        System.out.println(pl + pl);
    }
}
