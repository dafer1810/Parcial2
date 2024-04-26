
package Parcial_G02_DanielaMoreno_DarcyYandi;

public class Sport extends Moto{
    private String motor;
    private String potencia;
    private String tanque;

    public Sport(String placa, int modelo, int cilindraje, String motor, String potencia, String tanque) {
        super(placa, modelo, cilindraje);
        this.motor = motor;
        this.potencia = potencia;
        this.tanque = tanque;
    }

    public String getMotor() {
        return motor;
    }

    public String getPotencia() {
        return potencia;
    }

    public String getTanque() {
        return tanque;
    }

    public String motorGarantia() {
        if (motor.equals("4T")) {
            return "La garantía de la moto es por 2 años";
        } else if (motor.equals("monocilindrico")) {
            return "La garantía de la moto es por 1 año";
        } else {
            return "Tipo de motor no reconocido";
        }
    }       
}
