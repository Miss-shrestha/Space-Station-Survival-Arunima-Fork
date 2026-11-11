import java.util.ArrayList;

public class AstronautTest {

    public static void main(String[] args) {

        // Create Sky, the Engineer
        Engineer sky = createEngineer("Sky");

        showAstronautInfo(sky);
        moveTowardsRocket(sky);
        boardRocket(sky);
        engineerRepairsEquipment(sky);

        // Create Rain, the Photographer
        Photographer rain = createPhotographer("Rain");

        boardRocket(rain);
        photographerPreparesCamera(rain);

        // Generic ArrayList storing different Astronaut subclasses
        ArrayList<Astronaut> crew = new ArrayList<>();

        crew.add(sky);
        crew.add(rain);

        System.out.println("\n=== Crew tasks ===");

        // Polymorphism: each astronaut performs their own task
        for (Astronaut astronaut : crew) {
            astronaut.performTask();
        }
    }

    // Creates a new Engineer astronaut
    public static Engineer createEngineer(String name) {
        System.out.println("=== Creating an astronaut ===");
        return new Engineer(name);
    }

    // Creates a new Photographer astronaut
    public static Photographer createPhotographer(String name) {
        System.out.println("=== Creating an astronaut ===");
        return new Photographer(name);
    }

    // Shows an astronaut's information
    public static void showAstronautInfo(
            Astronaut astronaut) {

        System.out.println("\n=== Astronaut details ===");
        System.out.println(
                "Name: " + astronaut.getName()
        );
        System.out.println(
                "Health: " + astronaut.getHealth()
        );
        System.out.println(
                "Oxygen: " + astronaut.getOxygen()
        );
    }

    // Moves an astronaut towards the rocket
    public static void moveTowardsRocket(
            Astronaut astronaut) {

        System.out.println(
                "\n=== Moving towards the rocket ==="
        );

        System.out.println(
                astronaut.getName()
                + " is walking towards the rocket."
        );
    }

    // Astronaut boards the rocket
    public static void boardRocket(
            Astronaut astronaut) {

        System.out.println(
                "\n=== Boarding the rocket ==="
        );

        astronaut.board();
    }

    // Engineer repairs equipment
    public static void engineerRepairsEquipment(
            Engineer engineer) {

        System.out.println(
                "\n=== Engineer repairing equipment ==="
        );

        SolarPanel panel = new SolarPanel();

        engineer.repairEquipment(panel);
    }

    // Photographer performs their special task
    public static void photographerPreparesCamera(
            Photographer photographer) {

        System.out.println(
                "\n=== Photographer preparing the camera ==="
        );

        photographer.performTask();
    }
}