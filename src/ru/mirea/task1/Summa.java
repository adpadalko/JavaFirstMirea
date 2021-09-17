package ru.mirea.task1;
import java.util.Scanner;

public class Summa {
    public static int summ(int[] arr, int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum = sum + arr[i];
        }
        return sum;
    }

    public static int summ2(int[] arr, int n){
        int sum = 0;
        int i=1;
        while(i<=n){
            sum=sum+arr[i];
            i++;
        }
        return sum;
    }

    public static int summ3(int[] arr, int n){
        int sum = 0;
        int i=1;
        do{
            sum=sum+arr[i];
            i++;
        }while(i<=n);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Введите кол-во чисел: ");
        if (sc.hasNextInt()){
            n=sc.nextInt();
            System.out.print("Введите массив: ");
            int[] arr= new int[n+1];
            for (int i=1; i<=n; i++){

                arr[i]=sc.nextInt();
            }
            int summ= summ(arr, n);
            int summ2 = summ2(arr, n);
            int summ3 = summ3(arr, n);
            System.out.println("Сумма for: "+ summ);
            System.out.println("Сумма while: "+ summ2);
            System.out.println("сумма do while: "+ summ3);
        }else{
            System.out.println("Вы ввели не целое число.");
        }
    }
}
