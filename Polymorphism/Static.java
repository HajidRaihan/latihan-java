class Mahasiswa{
	void dataMahasiswa(String nama, String nim){
		System.out.println("Nama\t: " + nama);
		System.out.println("NIM\t: " + nim);
	}
	void dataMahasiswa(String jurusan, int umur){
		System.out.println("Jurusan\t: " + jurusan);
		System.out.println("Umur\t: " + umur);
	}
	void dataMahasiswa(double ipk){
		System.out.println("IPK\t: " + ipk);
	}
}
class Static{
	public static void main(String[] args) {
		Mahasiswa data = new Mahasiswa();
		data.dataMahasiswa("Hajid Raihan", "H071201016");
		data.dataMahasiswa("Sistem Informasi", 18);
		data.dataMahasiswa(3.75);
	}
}