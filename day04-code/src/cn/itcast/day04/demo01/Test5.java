package cn.itcast.day04.demo01;

public class Test5 {
    public static void main(String[] args) {
        showColor("red");
    }

    public static void showColor(String color) {
        switch (color) {
            case "red":
                System.out.println(color + "是红色");
                break;
            case "blue":
                System.out.println(color + "是蓝色'");
            case "yellow":
                System.out.println(color + "是黄色");
            default:
                System.out.println("颜色未知!");

        }
    }
}
