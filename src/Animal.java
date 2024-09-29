//如果一个类里面带有抽象方法，那么这个类必须是抽象类

public abstract class Animal {
    String name;
    int legs;

    void sleep()
    {
        System.out.println("zzzzZZZZzzzz.....");
    }

    //此时动物类不能描述吃的方法,不能写函数体
    //把这个方法定义成抽象方法
    abstract void eat();
}
