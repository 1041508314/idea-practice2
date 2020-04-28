/**
 * @program: complexity
 * @description
 * @author: LiuXinYu
 * @create: 2020-04-27 17:14
 **/
public class Test {
    public static void main(String[] args) {
//        void func1(int N){
//            int count = 0;
//            for (int i = 0; i < N; i++) {
//                for (int j = 0; j < N; j++) {
//                    count++;//进行 N*N次
//                }
//            }
//            for (int k = 0; k < 2 * N; k++) {
//                count++;// 进行 2N次
//            }
//            int M = 10;
//            while((M--) > 0){
//                count++; //进行 10次
//            }
//        }
    }
}
        //一共进行 N^2 + 2N +10次
    //时间复杂度
    //1.用常数1取代进行时间中的所有加法常数
    //2.在修改后的运行次数函数中，只保留最高阶项
    //3.如果最高阶项存在且不是1，则去除与这个项目相乘的常数，得到的结果就是大 O 阶
