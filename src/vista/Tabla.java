package vista;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import modelo.Usuarios;
import beans.Infousu;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextPane;

public class Tabla extends JFrame {

	private JPanel contentPane;
	private JTable table;

	public Tabla() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 750, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(10, 11, 573, 339);
		contentPane.add(table);
		
		JButton botonCrear = new JButton("Crear");
		botonCrear.setBounds(593, 11, 112, 56);
		contentPane.add(botonCrear);
		
		JButton botonBorrar = new JButton("Borrar");
		botonBorrar.setBounds(593, 78, 112, 56);
		contentPane.add(botonBorrar);
		
		JButton botonModificar = new JButton("Modificar");
		botonModificar.setBounds(593, 145, 112, 56);
		contentPane.add(botonModificar);
		
		JButton botonRefrescar = new JButton("Refrescar");
		botonRefrescar.setBounds(593, 294, 112, 56);
		contentPane.add(botonRefrescar);
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon("C:\\Proyecto\\ADAITS\\Programaci\u00F3n\\Proyecto-MVC\\Imag\\Fondoatras.png"));
		lblFondo.setBounds(0, 0, 734, 361);
		contentPane.add(lblFondo);
		
		
		
		
		
		setVisible(true);
	}
}
