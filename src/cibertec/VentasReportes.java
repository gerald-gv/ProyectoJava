package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentasReportes extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JLabel lblTiposReporte;
	private JComboBox CboReportes;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentasReportes dialog = new VentasReportes();
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
	public VentasReportes() {
		setTitle("Generar Reportes");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		lblTiposReporte = new JLabel("Tipo de reporte");
		lblTiposReporte.setBounds(10, 21, 89, 14);
		getContentPane().add(lblTiposReporte);
		
		CboReportes = new JComboBox();
		CboReportes.addActionListener(this);
		CboReportes.setModel(new DefaultComboBoxModel(new String[] {"Ventas por modelo", "Ventas en relaci\u00F3n a la venta \u00F3ptima", "Precios en relacion al precio promedio", "Promedios, menores y mayores"}));
		CboReportes.setBounds(109, 17, 226, 22);
		getContentPane().add(CboReportes);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 51, 414, 199);
		getContentPane().add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		btnCancelar = new JButton("Cerrar");
		btnCancelar.setBounds(345, 17, 79, 23);
		getContentPane().add(btnCancelar);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == CboReportes) {
			actionPerformedCboReportes(e);
		}
	}
	protected void actionPerformedCboReportes(ActionEvent e) {
		//Declaracion del combo box
		int reporte = CboReportes.getSelectedIndex();
		
		//Seleccion de reporte
		
		if (reporte == 0) {
	        txtS.setText("VENTAS POR MODELO\n\n");

	        String[] modelos = {
	            "LG LTCS20020W", 
	            "Samsung RB195ACRS", 
	            "Whirlpool WRT318FZDM", 
	            "Bosch B36BT930NS", 
	            "LG LSXS26366S"
	        };

	        for (int i = 0; i < modelos.length; i++) {
	            txtS.append("Modelo                : " + modelos[i] + "\n");
	            txtS.append("  Unidades vendidas  : " + Tienda.unidadesVendidas[i] + "\n");
	            txtS.append("  Total vendido (S/.) : " + String.format("%.2f", Tienda.totalVentasPorModelo[i]) + "\n\n");
	        }

		}
	}
}
