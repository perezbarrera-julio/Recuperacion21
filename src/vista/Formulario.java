package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Central;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField textoNombre;
	private JTextField textoDia;
	private JTextField textoAnio;

	public Formulario() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCrear = new JButton("Crear Alumno");
		btnCrear.setBounds(120, 188, 185, 23);
		contentPane.add(btnCrear);
		
		textoNombre = new JTextField();
		textoNombre.setBounds(190, 31, 137, 20);
		contentPane.add(textoNombre);
		textoNombre.setColumns(10);
		
		textoDia = new JTextField();
		textoDia.setBounds(190, 71, 137, 20);
		contentPane.add(textoDia);
		textoDia.setColumns(10);
		
		textoAnio = new JTextField();
		textoAnio.setBounds(190, 133, 137, 20);
		contentPane.add(textoAnio);
		textoAnio.setColumns(10);
		
		JComboBox comboMes = new JComboBox();
		comboMes.setModel(new DefaultComboBoxModel(new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}));
		comboMes.setBounds(190, 100, 137, 22);
		contentPane.add(comboMes);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNombre.setBounds(99, 32, 76, 14);
		contentPane.add(lblNombre);
		
		JLabel lblDia = new JLabel("Dia");
		lblDia.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDia.setBounds(99, 74, 46, 14);
		contentPane.add(lblDia);
		
		JLabel lblMes = new JLabel("Mes");
		lblMes.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMes.setBounds(99, 104, 46, 14);
		contentPane.add(lblMes);
		
		JLabel lblAo = new JLabel("A\u00F1o");
		lblAo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAo.setBounds(99, 136, 46, 14);
		contentPane.add(lblAo);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon("C:\\Proyecto\\ADAITS\\Programaci\u00F3n\\Proyecto-MVC\\Imag\\fodnologin.jpg"));
		lblFondo.setBounds(0, 0, 434, 261);
		contentPane.add(lblFondo);
		
		setVisible(true);
		
		/* ACCIONES */
		
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String nombre = textoNombre.getText();
				int day = Integer.parseInt(textoDia.getText());
				int month = comboMes.getSelectedIndex();
				int year = Integer.parseInt(textoAnio.getText()) - 1900;
				Date fechaNacimiento = new Date(year, month, day);
				new Central().crearAlumno(nombre, fechaNacimiento);
				dispose();
				
			}
		});
	}
}
