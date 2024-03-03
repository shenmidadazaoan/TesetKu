package Test01;

/**
 * @author zao_an
 * @version 1.8
 */
public class sxh {
    public static void main(String[] args) {

        int j=100;
        System.out.println(j/100%10);// 求出个位数字
        System.out.println(j/10%10);// 求出十位数字
        System.out.println(j%10);// 求出百位数字
        int one;
        int two;
        int san;
        for (int i = 2; i<1000; i++) {
            one=i/100%10;
            two=i/10%10;
            san=i%10;
            if(i==Math.pow(one,3)+Math.pow(two,3)+Math.pow(san,3)){
                System.out.print("水仙花数有："+i+" ");
            }


        }



    }
}
