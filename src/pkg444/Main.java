/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg444;

/**
 *
 * @author user
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//1. Создать 5 переменных различного содержания
        int first = 7;
        System.out.println(first);
        String str = "Hello";
        System.out.println(str);
        Float two = 3f;
        System.out.println(two);
        double d = 4.5;
        System.out.println(d);
        char Ch = 78;
        System.out.println(Ch);

//2. Создать массив, содержащий ФИО Ваших родственников
        String[] team = {" Юрий", " Ирина"};
        for (int i = 0; i < team.length; i++) {
            System.out.println("ФИО [" + i + "]=" + team[i]);
        }
//3. Вывести значения массива в консоль, снабдив их текстовыми комментариями (Например, это мой папа - , это моя мама -…)
        String[] Family = {" Юрий", " Ирина"};
        System.out.println("Father " + Family[0]);
        System.out.println("Mother " + Family[1]);
       
//4. Реализовать ввод данных для строки
System.out.println("Vvedite stroky");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println(name);
//5. Реализовать ввод данных в массив
System.out.println("Vvedite chislo");
String Words[] = new String[3];
         Scanner mass = new Scanner(System.in);
         for (int i = 0; i < 3; i++) {
           Words[i] = mass.nextLine();
            System.out.println("Word [" + i + "]=" + Words[i]);
        }
//6. Преобразовать переменную типа данных int в String, 
        int number = 8;
        String numberString = String.valueOf(number);
        System.out.println(numberString);
//String в int,
        System.out.println("Vvedite chislo");
        String strtoint;
        Scanner dec = new Scanner(System.in);
        strtoint = dec.nextLine();
        int mInt = Integer.parseInt(strtoint);
System.out.println(mInt);
//double в int, 
        double number1 = 8;
        String doubleString = String.valueOf(number1);
        System.out.println(doubleString);
// int в double.
        int n=8;
        double r=(double )n;
        System.out.println(r);
    }

}