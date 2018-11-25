package cn.itcast.day04.demo01;

import javax.swing.plaf.PanelUI;

public class Test8 {
    public static void main(String[] args) {
        getValue("小", 5, 6, 7);

    }

    public static void getValue(String ext, int n1, int n2, int n3) {
        switch (ext) {
            case "大":
                int max = getMax(n1, n2, n3);
                System.out.println("最大值:" + max);
                break;
            case "小":
                int min = getMin(n1, n2, n3);
                System.out.println("最小值:" + min);
                break;
            default:
                System.out.println("指令有误!");
        }
    }

    public static int getMin(int i, int j, int k) {
        int min = i < j ? (i < k ? i : k) : (j < k ? j : k);
        return min;
    }

    public static int getMax(int i, int j, int k) {
        int max = i > j ? (i > k ? i : k) : (j > k ? j : k);
        return max;
    }
}
