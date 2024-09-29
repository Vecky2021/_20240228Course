public class Car {
    String name;
    String color;
    double pailiang;
    
    //类的属性
    //类的属性跟对象无关，只跟类有关
    //静态的属性
    static int wheelNum=4;



    Car(String name, String color, double pailiang){
        System.out.println("创建了一个汽车类对象");
        this.name = name;
        this.color = color;
        this.pailiang = pailiang;

    }

    Car(String name, String color)
    {
        this.name = name;
        this.color = color;
    }

    void start()
    {
        System.out.println("-----启动");
    }
    void tell()
    {
        System.out.println("我是"+name+",颜色："+color+",排量"+pailiang+"有"+wheelNum);
    }

    static void wheel()
    {
//        System.out.println(name);
        System.out.println("我有"+wheelNum+"个轮胎");
    }

}
