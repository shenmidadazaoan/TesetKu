package Test01;

/**
 * @author zao_an
 * @version 1.8
 */
public class MaoPao {
    public static void main(String[] args) {
        int arr[]={2,99,4,1,6,10,3};
        int Temp=0;
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j+1]>arr[j]){
                    Temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=Temp;

                }

            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}
