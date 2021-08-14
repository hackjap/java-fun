import java.sql.SQLOutput;

abstract class Animal {

    public int leg;

    public void run() {
        System.out.println("달린다");
    }

    abstract public void eat();

}

class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("추상메소드 !!!!");
    }
}

public class Abstract {

    public static void main(String[] args) {
        Dog dg = new Dog();

        dg.eat();
        dg.leg = 4;
        dg.run();
        System.out.println("dg.leg = " + dg.leg);

    }
}