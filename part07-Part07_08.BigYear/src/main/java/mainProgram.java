
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter
        BirdRegister birdRegister = new BirdRegister();

        Scanner scan = new Scanner(System.in);

        System.out.println("Commands:\nAdd - adds a bird\nObservation - adds an observation\nAll - prints all birds\nOne - prints one bird\nQuit - ends the program");
        while (true) {
            System.out.println("?");

            String command = scan.nextLine();

            if (command.equals("Quit")) {
                break;
            }

            if (command.equals("Add")) {
                System.out.println("Name");
                String name = scan.nextLine();
                System.out.println("Name in Latin:");
                String nameInLatin = scan.nextLine();

                Bird bird = new Bird(name, nameInLatin);
                birdRegister.add(bird);
            }

            if (command.equals("Observation")) {
                System.out.println("Bird?");
                String name = scan.nextLine();
                ArrayList<Bird> birdsList = birdRegister.getBirdsList();
                Optional<Bird> bird = birdsList.stream().filter(b -> b.getName().equals(name)).findFirst();

                if (!bird.isPresent()) {
                    System.out.println("Not a bird!");
                } else {
                    bird.get().registerObservation();
                }

            }

            if (command.equals("All")) {
                ArrayList<Bird> birdsList = birdRegister.getBirdsList();

                for (Bird bird : birdsList) {
                    System.out.println(bird);
                }
            }

            if (command.equals("One")) {
                System.out.println("Name");
                String name = scan.nextLine();
                ArrayList<Bird> birdsList = birdRegister.getBirdsList();
                Optional<Bird> bird = birdsList.stream().filter(b -> b.getName().equals(name)).findFirst();
                
                if (!bird.isPresent()) {
                    System.out.println("Not a bird!");
                } else {
                    System.out.println(bird.get());
                }

            }
        }

    }

}
