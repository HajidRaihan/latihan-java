class Mahasiswa {
    private String name;
    private String nim;

    // ini method setter
    public void setName(String name){
        this.name = name;
        System.out.println("ini method setter");
        System.out.println("Nama : " + this.name);
    }
    public void setNIM(String nim){
        this.nim = nim;
        System.out.println("NIM : " + this.nim);
    }
    // ini method getter
    public String getName(){
        System.out.println("\nini method getter");
        return this.name;
    }

    public String getNIM(){
        return this.nim;
    }
}
class Enkapsulasi{
    public static void main(String[] args) {
        Mahasiswa siswa = new Mahasiswa();
        siswa.setName("Hajid Raihan");
        siswa.setNIM("H071201016");

        System.out.println("Nama : " + siswa.getName());
        System.out.println("NIM : " + siswa.getNIM());
    }
}