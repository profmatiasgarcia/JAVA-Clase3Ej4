package Arrays;
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
import java.util.Arrays;

public class PruebaArrays {

    public static void main(String[] args) {
        char[] miArray1 = {'b', 'e', 'd', 'h', 'j', 'a', 'c', 'f', 'g', 'i'};
        char[] miArray2 = {'b', 'e', 'd', 'h', 'j', 'a', 'c', 'f', 'g', 'i'};

        // Compara 2 arrays
        if (Arrays.equals(miArray1, miArray2)) {
            System.out.println("Los dos arrays son iguales!");
        } else {
            System.out.println("Los dos arrays NO son iguales!");
        }

        miArray1[8] = 'k';

        // Imprimir array
        System.out.println("Array sin ordenar...");
        System.out.println(Arrays.toString(miArray1));

        // Ordenar el array
        Arrays.sort(miArray1);

        // imprime el array ordenado
        System.out.println("Array ordenado ...");
        System.out.println(Arrays.toString(miArray1));

        // Devuelve el índice de un valor particular
        int index = Arrays.binarySearch(miArray1, 'k');
        System.out.println("k esta en la posición " + index);

        String[][] taTeTi = {{"X", "O", "O"}, {"O", "X", "X"}, {"X", "O", "X"}};

        System.out.println(Arrays.deepToString(taTeTi));

        // llena un vector entero con el valor 8
        int[] vecInt = new int[5];
        Arrays.fill(vecInt, 8);

        System.out.println(Arrays.toString(vecInt));
        System.out.println();

        // Copiar un vector a otro vector
        char[] vecA = {'p', 'r', 'o', 'f', 'M', 'a', 't', 'i', 'a', 's', 'G', 'a', 'r', 'c', 'i', 'a'};

        char[] vecB = new char[7];

        // el método de la clase Arrays
        // devuelve un arreglo nuevo que se copia en vecC
        char[] vecC = Arrays.copyOfRange(vecA, 7, 15);

        // Copia con el método de la clase System
        System.arraycopy(vecA, 3, vecB, 0, 4);

        // crea un String con los caracteres del vector
        // e imprime el String
        System.out.println(new String(vecB));
        System.out.println(new String(vecC));
        // imprime el vector
        System.out.println(Arrays.toString(vecB));
        System.out.println(Arrays.toString(vecC));

    }
}
