package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import beans.Alumno;
import controlador.Central;

import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Tabla extends JFrame {

	private JPanel contentPane;
	private JTable table;

	public Tabla() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		DefaultTableModel dtm = new DefaultTableModel();
		table = new JTable(dtm);
		table.setBounds(10, 11, 573, 339);		
		contentPane.add(table);
		
		dtm.addColumn("ID");
		dtm.addColumn("Nombre");
		dtm.addColumn("FechaNacimiento");
		
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
		
		/* ACCIONES */
		
		botonCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Central().abrirFormularioAlumno();
			}
		});
		
		botonRefrescar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Alumno> alumnos = new Central().recogerTodosAlumnos();
				dtm.getDataVector().removeAllElements();
				dtm.fireTableDataChanged();
				for(Alumno alumno : alumnos){
					Object[] fila = new Object[3];
					fila[0] = alumno.getId();
					fila[1] = alumno.getNombre();
					fila[2] = alumno.getFechaNacimiento().toString();
					dtm.addRow(fila);
				}
			}
		});
		
		botonBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int posicionTabla = table.getSelectedRow();
				int idAlumno = (int) dtm.getValueAt(posicionTabla, 0);
				new Central().borrarAlumno(idAlumno);
			}
		});
		
		botonModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int posicionTabla = table.getSelectedRow();
				int id = (int) dtm.getValueAt(posicionTabla, 0);
				String nombre = (String) dtm.getValueAt(posicionTabla, 1);
				String fechaNacimientoTexto = (String) dtm.getValueAt(posicionTabla, 2);
				try {
					SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
					Date fechaNacimiento = new Date(format.parse(fechaNacimientoTexto).getTime());
					Alumno alumno = new Alumno(id, nombre, fechaNacimiento);
					new Central().AbrirFormularioAlumnoModificar(alumno);
				} catch (ParseException e1) {
					e1.printStackTrace();
				}
			}
		});
	}
}
