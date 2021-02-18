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
public class ContadorDeVocales {

    public static void main(String[] args) {

        int[] vocales = contadorVocales("ProfMatiasGarcía");
       
        System.out.println("a \te \ti \to \tu");
        
        for (int x = 0; x < vocales.length; x++) {
            System.out.print(vocales[x] + "\t");
        }
    }

    public static int[] contadorVocales(String sPalabra) {

        int[] contador = {0, 0, 0, 0, 0};

        sPalabra = sPalabra.toLowerCase();

        for (int x = 0; x < sPalabra.length(); x++) {

            switch (sPalabra.charAt(x)) {
                case 'a', 'á' -> contador[0]++;
                case 'e', 'é' -> contador[1]++;
                case 'i', 'í' -> contador[2]++;
                case 'o', 'ó' -> contador[3]++;
                case 'u', 'ú' -> contador[4]++;
            }
//            switch (sPalabra.charAt(x)) {
//                case 'a':
//                case 'á':
//                    contador[0]++;
//                    break;
//                case 'e':
//                case 'é':
//                    contador[1]++;
//                    break;
//                case 'i':
//                case 'í':
//                    contador[2]++;
//                    break;
//                case 'o':
//                case 'ó':
//                    contador[3]++;
//                    break;
//                case 'u':
//                case 'ú':
//                    contador[4]++;
//                    break;
//            }

        }

        return contador;

    }

}
