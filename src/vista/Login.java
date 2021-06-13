package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controlador.Central;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Login extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;


	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario.setToolTipText("");
		lblUsuario.setBackground(Color.WHITE);
		lblUsuario.setForeground(new Color(255, 255, 102));
		lblUsuario.setBounds(27, 36, 92, 20);
		contentPane.add(lblUsuario);
		
		
		JLabel lblPassW = new JLabel("Contraseña");
		lblPassW.setToolTipText("");
		lblPassW.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassW.setForeground(new Color(255, 255, 102));
		lblPassW.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblPassW.setBackground(Color.WHITE);
		lblPassW.setBounds(27, 67, 103, 20);
		contentPane.add(lblPassW);
		
		JButton btnEntrar = new JButton("Ingresar");
		btnEntrar.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		
		btnEntrar.setBounds(305, 180, 98, 38);
		contentPane.add(btnEntrar);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(140, 67, 127, 20);
		contentPane.add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(140, 39, 103, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Proyecto\\ADAITS\\Programaci\u00F3n\\Proyecto-MVC\\Imag\\image-removebg-preview (6).png"));
		lblNewLabel.setBounds(50, 112, 171, 138);
		contentPane.add(lblNewLabel);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon("C:\\Proyecto\\ADAITS\\Programaci\u00F3n\\ProyectoEclipse\\Proyecto\\Imag\\Fondoatras.png"));
		lblFondo.setBounds(0, 0, 434, 261);
		contentPane.add(lblFondo);
		
		/* Hacer visible el boton  */
		
		setVisible(true);
		
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Central().abrirTabla();
			}
		});
	}
}
