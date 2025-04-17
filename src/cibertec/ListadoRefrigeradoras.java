package cibertec;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListadoRefrigeradoras extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnCerrar;
	private JButton btnListar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListadoRefrigeradoras dialog = new ListadoRefrigeradoras();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public ListadoRefrigeradoras() {
		setTitle("Listado de Refrigeradoras");
		setBounds(100, 100, 470, 350);
		getContentPane().setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 434, 250);
		getContentPane().add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 12));
		scrollPane.setViewportView(txtS);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(90, 272, 89, 23);
		getContentPane().add(btnCerrar);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(275, 272, 89, 23);
		getContentPane().add(btnListar);
	}
	//CLASE PARA AGRUPAR LOS DATOS
	public static class Tienda {
		public static String[] modelos = {
			"LG LTCS20020W", "Samsung RB195ACRS", "Whirlpool WRT318FZDM", "Bosch B36BT930NS", "LG LSXS26366S"
		};
		
		public static double[] precios = {949.0, 1089.0, 850.0, 629.0, 849.0};
		public static double[] ancho = {60.0, 80.0, 60.0, 61.6, 75.4};
		public static double[] alto = {91.0, 94.0, 90.0, 95.0, 94.5};
		public static double[] fondo = {58.6, 67.5, 50.0, 51.5, 66.0};
	}
	//BOTON CERRAR
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == btnListar) {
			actionPerformedBtnListar(e);
		}
	}
	//BOTON LISTAR
	protected void actionPerformedBtnListar(ActionEvent e) {

		txtS.setText("LISTADO DE REFRIGERADORAS\n\n"); // Limpia el área
		for (int i = 0; i < Tienda.modelos.length; i++) {
			txtS.append(String.format("Modelo        : %s%n" , Tienda.modelos[i] , "\n"));
			txtS.append(String.format("Precio (S/.)  : %.2f%n" , Tienda.precios[i] , "\n"));
			txtS.append(String.format("Ancho         : %.1f cm%n" , Tienda.ancho[i] , " cm\n"));
			txtS.append(String.format("Alto          : %.1f cm%n" , Tienda.alto[i] , " cm\n"));
			txtS.append(String.format("Fondo         : %.1f cm%n" , Tienda.fondo[i] , " cm\n"));
			txtS.append("-----------------------------------------------------\n");
			
		}
	}
	//BOTON CERRAR
	protected void actionPerformedBtnCerrar(ActionEvent e) {
	dispose();
	}
}
