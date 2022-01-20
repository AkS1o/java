package Module;

import java.util.Scanner;

public class Module {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        //task1();
        //task2();
        //task3();
        //task4();
        //task5();
        //task6();
        //task7();
        //task8();
        //task9();
        //task10();
    }

    public static void task1(){
        System.out.println("\"Your time is limited,\n\tso don’t waste it\n\t\tliving someone else’s life\"\n\t\t\tSteve Job");
    }

    public static void task2(){
        System.out.print("Enter number: ");
        Double number = Double.parseDouble(in.nextLine());

        System.out.print("Enter percent: ");
        Double percent = Double.parseDouble(in.nextLine());

        Double result = number / 100 * percent;
        System.out.print("Result: " + result);
    }

    public static void task3(){
        String[] arr= {"", "", ""};
        for(int i =0; i < 3; i++){
            System.out.print("Enter number: ");
            arr[i] = in.nextLine();
        }

        String number = "";
        for(int i =0; i < 3; i++){
            number += arr[i];
        }

        System.out.print("Number: " + Integer.parseInt(number));
    }

    public static void task4(){
        System.out.print("Enter number: ");
        int number = Integer.parseInt(in.nextLine());

        if(99999 < number && number < 1000000){
            char[] arr = ("" + number).toCharArray();

            char temp = arr[0];
            arr[0] = arr[5];
            arr[5] = temp;

            temp = arr[1];
            arr[1] = arr[4];
            arr[4] = temp;

            String string = new String(arr);
            System.out.print("Number: " + string);

        } else {
            System.out.print("Error");
        }
    }

    public static void task5(){
        System.out.print("Enter number: ");
        int number = Integer.parseInt(in.nextLine());

        if(12 == number || number <= 2){
            System.out.print("Winter");
            return;
        }
        if(3 <= number && number <= 5){
            System.out.print("Spring");
            return;
        }
        if(6 <= number && number <= 8){
            System.out.print("Summer");
            return;
        }
        if(9 <= number && number <= 11){
            System.out.print("Autumn");
            return;
        }
    }

    public static void task6(){
        int select = 0;
        System.out.print("Enter number: ");
        double number = in.nextDouble();

        System.out.print("1. Meters\n" +
                "2. Miles\n"+
                "3. Inches\n" +
                "4. Yards\n" +
                "Select: ");
        select = in.nextInt();
        switch (select){
            case 1:
                System.out.print(number + "m" + " = " + number + "m");
                break;
            case 2:
                System.out.print(number + "m" + " = " + number * 0.000621371192237334 + "mi");
                break;
            case 3:
                System.out.print(number + "m" + " = " + number * 39.370078740157 + "in");
                break;
            case 4:
                System.out.print(number + "m" + " = " + number * 1.0936132983 + "yd");
                break;
            default:
                break;
        }
    }

    public static void task7(){
        System.out.print("Enter number: ");
        int min = in.nextInt();
        System.out.print("Enter number: ");
        int max = in.nextInt();

        if(min > max){
            System.out.print("Error");
            return;
        }

        for(int i = min; i < max; i++){
            if(i % 2 == 1){
                System.out.print(i + ", ");
            }
        }
    }

    public static void task8(){
        System.out.print("Enter number: ");
        int num1 = in.nextInt();
        System.out.print("Enter number: ");
        int num2 = in.nextInt();

        for(int i = 1; i <= num2; i++){
            System.out.print(num1 + " * "+ i + " = " + num1 * i + "\n");
        }
    }

    public static void task9(){
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round((Math.random() * 30) - 15);
        }

        int min = arr[0], max=arr[0], countNegative = 0, countAmount = 0, countZero = 0;

        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
            if(max < arr[i]){
                max = arr[i];
            }
            if(0 > arr[i]){
                countNegative++;
            }
            if(0 < arr[i]){
                countAmount++;
            }
            if(0 == arr[i]){
                countZero++;
            }
        }

        System.out.println("Min: " + min + "\n" +
                "Max: " + max + "\n" +
                "Negative: " + countNegative + "\n" +
                "Amount: " + countAmount + "\n" +
                "Zero: " + countZero);
    }

    public static void task10(){
        int[] arr = new int[20];
        int[] arrNegative = {}, arrAmount = {}, arrEven  = {}, arrOdd  = {};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round((Math.random() * 30) - 15);
        }

        for (int i = 0; i < arr.length; i++) {
            if (0 > arr[i]) {
                arrNegative = updateArr(arrNegative, arr[i]);
            }
            if(0 < arr[i]){
                arrAmount = updateArr(arrAmount, arr[i]);
            }
            if (arr[i] % 2 == 0) {
                arrEven = updateArr(arrEven, arr[i]);
            }
            if (arr[i] % 2 != 0) {
                arrOdd = updateArr(arrOdd, arr[i]);
            }
        }
    }

    public static int[] updateArr(int[] arr, int num){
        int[] temp = new int[arr.length + 1];

        for(int i = 0; i < arr.length; i++){
            temp[i] = arr[i];
        }
        temp[arr.length] = num;

        return temp;
    }
}
