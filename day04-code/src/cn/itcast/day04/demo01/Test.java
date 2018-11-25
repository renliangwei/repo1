package cn.itcast.day04.demo01;

import jdk.nashorn.api.scripting.ScriptUtils;

public class Test {
    public static void main(String[] args) {
        int a=10, b=10 ;
        printNum(a,b);
        doubling(a,b);
        printNum(a,b);
        System.out.println("***********");
        a = doubling(a);
        b = doubling(b);
        printNum(a,b);




    }
    public static void printNum(int iVar ,int iVar2){
        System.out.print("iVar:"+iVar+",");

        System.out.println("iVra2:"+iVar2);
    }
    public  static void doubling(int r ,int p ){
        r = r * 2;
        p = p *2 ;
        System.out.print("翻倍:"+"="+r+",");
        System.out.println("翻倍"+"="+p);

    }

    public  static  int doubling(int r){
        r = r * 2 ;
        return r ;
    }
}
