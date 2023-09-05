package baitap;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void bai1(){
        String name = "Nguyễn Thị Hải Yến";
        String dob = "14/03/2001";
        String major = "Information of System";
        String reason = "Upskill cho bản thân, có kiến thức để áp dụng vào công việc";
        System.out.println("Họ và tên: "+name);
        System.out.println("Ngày sinh: "+dob);
        System.out.println("Chuyên ngành: "+major);
        System.out.println("Lý do học Auto test: "+reason);
    }
    public static void bai2(){
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("Nhập vào số N (2<=N<=20): ");
            n = sc.nextInt();
        } while (n<2||n>20);
        int result;
        System.out.println("Bảng cửu chương với "+n+":");
        for(int i=1; i<=10; i++){
            result = n*i;
            System.out.println(n+"x"+i+"="+result);
        }
    }
    public static void bai3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập N = ");
        int N = sc.nextInt();
        int[] a = new int[N];
        System.out.println("Nhập vào các phần tử của mảng N:");
        int x;
        for(int i=0; i<a.length; i++){
            System.out.println("a["+i+"]=");
            x= sc.nextInt();
            a[i]=x;
        }
        //in ra danh sách số lẻ
        System.out.print("Các số lẻ trong mảng được nhập vào là: ");
        for(int i=0; i<a.length; i++){
            if(a[i]%2!=0){
                System.out.println(""+a[i]);
            }
        }
        //in ra danh sách số lẻ
        System.out.print("Các số chẵn trong mảng được nhập vào là: ");
        for(int i=0; i<a.length; i++){
            if(a[i]%2==0){
                System.out.println(""+a[i]);
            }
        }
        //in ra danh sách số nguyên tố
        System.out.print("Các số nguyên tố trong mảng được nhập vào là: ");
    }
    public static void bai4(){
        int[] arr = {2,7,6,8,9,21,34,56,32,12,27};
        //1. tìm phần tử lớn nhất
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng là "+max);
        //2. tính tổng số đầu tiên và số cuối cùng
        int first = arr[0];
        int last = arr[arr.length-1];
        int sum = first+last;
        System.out.println("Tổng số đầu tiên và số cuối cùng trong mảng là "+sum);
        //3. tính tổng các số chẵn trong mảng
        int sumChan=0;
        for(int i=0; i<=10; i++){
            if(arr[i]%2==0){
                sumChan=sumChan+arr[i];
            }
        }
        System.out.println("Tổng các số chẵn trong mảng là "+sumChan);
    }

    public static void bai5(){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        float x1,x2,delta;
        System.out.println("Giải phương trình bậc 2 ax^2 + bx +c = 0:");
        do{
            System.out.println("Nhập a khác 0: ");
            a = sc.nextInt();
        }while (a==0);
        System.out.println("Nhập b: ");
        b = sc.nextInt();
        System.out.println("Nhập c: ");
        c = sc.nextInt();
        delta = b^2 - 4*a*c;
        if (delta > 0) {
            x1 = (float) ((-b+Math.sqrt(delta))/(2*a));
            x2 = (float) ((-b-Math.sqrt(delta))/(2*a));
            System.out.println("Phương trình có 2 nghiệm: x1 = "+x1+", x2 = "+x2);
        } else if (delta == 0) {
            x1 = (-b/(2 * a));
            System.out.println("Phương trình có nghiệm kép: x1 = x2 = "+x1);
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
    public static void main(String[] args) {
	// write your code here
//        bai1();
//        bai2();
        bai3();
//        bai4();
//        bai5();
    }
}
