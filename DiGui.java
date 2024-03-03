package Test01;

/**
 * @author zao_an
 * @version 1.8
 */
public class DiGui {
    public static void main(String[] args) {
        Fun fun = new Fun();
        System.out.println(fun.fun(6));


    }
    public static class Fun{
        public int fun(int n){
            for (int s = 0; s <10 ; s++) {
                if(n>0){
                    return n*fun(n-1);
                }
                return 1;
            }
            return n;
        }
    }

}
