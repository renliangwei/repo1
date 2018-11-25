package cn.itcast.day04.demo01;




/*
1.定义方法，求出长方形的面积
2.调用方法，输出结果


*/

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("结果是:"+sum());
    }
    public  static int sum(){
        int sum = 0 ;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        return sum ;
    }
}
