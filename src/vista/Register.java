package vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Central;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;


	/**
	 * Create the frame.
	 */
	public Register() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(107, 30, 130, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxHombre = new JCheckBox("Hombre ");
		chckbxHombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxHombre.setBounds(184, 179, 97, 35);
		contentPane.add(chckbxHombre);
		
		JCheckBox chckbxMujer = new JCheckBox("Mujer");
		chckbxMujer.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxMujer.setBounds(306, 179, 97, 35);
		contentPane.add(chckbxMujer);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario.setToolTipText("");
		lblUsuario.setBackground(Color.WHITE);
		lblUsuario.setForeground(new Color(255, 255, 102));
		lblUsuario.setBounds(10, 27, 92, 20);
		contentPane.add(lblUsuario);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("");
		passwordField.setBounds(107, 61, 130, 20);
		contentPane.add(passwordField);
		
		JLabel lblPassW = new JLabel("Contraseña");
		lblPassW.setToolTipText("");
		lblPassW.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassW.setForeground(new Color(255, 255, 102));
		lblPassW.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblPassW.setBackground(Color.WHITE);
		lblPassW.setBounds(10, 58, 92, 20);
		contentPane.add(lblPassW);
		
		JLabel lblFotoDedo = new JLabel("");
		lblFotoDedo.setIcon(new ImageIcon("C:\\Proyecto\\ADAITS\\Programaci\u00F3n\\Proyecto-MVC\\Imag\\DeditoArriba.png"));
		lblFotoDedo.setBounds(-37, 103, 186, 158);
		contentPane.add(lblFotoDedo);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnRegistrarse.setBounds(282, 88, 121, 41);
		contentPane.add(btnRegistrarse);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon("C:\\Proyecto\\ADAITS\\Programaci\u00F3n\\ProyectoEclipse\\Proyecto\\Imag\\Fondoatras.png"));
		lblFondo.setBounds(0, 0, 434, 261);
		contentPane.add(lblFondo);
		
		/* Hacer visible el boton  */
		
		setVisible(true);

		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Central().abrirLogin();
				dispose();
			}
		});
	}
}
