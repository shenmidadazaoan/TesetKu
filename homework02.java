package Test01;

/**
 * @author zao_an
 * @version 1.8
 */
public class homework02 {
    public static void main(String[] args) {
        int[] hours ={0,1,2,3,4};
//        int[] hours ={5,1,4,2,2};
        int target=2;
        int count=0;
        for (int i = 0, j=0; i < hours.length; i++,j++) {
            if(!(hours[i]>=target)){
                System.out.println("- 员工 "+j+" 工作了 "+hours[i]+"小时，"+"不满足要求。");
            }
            else{
                System.out.println("- 员工 "+j+" 工作了 "+hours[i]+"小时，"+"满足要求。");
                count++;
            }
        }
        System.out.println("共有 "+count+" 位满足要求的员工。");

    }
}
