package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PopUp extends JDialog {
	public PopUp() {
	}
	
	 // Variable que cuenta las ventas
    private int ventasContadas = 0;

    public static void main(String[] args) {
        new PopUp().crearInterfaz();
    }

    public void crearInterfaz() {
        // Crear el JDialog principal de la tienda
        JDialog dialog = new JDialog();
        dialog.setTitle("Tienda");
        dialog.setSize(400, 300);
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        // Crear el botón de 'Vender'
        JButton venderButton = new JButton("Vender");
        
        venderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventasContadas++;

                // Verificar si se alcanzaron 5 ventas
                if (ventasContadas >= 5) {
                    // Mostrar el pop-up (un JDialog nuevo)
                    mostrarPopUp();
                }

                // Puedes imprimir en consola para verificar que las ventas se están contando
                System.out.println("Ventas: " + ventasContadas);
            }
        });

        // Añadir el botón de "Vender" al JDialog
        dialog.getContentPane().add(venderButton);

        // Hacer visible el JDialog principal
        dialog.setVisible(true);
    }

    // Método para mostrar el pop-up con la información de las ventas
    private void mostrarPopUp() {
        // Crear un JDialog modal para el pop-up
        JDialog popUp = new JDialog();
        popUp.setTitle("¡Felicidades!");
        popUp.setSize(300, 150);
        popUp.setLocationRelativeTo(null); // Centra el pop-up en la pantalla

        // Crear un JLabel para mostrar el mensaje
        JLabel mensaje = new JLabel("¡Has alcanzado " + ventasContadas + " ventas!", SwingConstants.CENTER);
        popUp.getContentPane().add(mensaje);

        // Hacer visible el pop-up
        popUp.setVisible(true);
    }
}
	