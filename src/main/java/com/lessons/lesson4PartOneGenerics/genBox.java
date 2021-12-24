package com.lessons.lesson4PartOneGenerics;

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



}
