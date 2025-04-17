package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MantenimientoModificar extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JComboBox cboModelo;
	private JTextField txtAncho;
	private JTextField txtPrecio;
	private JTextField txtAlto;
	private JTextField txtFondo;
	private JButton btnCerrar;
	private JButton btnGuardar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MantenimientoModificar dialog = new MantenimientoModificar();
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
	public MantenimientoModificar() {
		setTitle("Modificar Refrigeradora");
		setBounds(100, 100, 440, 180);
		getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("Modelo");
		lblNewLabel.setBounds(10, 11, 70, 14);
		getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Precio (S/.)");
		lblNewLabel_1.setBounds(10, 36, 70, 14);
		getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Ancho (cm)");
		lblNewLabel_2.setBounds(10, 61, 70, 14);
		getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Alto (cm)");
		lblNewLabel_3.setBounds(10, 86, 70, 14);
		getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Fondo (cm)");
		lblNewLabel_4.setBounds(10, 111, 70, 14);
		getContentPane().add(lblNewLabel_4);
		
		cboModelo = new JComboBox();
		cboModelo.addActionListener(this);
		cboModelo.setModel(new DefaultComboBoxModel(new String[] {"LG LTCS20020W", "Samsung RB195ACRS", "Whirlpool WRT318FZDM", "Bosch B36BT930NS", "LG LSXS26366S"}));
		cboModelo.setBounds(90, 4, 144, 22);
		getContentPane().add(cboModelo);
		
		txtAncho = new JTextField();
		txtAncho.setColumns(10);
		txtAncho.setBounds(91, 55, 143, 20);
		getContentPane().add(txtAncho);
		
		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(90, 30, 143, 20);
		getContentPane().add(txtPrecio);
		
		txtAlto = new JTextField();
		txtAlto.setColumns(10);
		txtAlto.setBounds(91, 80, 143, 20);
		getContentPane().add(txtAlto);
		
		txtFondo = new JTextField();
		txtFondo.setColumns(10);
		txtFondo.setBounds(91, 105, 143, 20);
		getContentPane().add(txtFondo);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(310, 46, 89, 29);
		getContentPane().add(btnCerrar);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(this);
		btnGuardar.setBounds(310, 7, 89, 29);
		getContentPane().add(btnGuardar);
		//PARA QUE LOS TEXT FIELD APAREZCAN LLENOS
		actionPerformedCboModelo(null);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == btnGuardar) {
			actionPerformedBtnGuardar(e);
		}
		if (e.getSource() == cboModelo) {
			actionPerformedCboModelo(e);
		}
	}
	//COMBO BOX
	protected void actionPerformedCboModelo(ActionEvent e) {
		int c = cboModelo.getSelectedIndex();
		if (c==0) {
			txtPrecio.setText(""+Tienda.precio0);
			txtAncho.setText(""+Tienda.ancho0);
			txtAlto.setText(""+Tienda.alto0);
			txtFondo.setText(""+Tienda.fondo0);
		}else if (c==1) {
			txtPrecio.setText(""+Tienda.precio1);
			txtAncho.setText(""+Tienda.ancho1);
			txtAlto.setText(""+Tienda.alto1);
			txtFondo.setText(""+Tienda.fondo1);
		}else if (c==2) {
			txtPrecio.setText(""+Tienda.precio2);
			txtAncho.setText(""+Tienda.ancho2);
			txtAlto.setText(""+Tienda.alto2);
			txtFondo.setText(""+Tienda.fondo2);
		}else if(c==3) {
			txtPrecio.setText(""+Tienda.precio3);
			txtAncho.setText(""+Tienda.ancho3);
			txtAlto.setText(""+Tienda.alto3);
			txtFondo.setText(""+Tienda.fondo3);
		}else {
			txtPrecio.setText(""+Tienda.precio4);
			txtAncho.setText(""+Tienda.ancho4);
			txtAlto.setText(""+Tienda.alto4);
			txtFondo.setText(""+Tienda.fondo4);
		}
	}
	//BOTON GUARDAR
	protected void actionPerformedBtnGuardar(ActionEvent e) {
		int modelo = cboModelo.getSelectedIndex();
		double nuevoPrecio = Double.parseDouble(txtPrecio.getText());
		double nuevoAncho = Double.parseDouble(txtAncho.getText());
		double nuevoAlto = Double.parseDouble(txtAlto.getText());
		double nuevoFondo = Double.parseDouble(txtFondo.getText());
		
		switch (modelo) {
			case 0:
				Tienda.precio0 = nuevoPrecio;
				Tienda.ancho0 = nuevoAncho;
				Tienda.alto0 = nuevoAlto;
				Tienda.fondo0 = nuevoFondo;
				break;
			case 1:
				Tienda.precio1 = nuevoPrecio;
				Tienda.ancho1 = nuevoAncho;
				Tienda.alto1 = nuevoAlto;
				Tienda.fondo1 = nuevoFondo;
				break;
			case 2:
				Tienda.precio2 = nuevoPrecio;
				Tienda.ancho2 = nuevoAncho;
				Tienda.alto2 = nuevoAlto;
				Tienda.fondo2 = nuevoFondo;
				break;
			case 3:
				Tienda.precio3 = nuevoPrecio;
				Tienda.ancho3 = nuevoAncho;
				Tienda.alto3 = nuevoAlto;
				Tienda.fondo3 = nuevoFondo;
				break;
			case 4:
				Tienda.precio4 = nuevoPrecio;
				Tienda.ancho4 = nuevoAncho;
				Tienda.alto4 = nuevoAlto;
				Tienda.fondo4 = nuevoFondo;
				break;
				}
	}
	//BOTON CERRAR
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
}
