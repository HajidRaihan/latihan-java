import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.Map;
import java.util.HashMap;


class Kamus{
	
	public static void main(String[] args) {
		new Kamus();	
		
	}

	public Kamus(){
		initComponent();

	}

	private void initComponent(){
		JFrame frame = new JFrame("Kamus Bahasa Bugis");  
		frame.setSize(450, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		
		Font font = new Font("Arial", Font.BOLD, 14);
		Font font2 = new Font("Arial", Font.BOLD, 14);

		Color warna = new Color(0, 255, 0);

		JLabel label = new JLabel("Masukkan Kata  : ");
		label.setBounds(30, 30, 150, 30);
		label.setFont(font);
		frame.add(label);

		JLabel label2 = new JLabel("Terjemahan        : ");
		label2.setBounds(30, 80, 150, 30);
		label2.setFont(font2);
		frame.add(label2);

		JTextField txtInput = new JTextField();
		txtInput.setBounds(180, 30, 180, 30);
		frame.add(txtInput);

		JTextField txtHasil = new JTextField();
		txtHasil.setBounds(180, 80, 180, 30);
		frame.add(txtHasil);

		frame.setVisible(true);

		txtInput.addKeyListener(new KeyListener(){

			public void keyTyped(KeyEvent e){

			}
			public void keyPressed(KeyEvent e){
				String inputText = txtInput.getText();
				HashMap <String, String> kata = new HashMap<String, String>();

				// ======= Daftar Kosa Kata ========
								kata.put("saya", "iya'");
				kata.put("kamu", "idi',iko");
				kata.put("dia", "alena");
				kata.put("kami", "idi'");
				kata.put("kita", "idi'");
				kata.put("kalian", "idi'");
				kata.put("mereka", "ya maneng");
				kata.put("ini", "yae");
				kata.put("itu", "yaro");
				kata.put("sini", "akkoe");
				kata.put("situ", "akkoro");
				kata.put("sana", "akkoro");
				kata.put("siapa", "niga");
				kata.put("apa", "aga");
				kata.put("di mana", "kega");
				kata.put("kapan", "uppanna");
				kata.put("bagaimana", "pekkoga");
				kata.put("tidak", "tania");
				kata.put("bukan", "tania");
				kata.put("semua", "maneng");
				kata.put("banyak", "mega");
				kata.put("beberapa", "siaga-siaga");
				kata.put("sedikit", "ce'de");
				kata.put("lain", "laeng");
				kata.put("satu", "siddi atau se'di");
				kata.put("dua", "duwa");
				kata.put("tiga", "téllu");
				kata.put("empat", "éppa");
				kata.put("lima", "lima");
				kata.put("besar", "maloppo");
				kata.put("panjang", "malampe");
				kata.put("lebar", "mallebba'");
				kata.put("tebal", "maumpe'");
				kata.put("berat", "matane'");
				kata.put("kecil", "mabiccu'");
				kata.put("pendek", "maponco'");
				kata.put("sempit", "macipi'");
				kata.put("tipis", "manipi'");
				kata.put("perempuan", "makkunrai");
				kata.put("laki-laki", "urane");
				kata.put("manusia", "tau");
				kata.put("anak", "ana'");
				kata.put("istri", "bene");
				kata.put("suami", "lakkai");
				kata.put("ibu", "indo'");
				kata.put("ayah", "ambo'");
				kata.put("binatang", "olo'kolo'");
				kata.put("ikan", "bale");
				kata.put("burung", "manu'-manu atau dongi'");
				kata.put("anjing", "asu");
				kata.put("kutu", "utu");
				kata.put("ular", "ula'");
				kata.put("cacing", "bito");
				kata.put("pohon", "tanet-taneng");
				kata.put("hutan", "ale'");
				kata.put("ranting", "takke iccu'");
				kata.put("buah", "bua");
				kata.put("biji", "lice'");
				kata.put("daun", "raun'");
				kata.put("akar", "ure''");
				kata.put("kulit kayu", "uli aju'");
				kata.put("bunga", "bunga'");
				kata.put("rumput", "ruu''");
				kata.put("tali", "tulu''");
				kata.put("daging'", "juku''");
				kata.put("kulit", "uli''");
				kata.put("darah", "cera''");
				kata.put("tulang", "kabuttu'");
				kata.put("lemak", "lappe'");
				kata.put("telur", "tello'");
				kata.put("tanduk", "tanru''");
				kata.put("ekor", "ikko''");
				kata.put("bulu", "hulu'");
				kata.put("rambut", "belua'");
				kata.put("kepala", "ulu'");
				kata.put("telinga", "coli'");
				kata.put("mata", "mata'");
				kata.put("hidung", "inge''");
				kata.put("mulut", "timu'");
				kata.put("gigi", "isi'");
				kata.put("lidah", "lilla'");
				kata.put("kuku", "kanuku'");
				kata.put("kaki", "aje'");
				kata.put("lutut", "uttu''");
				kata.put("tangan", "lima'");
				kata.put("perut", "perru''");
				kata.put("leher", "éllong'");
				kata.put("payudara", "tete'");
				kata.put("minum", "minung'");
				kata.put("makan", "manre'");
				kata.put("gigit", "mattoa''");
				kata.put("isap", "mangngiso''");
				kata.put("ludah ", "miccu'atau mammiccu");
				kata.put("muntah", "tallua'");
				kata.put("tiup", "ma'berrung'");
				kata.put("nafas", "makkinnyawa'");
				kata.put("tawa", "micawa,macawa,mecawa'");
				kata.put("lihat", "makkita");
				kata.put("dengar", "mangkalinga");
				kata.put("tahu", "misséng");
				kata.put("pikir", "mappikkiri'");
				kata.put("cium", "cippo");
				kata.put("takut", "mitau'");
				kata.put("tidur", "matinro");
				kata.put("hidup", "tuo");
				kata.put("mati", "mate");
				kata.put("bunuh", "uno,mammuno");
				kata.put("kelahi", "mangkaga");
				kata.put("buru", "mattolu");
				kata.put("pukul", "péppe");
				kata.put("potong", "polo");
				kata.put("belah", "pue");
				kata.put("tusuk", "to'do");
				kata.put("coret", "maccore");
				kata.put("gali", "kae");
				kata.put("renang", "nange,lange");
				kata.put("terbang", "luttu'");
				kata.put("jalan", "jokka");
				kata.put("datang", "éngka");
				kata.put("baring", "leu");
				kata.put("duduk", "tudang");
				kata.put("diri", "tettong");
				kata.put("belok", "belo");
				kata.put("jatuh", "mabuang");
				kata.put("beri", "péreng");
				kata.put("pegang", "makkatenni");
				kata.put("peras", "pérra");
				kata.put("gosok", "goso'");
				kata.put("cuci", "mabbissa");
				kata.put("tarik", "marrui");
				kata.put("dorong", "sorong");
				kata.put("lempar", "marrempe'");
				kata.put("ikat", "massio'");
				kata.put("jahit", "ma'jai");
				kata.put("hitung", "marrekeng,maddekeng");
				kata.put("kata", "ma'bicara");
				kata.put("nyanyi", "makkelong");
				kata.put("main", "maccule");
				kata.put("apung", "mawang");
				kata.put("alir", "maccolo");
				kata.put("beku", "mabékku'");
				kata.put("bengkak", "boro");
				kata.put("matahari", "mataesso");
				kata.put("bulan", "uleng");
				kata.put("bintang", "bintoeng");
				kata.put("air", "wae");
				kata.put("hujan", "bosi");
				kata.put("sungai", "salo");
				kata.put("laut", "tasi");
				kata.put("garam", "péjje");
				kata.put("batu", "batu");
				kata.put("pasir", "késsi");
				kata.put("debu", "alulu");
				kata.put("bumi", "bumi");
				kata.put("awan", "éllung");
				kata.put("langit", "langi'");
				kata.put("angin", "anging");
				kata.put("salju", "saléju");
				kata.put("es", "ese'");
				kata.put("asap", "dumpu,rumpu");
				kata.put("api", "api");
				kata.put("abu", "abu");
				kata.put("bakar", "tunu");
				kata.put("jalan", "laleng");
				kata.put("gunung", "bulu'");
				kata.put("merah", "cella'");
				kata.put("hijau", "cémbulo, ijo");
				kata.put("kuning", "ridi");
				kata.put("putih", "pute");
				kata.put("hitam", "lotong");
				kata.put("malam", "wénni");
				kata.put("hari", "ésso");
				kata.put("tahun", "taung");
				kata.put("hangat", "kémmu");
				kata.put("dingin", "kécce, macékke, makécce");
				kata.put("penuh", "penno");
				kata.put("baru", "baru, mabaru");
				kata.put("tua", "toa, matoa");
				kata.put("baik", "kanja'");
				kata.put("buruk", "maja'");
				kata.put("busuk", "kébbong");
				kata.put("kotor", "rota, marota");
				kata.put("lurus", "lémpu, malémpu");
				kata.put("bulat", "lebu, malebu");
				kata.put("tajam", "taréng");
				kata.put("tumpul", "kunru, makunru");
				kata.put("licin", "maléngngo");
				kata.put("basah", "marica");
				kata.put("kering", "marakko");
				kata.put("betul", "tongéng");
				kata.put("dekat", "cawe, macawe, micawe");
				kata.put("jauh", "bela, mabela");
				kata.put("kanan", "kanang");
				kata.put("kiri", "kiri");
				kata.put("di", "ri");
				kata.put("dalam", "laleng");
				kata.put("dengan", "sibawa");
				kata.put("dan", "na");
				kata.put("kalau", "rekko, narekko");
				kata.put("karena", "nasaba");
				kata.put("nama", "aseng");
				kata.put("icha", "cantik");
				
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {

					if (kata.containsKey(inputText)) {
						txtHasil.setText(kata.get(inputText));
					}
					else if (inputText.equals("")) {
						txtHasil.setText("");
					}
					else{
						JOptionPane.showMessageDialog(null, "Kata tidak ditemukan");
					}	
				}
			}
			public void keyReleased(KeyEvent e){

			}
		});
	}
		
}
		



