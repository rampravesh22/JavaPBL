public class Animal {
    public void eat() {
        System.out.println("Parent eats");
    }

    public void sleep() {
        System.out.println("Parent eats");
    }

}

class Bird extends Animal {
    public void eat() {
        System.out.println("Child eats");
    }

    public void sleep() {
        System.out.println("Child sleeps");
    }

    public void fly() {
        System.out.println("Child flys");
    }

    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.eat();
        a1.sleep();
        Bird b1 = new Bird();
        b1.eat();
        b1.sleep();
        b1.fly();
    }


}

