package lesson1.animals;

public abstract class Animal {
    //protected - доступ из пакета и классам наследникам
    protected String name;
    protected String color;
    protected int age;

    public void info(){
        System.out.println(name +" "+ color+" "+age);
    }
    //Абстрактный метод чтобы наследники обязательно имели такой метод
    //Абстрактный позволяет создавать метод без реализации
    public abstract void voice();


}
