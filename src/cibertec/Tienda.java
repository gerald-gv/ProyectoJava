package cibertec;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tienda extends JFrame implements ActionListener {
	// Datos mínimos de la primera refrigeradora 
	public static String modelo0 = "LG LTCS20020W"; 
	public static double precio0 = 949.0; 
	public static double fondo0 = 58.6; 
	public static double ancho0 = 60.0; 
	public static double alto0 = 91.0; 
	// Datos mínimos de la segunda refrigeradora 
	public static String modelo1 = "Samsung RB195ACRS"; 
	public static double precio1 = 1089.0; 
	public static double ancho1 = 80.0; 
	public static double alto1 = 94.0;  
	public static double fondo1 = 67.5; 
	// Datos mínimos de la tercera refrigeradora 
	public static String modelo2 = "Whirlpool WRT318FZDM"; 
	public static double precio2 = 850.0; 
	public static double ancho2 = 60.0; 
	public static double alto2 = 90.0; 
	public static double fondo2 = 50.0; 
	// Datos mínimos de la cuarta refrigeradora 
	public static String modelo3 = "Bosch B36BT930NS"; 
	public static double precio3 = 629.0; 
	public static double ancho3 = 61.6; 
	public static double alto3 = 95.0; 
	public static double fondo3 = 51.5; 
	// Datos mínimos de la quinta refrigeradora 
	public static String modelo4 = "LG LSXS26366S"; 
	public static double precio4 = 849.0; 
	public static double ancho4 = 75.4; 
	public static double alto4 = 94.5; 
	public static double fondo4 = 66.0; 
	public static int quemadores4 = 5; 
	// Porcentajes de descuento 
	public static double porcentaje1 = 7.5; 
	public static double porcentaje2 = 10.0; 
	public static double porcentaje3 = 12.5; 
	public static double porcentaje4 = 15.0; 
	// Obsequios 
	public static String obsequio1 = "Cafetera"; 
	public static String obsequio2 = "Licuadora"; 
	public static String obsequio3 = "Extractor"; 
	// Cantidad óptima de unidades vendidas 
	public static int cantidadOptima = 30; 
	// Cuota diaria 
	public static double cuotaDiaria = 75000;
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuTienda;
	private JMenu mnArchivo;
	private JMenuItem mntmSalir;
	private JMenu mnMantenimiento;
	private JMenuItem mntmConsultar;
	private JMenuItem mntmModificar;
	private JMenuItem mntmListar;
	private JMenu mnVentas;
	private JMenuItem mntmVender;
	private JMenuItem mntmReportes;
	private JMenu mnConfiguracion;
	private JMenuItem mntmDescuentos;
	private JMenuItem mntmObsequios;
	private JMenuItem mntmCantidad;
	private JMenuItem mntmCuota;
	private JMenu mnAyuda;
	private JMenuItem mntmAcercaTienda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tienda frame = new Tienda();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tienda() {
		setTitle("Tienda 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		menuTienda = new JMenuBar();
		setJMenuBar(menuTienda);
		
		mnArchivo = new JMenu("Archivo");
		menuTienda.add(mnArchivo);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(this);
		mnArchivo.add(mntmSalir);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		menuTienda.add(mnMantenimiento);
		
		mntmConsultar = new JMenuItem("Consultar Refrigeradora");
		mntmConsultar.addActionListener(this);
		mnMantenimiento.add(mntmConsultar);
		
		mntmModificar = new JMenuItem("Modificar Refrigeradora");
		mntmModificar.addActionListener(this);
		mnMantenimiento.add(mntmModificar);
		
		mntmListar = new JMenuItem("Listar Refrigeradora");
		mntmListar.addActionListener(this);
		mnMantenimiento.add(mntmListar);
		
		mnVentas = new JMenu("Ventas");
		menuTienda.add(mnVentas);
		
		mntmVender = new JMenuItem("Vender");
		mnVentas.add(mntmVender);
		
		mntmReportes = new JMenuItem("Generar Reportes");
		mnVentas.add(mntmReportes);
		
		mnConfiguracion = new JMenu("Configuracion");
		menuTienda.add(mnConfiguracion);
		
		mntmDescuentos = new JMenuItem("Configurar Descuentos");
		mnConfiguracion.add(mntmDescuentos);
		
		mntmObsequios = new JMenuItem("Configurar Obsequios");
		mnConfiguracion.add(mntmObsequios);
		
		mntmCantidad = new JMenuItem("Configurar Cantidad Optima");
		mnConfiguracion.add(mntmCantidad);
		
		mntmCuota = new JMenuItem("Configurar Cuota Diaria");
		mnConfiguracion.add(mntmCuota);
		
		mnAyuda = new JMenu("Ayuda");
		menuTienda.add(mnAyuda);
		
		mntmAcercaTienda = new JMenuItem("Acerca de la Tienda");
		mnAyuda.add(mntmAcercaTienda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmListar) {
			actionPerformedMntmListar(e);
		}
		if (e.getSource() == mntmModificar) {
			actionPerformedMntmModificar(e);
		}
		if (e.getSource() == mntmConsultar) {
			actionPerformedMntmConsultar(e);
		}
		if (e.getSource() == mntmSalir) {
			actionPerformedMntmSalir(e);
		}
	}
	protected void actionPerformedMntmSalir(ActionEvent e) {
		System.exit(0);
	}
	
	//MANTENIMIENTO||CONSULTAR REFRIGERADORA
	protected void actionPerformedMntmConsultar(ActionEvent e) {
		MantenimientoConsultar dc = new MantenimientoConsultar();
		dc.setLocationRelativeTo(this);
		dc.setVisible(true);
	}
	//MANTENIMIENTO||MODIFICAR REFRIGERADORA
	protected void actionPerformedMntmModificar(ActionEvent e) {
		MantenimientoModificar dc = new MantenimientoModificar();
		dc.setLocationRelativeTo(this);
		dc.setVisible(true);
	}
	//MANTENIMIENTO||LISTAR REFRIGERADORA
	protected void actionPerformedMntmListar(ActionEvent e) {
		ListadoRefrigeradoras dc = new ListadoRefrigeradoras();
		dc.setLocationRelativeTo(this);
		dc.setVisible(true);
	}
}
