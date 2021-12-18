package com.lessons.lesson2partThreeEnumAndInnerClass;
//внешний класс - не имеет доступа к внутреннему
public class MainApp {
    int outherInt = 1;

    public MainApp(int outherUnt) {
        this.outherInt = outherUnt;
    }
//вложенный класс - имеет доступ к внешнему
    public class InnerClass{
        int innerInt = 0;

        public InnerClass(int innerInt) {
            this.innerInt = innerInt;
        }

        public void innerClassMethod(){
            System.out.println(outherInt);
        }
    }
//Так получается потому что внутренний не может существовать без внешнего, а внешний без внутреннего может.
    public static void main(String[] args) {


    }
}
