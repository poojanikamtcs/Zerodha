package parametrised_constructor;

public class Pubg
{                           // ULC
	public static void main(String[] args) {
		Gun g = new Gun ("AK47",10);
				g.shoot();
		System.out.println("1st shoot is completed");
		Gun g1 = new Gun ("Pistol",6);
				g1.shoot();
		System.out.println("2nd shoot completed");
	}

}
