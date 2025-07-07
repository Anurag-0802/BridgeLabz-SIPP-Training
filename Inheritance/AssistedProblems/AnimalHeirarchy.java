import java.util.Scanner;

public class AnimalHeirarchy {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		
		System.out.println("Enter thr animal type : 1. Dog 2. Cat 3. Bird ");
		int choice = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the name of animal : ");
		name = sc.nextLine();
		System.out.println("Enter the age of animal : ");
		age = sc.nextInt();
		sc.nextLine();
		
		Animal animal;
		
		switch(choice) {
			case 1: 
				animal = new Dog(name, age);
				break;
			case 2: 
				animal = new Cat(name, age);
				break;
			case 3: 
				animal = new Bird(name, age);
				break;
			default:
				System.out.println("Invalid choice. Creating a generic animal.");
				animal = new Animal(name, age);
				break;
		}
		
		System.out.println("\n---- Animal Details ----");
        System.out.println("Name : " + animal.name);
        System.out.println("Age : " + animal.age);
        System.out.print("Sound : ");
        animal.makeSound();
	}

}
