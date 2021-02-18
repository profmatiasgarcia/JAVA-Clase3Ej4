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
import java.util.Scanner;

public class EmpleadoTest {

    public static void main(String[] args) {
        Empleado empleados[];
        empleados = new Empleado[5];
        
        ingresarEmpleados(empleados, 5);
        
        for (int i = 0; i < 5; i++) {
            empleados[i].mostrarDatos();
        }
    }

    public static void ingresarEmpleados(Empleado ve[], int cant) {
        Scanner Dato = new Scanner(System.in);
        Scanner Nro = new Scanner(System.in);
        String nombre;
        float sueldo, comision;
        int opc, ventas, horas;
        for (int i = 0; i < cant; i++) {
            System.out.println("1- Empleado a Sueldo");
            System.out.println("2- Empleado a Comision");
            System.out.println("3- Empleado Base mas comision");
            System.out.println("4- Empleado por hora");
            do {
                System.out.println("opcion: ");
                opc = Nro.nextInt();
                if (opc != 1 && opc != 2 && opc != 3 && opc != 4) {
                    System.out.println("Opcion no Valida");
                }
            } while (opc != 1 && opc != 2 && opc != 3 && opc != 4);
            switch (opc) {
                case 1:
                    System.out.println("Empleado a Sueldo");
                    System.out.println("Nombre: ");
                    nombre = Dato.nextLine();
                    System.out.println("Sueldo: ");
                    sueldo = Nro.nextFloat();
                    ve[i] = new EmpleadoASueldo(nombre, sueldo);
                    break;
                case 2:
                    System.out.println("Empleado a Comision");
                    System.out.println("Nombre: ");
                    nombre = Dato.nextLine();
                    System.out.println("comision: ");
                    comision = Nro.nextFloat();
                    System.out.println("Numero de ventas: ");
                    ventas = Nro.nextInt();
                    ve[i] = new EmpleadoAComision(nombre, comision, ventas);
                    break;
                case 3:
                    System.out.println("Empleado Base mas comision");
                    System.out.println("Nombre: ");
                    nombre = Dato.nextLine();
                    System.out.println("Base: ");
                    sueldo = Nro.nextFloat();
                    System.out.println("comision: ");
                    comision = Nro.nextFloat();
                    System.out.println("Numero de ventas: ");
                    ventas = Nro.nextInt();
                    ve[i] = new EmpleadoBaseMasComision(nombre, comision, ventas, sueldo);
                    break;
//            case 4:
//                break;
                default:
                    System.out.println("Empleado por hora");
                    System.out.println("Nombre: ");
                    nombre = Dato.nextLine();
                    System.out.println("Horas: ");
                    horas = Nro.nextInt();
                    System.out.println("Pago por hora: ");
                    sueldo = Nro.nextInt();
                    ve[i] = new EmpleadoPorHora(nombre, horas, sueldo);
            }
        }
    }
}
