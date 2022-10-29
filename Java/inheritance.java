package OOPS;

class Parent{
    void Bike(){
        System.out.println("Hero");
    }
}

class Child extends Parent{
    void Cycle(){
        System.out.println("Atlas");
    }
}
public class inheritance {

    public static void main(String[] args) {
        Child c = new Child();
        c.Bike();
        c.Cycle();

    }
}
