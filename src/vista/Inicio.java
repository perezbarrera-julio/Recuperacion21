package vista;
	
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

public class Inicio extends JFrame {

	private JPanel contentPane;

	public Inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		/* Crear y ascociar panel al frame*/
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 204));
		contentPane.setForeground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenido");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		lblNewLabel.setBounds(24, 29, 190, 59);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("A Tu Login");
		lblNewLabel_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(204, 48, 190, 59);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
			}
		});
		btnNewButton.setForeground(Color.YELLOW);
		btnNewButton.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 19));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBounds(65, 138, 104, 41);
		contentPane.add(btnNewButton);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setForeground(Color.YELLOW);
		btnRegister.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 19));
		btnRegister.setBackground(Color.LIGHT_GRAY);
		btnRegister.setBounds(246, 138, 104, 41);
		contentPane.add(btnRegister);
		
		JLabel Fondoazul = new JLabel("");
		Fondoazul.setIcon(new ImageIcon("C:\\Proyecto\\ADAITS\\Programaci\u00F3n\\ProyectoEclipse\\Proyecto\\Imag\\fodnologin.jpg"));
		Fondoazul.setBounds(0, 0, 434, 261);
		contentPane.add(Fondoazul);
		
		/* Boton */
		
		setVisible(true);
	}
}
