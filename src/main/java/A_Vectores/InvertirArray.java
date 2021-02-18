package A_Vectores;
/**
 * @author Prof Matias Garcia.
 * <p> Copyright (C) 2017 para <a href = "https://www.profmatiasgarcia.com.ar/"> www.profmatiasgarcia.com.ar </a>
 * - con licencia GNU GPL3.
 * <p> Este programa es software libre. Puede redistribuirlo y/o modificarlo bajo los términos de la
 * Licencia Pública General de GNU según es publicada por la Free Software Foundation, 
 * bien con la versión 3 de dicha Licencia o bien (según su elección) con cualquier versión posterior. 
 * Este programa se distribuye con la esperanza de que sea útil, pero SIN NINGUNA GARANTÍA, 
 * incluso sin la garantía MERCANTIL implícita o sin garantizar la CONVENIENCIA PARA UN PROPÓSITO
 * PARTICULAR. Véase la Licencia Pública General de GNU para más detalles.
 * Debería haber recibido una copia de la Licencia Pública General junto con este programa. 
 * Si no ha sido así ingrese a <a href = "http://www.gnu.org/licenses/"> GNU org </a>
 */
public class InvertirArray {

    private static Object[] invertir_int;

    public static void main(String[] args) {
        Object[] arreglo = new Object[5];

        arreglo[0] = 0;
        arreglo[1] = 1;
        arreglo[2] = 2;
        arreglo[3] = 3;
        arreglo[4] = 4;

        for (int i = 0; i < arreglo.length; i++) {
            Object j = arreglo[i];
            System.out.println("Arreglo Normal: " + j);
        }

        try {
            invertir(arreglo);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (Object j : invertir_int) {
            System.out.println("Arreglo invertido: " + j);
        }
//        for (int i = 0; i < invertir_int.length; i++) {
//            Object j = invertir_int[i];
//            System.out.println("Arreglo invertido: " + j);
//        }

    }

    public static void invertir(Object[] array) {
        invertir_int = new Object[array.length];
        int maximo = array.length;

        for (int i = 0; i < array.length; i++) {
            invertir_int[maximo - 1] = array[i];
            maximo--;
        }
    }

    public static Object[] getArreglo_invertido() {
        return InvertirArray.invertir_int;
    }

}
