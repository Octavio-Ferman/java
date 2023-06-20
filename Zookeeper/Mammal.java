public class Mammal {
    protected int energylevel;

    public Mammal(int energylevel) {
        this.energylevel = energylevel;
    }

    public int displayEnergy() {
        System.out.println("The Mammal's Energy Level is " + this.energylevel);
        return this.energylevel;
    }


}