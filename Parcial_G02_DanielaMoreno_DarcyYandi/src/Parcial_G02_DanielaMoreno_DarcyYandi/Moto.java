
package Parcial_G02_DanielaMoreno_DarcyYandi;


public class Moto {
    private String placa;
    private int modelo;
    private int cilindraje;

    public Moto(String placa, int modelo, int cilindraje) {
        this.placa = placa;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
    }

    
    public String getPlaca() {
        return placa;
    }

    public int getModelo() {
        return modelo;
    }

    public int getCilindraje() {
        return cilindraje;
    }
}

