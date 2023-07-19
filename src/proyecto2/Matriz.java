package proyecto2;

import javax.swing.JOptionPane;

/**
 *
 * @author khs16
 */
public class Matriz {

    int matriz[][];
    int cima1, cima2, cima3;

    public Matriz(int fila, int colu) {

        matriz = new int[fila][colu];
        cima1 = -1;
        cima2 = -1;
        cima3 = -1;
    }

    public void meteDato1(int dato) {
        cima1++;
        matriz[0][cima1] = dato;
    }

    public void meteDato2(int dato) {
        cima2++;
        matriz[1][cima2] = dato;
    }

    public void meteDato3(int dato) {
        cima3++;
        matriz[2][cima3] = dato;
    }

    public boolean estaLlena1() {
        return matriz[0].length - 1 == cima1;
    }

    public boolean estaLlena2() {
        return matriz[1].length - 1 == cima2;
    }

    public boolean estaLlena3() {
        return matriz[2].length - 1 == cima3;
    }

    public boolean estaOcupado1(int dato) {
        boolean ocupado = false;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[0][i] == dato) {
                ocupado = true;
            }
        }
        return ocupado;
    }

    public boolean estaOcupado2(int dato) {
        boolean ocupado = false;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[1][i] == dato) {
                ocupado = true;
            }
        }
        return ocupado;
    }

    public boolean estaOcupado3(int dato) {
        boolean ocupado = false;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[2][i] == dato) {
                ocupado = true;
            }
        }
        return ocupado;
    }

    public void mostrar() {
        int clase = 1;
        String mostrar = "";
        for (int i = 0; i < matriz.length; i++) {
            mostrar = mostrar + "-Clase " + clase++ + " ==> ";
            for (int ii = 0; ii < matriz[i].length; ii++) {
                mostrar = mostrar + " [ " + matriz[i][ii] + " ] ";
            }
            mostrar = mostrar + "\n";
        }

        JOptionPane.showMessageDialog(null, "Total de boletos\n\n" + mostrar);
    }
}
