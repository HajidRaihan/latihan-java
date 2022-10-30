class Hero{
	String name;
	void name(){
		System.out.println("Hero1 : " + name);
	}
}
class Hero2 extends Hero{
	void name(){
		System.out.println("Hero2 : " + name);
	}
}
class Dynamic{
	public static void main(String[] args) {
		Hero hero1 = new Hero();
		hero1.name = "Kacchan";
		hero1.name();

		Hero2 hero2 = new Hero2();
		hero2.name = "All Might";
		hero2.name();
	}
}
