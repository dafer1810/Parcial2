
package Parcial_G02_DanielaMoreno_DarcyYandi;

import javax.swing.JOptionPane;

public class Principal {
     public static void main(String[] args) {
        int opcion = 0;

        do {
            String menu = " CONCESIONARIO CAUCANA DE VEHÍCULOS S.A. \n" +
                          " REGISTRO DE VEHÍCULOS VENDIDOS \n" +
                          "1. Registro de automóviles\n" +
                          "2. Registro de motos\n" +
                          "3. Vendedor\n" +
                          "4. Salir";
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, menu, "Menú", JOptionPane.QUESTION_MESSAGE));

            switch (opcion) {
                case 1:
                       String placaAuto = JOptionPane.showInputDialog(null, "Ingrese la placa del automóvil:", "Registro de Automóviles", JOptionPane.QUESTION_MESSAGE);
                       int modeloAuto = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el modelo del automóvil:", "Registro de Automóviles", JOptionPane.QUESTION_MESSAGE));
                       double precioAuto = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio del automóvil:", "Registro de Automóviles", JOptionPane.QUESTION_MESSAGE));

    
            Automovil auto = new Automovil(placaAuto, modeloAuto, precioAuto);
            JOptionPane.showMessageDialog(null, "Automóvil registrado:\n" + auto.getPlaca() + "\nModelo: " + auto.getModelo() + "\nPrecio: " + auto.getPrecio(), "Registro de Automóviles", JOptionPane.INFORMATION_MESSAGE);
                 break;
                   
                case 2:
                     String placaMoto = JOptionPane.showInputDialog(null, "Ingrese la placa de la moto:", "Registro de Motos", JOptionPane.QUESTION_MESSAGE);
                     int modeloMoto = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el modelo de la moto:", "Registro de Motos", JOptionPane.QUESTION_MESSAGE));
                     int cilindrajeMoto = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el cilindraje de la moto:", "Registro de Motos", JOptionPane.QUESTION_MESSAGE));
                    
                    Moto moto = new Moto(placaMoto, modeloMoto, cilindrajeMoto);
            JOptionPane.showMessageDialog(null, "Moto registrada:\n" + moto.getPlaca() + "\nModelo: " + moto.getModelo() + "\nCilindraje: " + moto.getCilindraje(), "Registro de Motos", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "VENDEDOR: "+
                                                        "\nDaniela Fernanda Moreno"+
                                                        "\nDarcy Lizbeth Yandi Flor");
                     
                    break; 
                case 4:
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema...", "Salida", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Intente de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (opcion != 4);
}
     
    
}
