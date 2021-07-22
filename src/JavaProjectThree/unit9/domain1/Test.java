package JavaProjectThree.unit9.domain1;

public class Test {
    @org.junit.Test
    public void test1(){
    Cat cat = new Cat();
    Dog dog = new Dog();

    cat.eat();
    cat.catchMice();
    dog.eat();
    dog.watchDoor();
    }
}
