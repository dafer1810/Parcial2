
package Parcial_G02_DanielaMoreno_DarcyYandi;

import javax.swing.JOptionPane;


public class ChevroletSail extends Sedan {
    private String tanque;
    private boolean seguro;

    public ChevroletSail(String placa, int modelo, double precio, double motor, boolean frenos, String tanque, boolean seguro) {
        super(placa, modelo, precio, motor, frenos);
        this.tanque = tanque;
        this.seguro = seguro;
    }

    
    public String getTanque() {
        return tanque;
    }

    public boolean isSeguro() {
        return seguro;
    }

    public void seguro() {
        if (seguro) {
            JOptionPane.showInputDialog(null,"El automóvil tiene seguro todo riesgo");
        } else {
            JOptionPane.showInputDialog(null,"El automóvil no tiene seguro todo riesgo");
        }
    }

    public void precioSeguro() {
        if (getPrecio() > 50000000) {
            double valorSeguro = getPrecio() * 0.1;
            System.out.println("El valor del seguro es: " + valorSeguro);
        } else {
            System.out.println("No hay valor del seguro puesto que el valor del automóvil es menor a 50.000.000");
        }
    }
}

