public class Gorilla extends Mammal {

    public Gorilla(int energylevel) {
        super(energylevel);
    }

    public void throwSomething() {
        System.out.println("The gorilla has thrown something");
        this.energylevel -= 5;
    }

    public void eatBananas() {
        System.out.println("The gorilla just ate a banana");
        this.energylevel += 10;
    }

    public void climb() {
        System.out.println("The gorilla has climbed a tree");
        this.energylevel -= 10;
    }
}