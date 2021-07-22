package JavaProjectThree.unit9.domain1;

public class Dog extends Animal {
    private Integer weight;

    public Dog() {
    }
    public Dog(String name, Integer age, Integer weight) {
        super(name, age);
        this.weight = weight;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public void watchDoor(){
        System.out.println("狗看门");
    }
    @Override
    public void eat(){
        System.out.println("狗吃骨头");
    }
}
