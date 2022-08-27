package Overriding;

public class Method_overriding 
{                                  // ULC
	public static void main(String[] args) 
	{
		Animal a = new Animal();
		a.animalstalk();
		
		Cat c= new Cat();
		c.Catstalk();

		Dog d = new Dog();
		d.dogstalk();
	}
}
