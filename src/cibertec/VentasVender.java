package cibertec;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class VentasVender extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField txtPrecio;
	private JTextField txtCantidad;
	private JComboBox cboModelo;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnVender;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentasVender dialog = new VentasVender();
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
	public VentasVender() {
		setTitle("Vender");
		setBounds(100, 100, 450, 340);
		getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("Modelo");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblNewLabel.setBounds(10, 11, 85, 14);
		getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Precio (S/.)");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(10, 46, 85, 14);
		getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Cantidad");
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(10, 80, 85, 14);
		getContentPane().add(lblNewLabel_2);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(120, 45, 120, 20);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(120, 79, 120, 20);
		getContentPane().add(txtCantidad);
		txtCantidad.setColumns(10);
		
		cboModelo = new JComboBox();
		cboModelo.addActionListener(this);
		cboModelo.setModel(new DefaultComboBoxModel(new String[] {"LG LTCS20020W", "Samsung RB195ACRS", "Whirlpool WRT318FZDM", "Bosch B36BT930NS", "LG LSXS26366S"}));
		cboModelo.setBounds(120, 9, 120, 22);
		getContentPane().add(cboModelo);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 115, 414, 175);
		getContentPane().add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		btnVender = new JButton("Vender");
		btnVender.addActionListener(this);
		btnVender.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnVender.setBounds(320, 9, 89, 23);
		getContentPane().add(btnVender);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnCerrar.setBounds(320, 44, 89, 23);
		getContentPane().add(btnCerrar);
		actionPerformedCboModelo(null);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == cboModelo) {
			actionPerformedCboModelo(e);
		}
		if (e.getSource() == btnVender) {
			actionPerformedBtnVender(e);
		}
	}
	//COMBO BOX
	protected void actionPerformedCboModelo(ActionEvent e) {
		int mar;
		mar = cboModelo.getSelectedIndex();
		switch (mar) {
			case 0: txtPrecio.setText(""+Tienda.precio0);break;
			case 1: txtPrecio.setText(""+Tienda.precio1);break;
			case 2: txtPrecio.setText(""+Tienda.precio2);break;
			case 3: txtPrecio.setText(""+Tienda.precio3);break;
			default: txtPrecio.setText(""+Tienda.precio4);
		}
	}
	//BOTON VENDER
	protected void actionPerformedBtnVender(ActionEvent e) {
		
		//int ventasContadas;
		//ventasContadas = 0;
		
		
		//contar la cantidad de index q tiene el array 
		
		 // Crear un JDialog modal para el pop-up
        JDialog popUp = new JDialog();
        popUp.setTitle("¡Felicidades!");
        popUp.setSize(300, 150);
        popUp.setLocationRelativeTo(null); // Centra el pop-up en la pantalla

        // Crear un JLabel para mostrar el mensaje
        //JLabel mensaje = new JLabel("¡Has alcanzado " + ventasContadas + " ventas!", SwingConstants.CENTER);
        //popUp.getContentPane().add(mensaje);

        // Hacer visible el pop-up
        popUp.setVisible(true);
        
		int mar, cant;
		double precio, icom, ides, ipag;
		String obse,model;
		mar = cboModelo.getSelectedIndex();
		cant = Integer.parseInt(txtCantidad.getText());
		if (mar == 0) {
			precio = Tienda.precio0;
			model = "LG LTCS20020W";
		
		}else if (mar == 1) {
			precio = Tienda.precio1;
			model ="Samsung RB195ACRS";
		}else if (mar == 2) {
			precio = Tienda.precio2;
			model = "Whirlpool WRT318FZDM";
		}else if (mar == 3) {
			precio = Tienda.precio3;
			model = "Bosch B36BT930NS";
		}else {
			precio = Tienda.precio4;
			model = "LG LSXS26366S";
		}
		//CALCULO IMPORTE DE COMPRA
		icom = precio*cant;
		
		//CALCULO DESCUENTO
		if (cant <= 5) {
			ides = Tienda.porcentaje1*icom/100;
		}else if (cant <=10) {
			ides = Tienda.porcentaje2*icom/100;
		}else if (cant <=15) {
			ides = Tienda.porcentaje3*icom/100;
		}else {
			ides = Tienda.porcentaje4*icom/100;
		}
		//CALCULO IMPORTE A PAGAR
		ipag = icom - ides;
		
		//OBTENER LOS DATOS DE VENTA PARA EL SIGUIENTE JDIALOG
				Tienda.unidadesVendidas[mar] += cant;
			    Tienda.totalVentasPorModelo[mar] += ipag;
			    
		//OBSEQUIOS
		if (cant == 1) {
			obse = Tienda.obsequio1;
		}else if (cant <=5) {
			obse = Tienda.obsequio2;
		}else {
			obse = Tienda.obsequio3;
		}
		
		// 1) Usar fuente monoespaciada para que los espacios se vean iguales:
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 12));

		// 2) Valoramos todo como String y usamos un solo formato unificado:
		String fmt = "%-22s: %15s%n";
		
		//guardar todos los datos en un array
		//array = []
		
		txtS.setText("BOLETA DE VENTA :\n\n");
		txtS.append(String.format(fmt, "Modelo",model));
		txtS.append(String.format(fmt, "Precio",String.format("S/.%.2f", precio)));
		txtS.append(String.format(fmt, "Cantidad",cant ));
		txtS.append(String.format(fmt, "Importe Compra",String.format("S/.%.2f", icom)));
		txtS.append(String.format(fmt, "Importe Descuento",String.format("S/.%.2f", ides)));
		txtS.append(String.format(fmt, "Importe a Pagar",String.format("S/.%.2f", ipag)));
		txtS.append(String.format(fmt, "Obsequio",obse));
	}

	//BOTON CERRAR
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
}
