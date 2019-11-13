import java.util.Scanner;

public class AnimalApp {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        Animal myAnimal = new Animal();
        Animal userAnimal = new Animal();

        System.out.println("Here is a  sample of what your output will look like:-");
        myAnimal.setName("Snoopy");
        myAnimal.setType("German Shephard, Dog");
        myAnimal.setDescription("Very intelligent, attentive and Jolly");
        System.out.println(myAnimal.getPet());

        System.out.println("\n   Now it is your turn.");


        System.out.println("name: ");
        userAnimal.setName(key.nextLine());
        System.out.println("type: ");
        userAnimal.setType(key.nextLine());
        System.out.println("Description: ");
        userAnimal.setDescription(key.nextLine());
        System.out.println(userAnimal.getPet());

        System.out.println("Thank you for using my App!!");

    }


}