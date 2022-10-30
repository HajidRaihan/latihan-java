class Family{
	String nama1;
	String nama2;

}
class Bapak extends Family{
	public void name(){
		System.out.println("nama bapak : " + nama1);
	}
}
class Anak extends Bapak{
	public void name(){
		System.out.println("nama anak : " + nama2);
	}
}

class Keluarga{
	public static void main(String[] args) {
		Bapak father = new Bapak();
		father.nama1 = "Haris";
		father.name();

		Anak son = new Anak();
		son.nama2 = "Hajid";
		son.name();
	}
}