public class Fruits {
    double weight;
    String colour;
    String sort;

    public Fruits() {}

    public Fruits(double weight) {
        this.weight = weight;
    }

    public Fruits(double weight, String colour) {
        this.weight = weight;
        this.colour = colour;
    }

    public Fruits(double weight, String colour, String sort) {
        this.weight = weight;
        this.colour = colour;
        this.sort = sort;


    }
    public void Main1() {
        System.out.println("I like these fruits.");
    }
     static void Main2() {
        System.out.println("It's very good for health.");
    }
}
