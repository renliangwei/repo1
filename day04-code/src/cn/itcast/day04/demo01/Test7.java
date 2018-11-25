package cn.itcast.day04.demo01;

public class Test7 {
    public static void main(String[] args) {
      printX(10);

    }
    public static void printX(int m){
        for (int i = 1; i <=m; i++) {
            for (int j = 1; j <=m; j++) {
                if (i+j==1+m||i==j){
                    System.out.print("0");
                }else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }

    }
}
