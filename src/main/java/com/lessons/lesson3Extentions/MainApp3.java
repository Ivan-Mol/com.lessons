package com.lessons.lesson3Extentions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainApp3 {
    public static void main(String[] args) {
        //fileOutputStream выносится вне блока try чтобы было видно в finally
        //И в файналли закрывается поток в любом случае
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("fileName.txt");
            fileOutputStream.write(333);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //Try With Resourses
        //Автоматически закрывает поток - параметр внутри try должен реализовывать AutoClosable
        try (FileOutputStream fileOutputStream2 = new FileOutputStream("fileName2.txt")) {
            String string = "текст файла";
            fileOutputStream2.write(string.getBytes());
        }
        catch (IOException e){
            System.out.println("ошибка ввода вывода");
        }

    }
}
