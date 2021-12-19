package com.lessons.lesson2partThreeEnumAndInnerClass;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//внешний класс - не имеет доступа к внутреннему
public class MainApp {
    int outerInt = 1;

    public MainApp(int outerUnt) {
        this.outerInt = outerUnt;
    }
//внутренний класс - имеет доступ к внешнему
    public class InnerClass{
        int innerInt = 0;

        public InnerClass(int innerInt) {
            this.innerInt = innerInt;
        }

        public void innerClassMethod(){
            System.out.println(outerInt);
        }
    //Так получается потому что внутренний не может существовать без внешнего, а внешний без внутреннего может.
    }

    //static делает внутренний класс вложенным - можно создавать объекты из внешнего - но теряется доступ к объектам внешнего класса
    public static class InnerClass2{

    }

    public static void main(String[] args) {
      //  InnerClass innerClass1 = new InnerClass(); - не сработает
        InnerClass2 innerClass2 = new InnerClass2(); // сработает

        //локальный класс - класс внутри метода
        class Point {
            int x = 1;

            public Point(int x) {
                this.x = x;
            }


        }
        //кнопка с анонимным классом в методе "при нажатии кнопки"
        JButton button = new JButton();
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("123");
            }
        });
    }
}
