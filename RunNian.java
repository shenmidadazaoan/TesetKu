package Test01;

import java.util.Scanner;

/**
 * @author zao_an
 * @version 1.8
 */
public class RunNian {
    public static void main(String[] args) {
        //闰年
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入年份：");
        int Temp =scanner.nextInt();
        if(Temp%4==0 && Temp%100!=0 || Temp%400==0){
            System.out.println("瑞年!");
        } else{
            System.out.println("NO润！");
        }

    }
}
