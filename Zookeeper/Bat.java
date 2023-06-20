public class Bat extends Mammal {
    public Bat() {
        super(300);
    }

    public void fly() {
        System.out.println("The bat takes off swoosh");
        this.energylevel -= 50;
    }

    public void eatHumans() {
        System.out.println("The bat eats humans");
        this.energylevel += 25;
    }

    public void attackTown() {
        System.out.println("The town has been attacked and is on fire!");
        this.energylevel -= 100;
    }
}