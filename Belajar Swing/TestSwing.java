import javax.swing.JFrame;
import javax.swing.JLabel;

class TestSwing{
	public static void main(String[] args) {
		JFrame form = new JFrame("Aplikasi Perpustakaan");
		
		form.setSize(400, 500);
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		form.setLocationRelativeTo(null);
		form.setLayout(null);
		form.setVisible(true);

		JLabel labelJudul = new JLabel("Aplikasi Perpustakaan");
		labelJudul.setBounds(100, 30, 150, 30);
		form.add(labelJudul);
	}
}