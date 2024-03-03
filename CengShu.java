package Test01;

/**
 * @author zao_an
 * @version 1.8
 */
public class CengShu {
    public static void main(String[] args) {
//        for (int i = 1; i <= 6; i++) {
//            for (int j = 1; j <= 6-i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=2*i-1; j++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//
//        }
//        System.out.println("========================");
////        for (int i = 6; i >= 0; i--) {
////            for (int j = 0; j <i+1; j++) {
////                System.out.print("*");
////            }
////            System.out.println("");
////        }
//        int rows = 5; // 设置行数为5（可根据需要修改）
//
//        for (int i = 1; i <= rows; ++i) {
//            for (int space = 1; space <= rows - i; ++space) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= 2 * i - 1; ++j) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        for (int i = 1; i <=6 ; i++) {
//            for (int j = 1; j <=6-i ; j++) {
//                System.out.print(" ");
//            }
//            for(int k = 1;k<=2*i-1;k++){
//                System.out.print("*");
//            }
//            System.out.println("");
//
//        }

//        int num=5;
//
//        for (int i = 1; i < num; i++) {
//            for (int j = 1; j <num-i ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=2*i-1 ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        int rows = 5; // 设置行数为5（可根据需要修改）
//
//        for (int i = rows; i >= 1; --i) {
//            // 打印前面的空格
//            for (int space = 1; space <= rows - i; ++space) {
//                System.out.print(" ");
//            }
//
//            // 打印星号
//            for (int j = 1; j <= 2 * i - 1; ++j) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }

        /*
         *     *
         *    *  *
         *   *    *
         *  *      *
         * ***********
         */

//        for (int i = 1; i <= 6; i++) {
//            for (int j = 0; j <=6-i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=2*i-1; j++) {
//                if(j==1 || j==2*i-1 || i==6){
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//
//
//            }
//            System.out.println();
//
//        }

        int CengShu=100;
        for (int i = 1; i <= CengShu; i++) {
            for (int j = 1; j <= CengShu-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                if(j==1 || j==2*i-1 || i==CengShu){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }



    }
}
