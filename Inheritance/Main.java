class Hero{
	String name;
	String movement;
	void display(){
		System.out.println("Name : " + name);
		if (name.equals("Ayam")) {
			System.out.println("ini ayam");
		} else if(name.equalsIgnoreCase("onta")){  			
			System.out.println("ini onta");
		}
	}
	void bergerak(){
		System.out.println("movement : " + movement);
	}
}
class HeroStrenght extends Hero{
	String wafat;
}

class Main{
	public static void main(String[] args) {
		Hero hero1 = new Hero();
		hero1.name = "Ayam";
		hero1.movement = "Lompat";
		hero1.display();
		hero1.bergerak();

		HeroStrenght hero2 = new HeroStrenght();
		hero2.name = "Onta";
		hero2.movement = "berlari";
		hero2.wafat = "meninggoy";
		hero2.display();
		hero2.bergerak();
		System.out.println(hero2.wafat);
	}
}