package vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;


	/**
	 * Create the frame.
	 */
	public Register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(125, 30, 130, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Hombre ");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxNewCheckBox.setBounds(301, 127, 97, 35);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Mujer");
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxNewCheckBox_1.setBounds(301, 179, 97, 35);
		contentPane.add(chckbxNewCheckBox_1);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario.setToolTipText("");
		lblUsuario.setBackground(Color.WHITE);
		lblUsuario.setForeground(new Color(255, 255, 102));
		lblUsuario.setBounds(23, 30, 92, 20);
		contentPane.add(lblUsuario);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("");
		passwordField.setBounds(125, 61, 170, 20);
		contentPane.add(passwordField);
		
		JLabel lblPassW = new JLabel("Contraseña");
		lblPassW.setToolTipText("");
		lblPassW.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassW.setForeground(new Color(255, 255, 102));
		lblPassW.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblPassW.setBackground(Color.WHITE);
		lblPassW.setBounds(23, 61, 92, 20);
		contentPane.add(lblPassW);
		
		JLabel lblFotoDedo = new JLabel("");
		lblFotoDedo.setIcon(new ImageIcon("C:\\Proyecto\\ADAITS\\Programaci\u00F3n\\Proyecto-MVC\\Imag\\DeditoArriba.png"));
		lblFotoDedo.setBounds(-37, 103, 186, 158);
		contentPane.add(lblFotoDedo);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon("C:\\Proyecto\\ADAITS\\Programaci\u00F3n\\ProyectoEclipse\\Proyecto\\Imag\\Fondoatras.png"));
		lblFondo.setBounds(0, 0, 434, 261);
		contentPane.add(lblFondo);
		
		/* Hacer visible el boton  */
		
		setVisible(true);
	}
}
