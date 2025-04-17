package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class MantenimientoConsultar extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JComboBox cboModelo;
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtAlto;
	private JTextField txtFondo;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MantenimientoConsultar dialog = new MantenimientoConsultar();
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
	public MantenimientoConsultar() {
		//TODO ESTO SON CONSTRUCTORES
		setTitle("Consultar Refrigeradora");
		setBounds(100, 100, 440, 190);
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
		cboModelo.setModel(new DefaultComboBoxModel(new String[] {"LG LTCS20020W", "Samsung RB195ACRS", "Whirlpool WRT318FZDM", "Bosch B36BT930NS", "LG LSXS26366S"}));
		cboModelo.addActionListener(this);
		cboModelo.setBounds(110, 7, 144, 22);
		getContentPane().add(cboModelo);

		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(110, 33, 143, 20);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtAncho = new JTextField();
		txtAncho.setColumns(10);
		txtAncho.setBounds(111, 58, 143, 20);
		getContentPane().add(txtAncho);
		
		txtAlto = new JTextField();
		txtAlto.setColumns(10);
		txtAlto.setBounds(111, 83, 143, 20);
		getContentPane().add(txtAlto);
		
		txtFondo = new JTextField();
		txtFondo.setColumns(10);
		txtFondo.setBounds(111, 108, 143, 20);
		getContentPane().add(txtFondo);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(320, 11, 89, 23);
		getContentPane().add(btnCerrar);
		//PARA QUE LOS DATOS APAREZCAN AL ABRIR
		actionPerformedCboModelo(null);
		//PARA QUE EL USUARIO NO PUEDA EDITAR
		txtPrecio.setEditable(false);
		txtAncho.setEditable(false);
		txtAlto.setEditable(false);
		txtFondo.setEditable(false);
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
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
	//BOTON CERRAR
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
}
