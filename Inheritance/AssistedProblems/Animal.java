class Animal {
	protected String name;
	protected int age;
	
	//Constructor
	Animal(String name, int age) {
		this.name  = name;
		this.age = age;
	}
	
	//Method to be override
	public void makeSound() {
		System.out.println("Some generic animal sound.");
	}
}

//Subclass Dog
class Dog extends Animal {
	Dog(String name, int age) {
		super(name, age);
	}
	
	@Override 
	public void makeSound() {
		System.out.println(name + " (Dog) says : Woof! Woof!");
	}
}

//Subclass Cat
class Cat extends Animal {
	Cat(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void makeSound() {
		System.out.println(name + " (Cat) says : Meow!");
	}
}

//Subclass Bird
class Bird extends Animal {
	Bird(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void makeSound() {
		System.out.println(name + " (Bird) says : Tweet!");
	}
}


