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

		txtS.append(String.format("Modelo        : %s%n" , Tienda.modelo0 , "\n"));
		txtS.append(String.format("Precio (S/.)  : %.2f%n" , Tienda.precio0 , "\n"));
		txtS.append(String.format("Ancho         : %.1f cm%n" , Tienda.ancho0 , " cm\n"));
		txtS.append(String.format("Alto          : %.1f cm%n" , Tienda.alto0 , " cm\n"));
		txtS.append(String.format("Fondo         : %.1f cm%n" , Tienda.fondo0 , " cm\n"));
		txtS.append("-----------------------------------------------------\n");
		txtS.append(String.format("Modelo        : %s%n" , Tienda.modelo1 , "\n"));
		txtS.append(String.format("Precio (S/.)  : %.2f%n" , Tienda.precio1 , "\n"));
		txtS.append(String.format("Ancho         : %.1f cm%n" , Tienda.ancho1 , " cm\n"));
		txtS.append(String.format("Alto          : %.1f cm%n" , Tienda.alto1 , " cm\n"));
		txtS.append(String.format("Fondo         : %.1f cm%n" , Tienda.fondo1 , " cm\n"));
		txtS.append("-----------------------------------------------------\n");
		txtS.append(String.format("Modelo        : %s%n" , Tienda.modelo2 , "\n"));
		txtS.append(String.format("Precio (S/.)  : %.2f%n" , Tienda.precio2 , "\n"));
		txtS.append(String.format("Ancho         : %.1f cm%n" , Tienda.ancho2 , " cm\n"));
		txtS.append(String.format("Alto          : %.1f cm%n" , Tienda.alto2 , " cm\n"));
		txtS.append(String.format("Fondo         : %.1f cm%n" , Tienda.fondo2 , " cm\n"));
		txtS.append("-----------------------------------------------------\n");
		txtS.append(String.format("Modelo        : %s%n" , Tienda.modelo3 , "\n"));
		txtS.append(String.format("Precio (S/.)  : %.2f%n" , Tienda.precio3 , "\n"));
		txtS.append(String.format("Ancho         : %.1f cm%n" , Tienda.ancho3 , " cm\n"));
		txtS.append(String.format("Alto          : %.1f cm%n" , Tienda.alto3 , " cm\n"));
		txtS.append(String.format("Fondo         : %.1f cm%n" , Tienda.fondo3 , " cm\n"));
		txtS.append("-----------------------------------------------------\n");
		txtS.append(String.format("Modelo        : %s%n" , Tienda.modelo4 , "\n"));
		txtS.append(String.format("Precio (S/.)  : %.2f%n" , Tienda.precio4 , "\n"));
		txtS.append(String.format("Ancho         : %.1f cm%n" , Tienda.ancho4 , " cm\n"));
		txtS.append(String.format("Alto          : %.1f cm%n" , Tienda.alto4 , " cm\n"));
		txtS.append(String.format("Fondo         : %.1f cm%n" , Tienda.fondo4 , " cm\n"));
		txtS.append("-----------------------------------------------------\n");
	}
	//BOTON CERRAR
	protected void actionPerformedBtnCerrar(ActionEvent e) {
	dispose();
	}
}
