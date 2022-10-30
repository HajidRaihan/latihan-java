class Quiz1_2 extends Quiz1{
	public void Panggil(){
		super.Matakuliah();
		System.out.println("nama mata kuliah");
	}
	public void A(){
		System.out.println("pengantar pemrograman");
	}
	public void B(){
		System.out.println("Matdas");
	}
	public static void main(String[] args) {
		Quiz1_2 scs = new Quiz1_2();
		scs.Panggil();
		scs.A();
		scs.B();
	}
}