package com.lessons.lesson4PartOneGenerics;

import java.util.List;

public class genBox<T> {
    //<T> хранит любые значения - только ссылочные типы данных
    //Внутри класса запрещено создавать объекты T o = new T(); не сработает
    T obj;

    public genBox(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
//обобщенный метод
    public static <T> T returnSomething(List<T> list){
        return list.get(0);
    }




}
