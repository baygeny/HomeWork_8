import javax.sound.midi.Soundbank;

public class Main {

    public static void main(String[] args) {
        Fruits apple = new Fruits(0.2, "green", "Renet Simirenko");

        Fruits banana = new Fruits(0.18, "yellow", "Robusta Moris");

        Fruits cherry = new Fruits(0.006, "red");
        cherry.sort = "Surprise";

        Fruits melon = new Fruits(3);
        melon.colour = "yellow";
        melon.sort = "Amal";

        Fruits plum = new Fruits();
        plum.weight = 0.08;
        plum.colour = "violet";
        plum.sort = "Sultan's favorite";

        System.out.println("The apple of sort " + apple.sort + ": weight - " + apple.weight + " kg, colour - " + apple.colour);
        System.out.println("The banana of sort " + banana.sort + ": weight - " + banana.weight + " kg, colour - " + banana.colour);
        System.out.println("The cherry of sort " + cherry.sort + ": weight - " + cherry.weight + " kg, colour - " + cherry.colour);
        System.out.println("The melon of sort " + melon.sort + ": weight - " + melon.weight + " kg, colour - " + melon.colour);
        System.out.println("The plum of sort " + plum.sort + ": weight - " + plum.weight + " kg, colour - " + plum.colour);

        Fruits main1 = new Fruits();
        main1.Main1();

        Fruits.Main2();
    }
}