package cn.itcast.day04.demo01;

public class Test2 {
    public static void main(String[] args) {
        System.out.println(doCheck(2));
        System.out.println(doCheck(3));

    }

    public static boolean doCheck(int iVar) {
        boolean flag;
        int num;
        num = iVar;
        if (num % 2 == 0) {
            for (int i = 0; i <= 20; i++) {
                num -= i;
            }
            flag = true;

        } else {
            for (int i = 0; i <= 20; i++) {
                num += i;

            }
            flag = false;
        }
        System.out.println("num:" + num);
        return flag;
    }
}
