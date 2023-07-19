package proyecto2;

import javax.swing.JOptionPane;

/**
 *
 * @author khs16
 */
public class Proyecto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op = 0, dato, clase, full = 0, x = 4;
        int fila = 3, colu = 50;

        try {

            Matriz reserva = new Matriz(fila, colu);

            do {
                if (full == 3) {
                    JOptionPane.showMessageDialog(null, "Actualmente no contamos con boletos disponibles en ninguna de las Clases", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    op = 3;

                } else {

                    if (x == 0) {
                        op = 1;
                    } else {
                        op = Integer.parseInt(JOptionPane.showInputDialog("Digite que desea hacer\n\n"
                                + "1-Reservar asiento\n"
                                + "2-Ver total de asientos\n"
                                + "3-Salir\n"));
                    }
                    x = 4;
                }

                switch (op) {
                    case 1:

                        clase = Integer.parseInt(JOptionPane.showInputDialog("Digite en cual clase desea reservar\n\n"
                                + "1- Primera Clase\n"
                                + "2- Segunda Clase\n"
                                + "3- Tercera Clase"));

                        switch (clase) {
                            case 1:

                                if (!reserva.estaLlena1()) {
                                    dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de asiento que desea reservar"));
                                    if (dato <= 50) {

                                        if (reserva.estaOcupado1(dato) == true) {
                                            JOptionPane.showMessageDialog(null, "El asiento numero: " + dato + " de la Primera Clase no se encuentra disponible");
                                        } else {
                                            reserva.meteDato1(dato);
                                        }

                                    } else {
                                        JOptionPane.showMessageDialog(null, "Solo tenemos disponibles 50 asientos por clase");
                                    }

                                } else {
                                    x = JOptionPane.showConfirmDialog(null, "La Primera Clase se encuentra actualmente agotada.\n"
                                            + "Desea reservar en otra Clase?", "Aviso", JOptionPane.WARNING_MESSAGE);
                                    full = full + 1;
                                }
                                break;
                            case 2:

                                if (!reserva.estaLlena2()) {
                                    dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de asiento que desea reservar"));
                                    if (dato <= 50) {

                                        if (reserva.estaOcupado2(dato) == true) {
                                            JOptionPane.showMessageDialog(null, "El asiento numero: " + dato + " de la Segunda Clase no se encuentra disponible");
                                        } else {
                                            reserva.meteDato2(dato);
                                        }

                                    } else {
                                        JOptionPane.showMessageDialog(null, "Solo tenemos disponibles 50 asientos por clase");
                                    }

                                } else {
                                    x = JOptionPane.showConfirmDialog(null, "La Segunda Clase se encuentra actualmente agotada.\n"
                                            + "Desea reservar en otra Clase?", "Aviso", JOptionPane.WARNING_MESSAGE);
                                    full = full + 1;
                                }
                                break;
                            case 3:

                                if (!reserva.estaLlena3()) {
                                    dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de asiento que desea reservar"));
                                    if (dato <= 50) {
                                        if (reserva.estaOcupado3(dato) == true) {
                                            JOptionPane.showMessageDialog(null, "El asiento numero: " + dato + " de la Tercera Clase no se encuentra disponible");
                                        } else {
                                            reserva.meteDato3(dato);
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Solo tenemos disponibles 50 asientos por clase");
                                    }
                                } else {
                                    x = JOptionPane.showConfirmDialog(null, "La Tercera Clase se encuentra actualmente agotada.\n"
                                            + "Desea reservar en otra Clase?", "Aviso", JOptionPane.WARNING_MESSAGE);
                                    full = full + 1;
                                }
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Por favor digite una opcion", "Aviso", JOptionPane.ERROR_MESSAGE);
                                break;
                        }
                        break;

                    case 2:

                        reserva.mostrar();

                        break;
                    case 3:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Por favor digite una opcion", "Atencion", JOptionPane.ERROR_MESSAGE);
                        break;
                }
            } while (op != 3 && x != 2);
            JOptionPane.showMessageDialog(null, "Gracias por volar con nosotros!");
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(null, " Error " + n.getMessage());
        }
    }
}
