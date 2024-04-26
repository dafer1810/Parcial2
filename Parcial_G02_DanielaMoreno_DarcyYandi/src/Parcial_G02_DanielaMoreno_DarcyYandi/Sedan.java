
package Parcial_G02_DanielaMoreno_DarcyYandi;

import javax.swing.JOptionPane;


public class Sedan extends Automovil {
    private double motor; 
    private boolean frenos; 

    public Sedan(String placa, int modelo, double precio, double motor, boolean frenos) {
        super(placa, modelo, precio);
        this.motor = motor;
        this.frenos = frenos;
    }

    public double getMotor() {
        return motor;
    }

    public boolean isFrenos() {
        return frenos;
    }
   
   public void frenosABS() {
        if (frenos) {
            JOptionPane.showInputDialog(null, "El automóvil tiene frenos ABS");
        } else {
           JOptionPane.showInputDialog(null, "El automóvil no tiene frenos ABS");
        }
    
   }
   
} 
    

