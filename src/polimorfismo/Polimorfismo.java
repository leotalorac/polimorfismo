/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;
import java.util.*;
/**
 *
 * @author Estudiante
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    
    public static int menu(){
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Agregar "
                            +"2. Listar "
                            + "3. Nomina "
                            + "4. nomina programadores "
                            +"5 nomia arquitectos"
                            + "6. Salir");
        opcion = sc.nextInt();
        return(opcion);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean y = true;
        Empresa e = new Empresa();
        while(y){
            switch(menu()){
                case 1: 
                    System.out.println("ingresa el nombre");
                    String name = sc.next();
                    System.out.println("ingresa 1.Programador 2. Arquitecto");
                    int o = sc.nextInt();
                    switch(o){
                        case 1:
                            Empleado em = new Programador(name);
                            e.agregarEmpleado(em);
                            break;
                        case 2:
                            Empleado ar = new Arquitecto(name);
                            e.agregarEmpleado(ar);
                            break;
                        default: 
                            System.out.println("no valido");
                            break;
                    }
                    break;
                case 2:
                    for (int i = 0; i < e.listarEmpledo().size(); i++) {
                        System.out.println("Nombre: " + e.listarEmpledo().get(i).getName() + " Sueldo: " + e.listarEmpledo().get(i).calcularSalario() + " Cargo: " + e.listarEmpledo().get(i).getProfecion());
                    }
                    break;
                
                case 3:
                    System.out.println("Nomina total: "+e.calcularNomina());
                    break;
                case 4:
                    System.out.println("Nomina programadores: "+e.calcularNominaProgramadores());
                    break;
                case 5:
                    System.out.println("Nomina arquitectos: " + e.calcularNominaArquitectos());
                    break;
                case 6: 
                    y = false;
                    break;
                default: 
                    System.out.println("invalido");
                    break;
            }
        }
    }
    
}
