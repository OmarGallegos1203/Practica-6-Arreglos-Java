package fcfmclases.practica6.labprogramacion;
import java.util.Scanner;
/** PRACTICA 6 "ARREGLOS DE JAVA"
 * RUN FILE
 * @since 01/03/2022
 * @author Omar Gallegos
 * OMAR ESAU GALLEGOS MORENO 1969869
 */
public class RunPractica6 {
    public static void main(String[] args) {
        System.out.println("\tDISPOSITIVOS ELECTRONICOS");
        Scanner objTV = new Scanner(System.in);
        Scanner objCL = new Scanner(System.in);
        Scanner objCLCF = new Scanner(System.in);
        //CREACION DE ARREGLOS (Solo se crean los arreglo pero no se esta instanceando)
        Calculadora[] calcusio = new Calculadora[5]; 
        CalculadoraCientifica[] calcusiocf = new CalculadoraCientifica[5]; 
        Television[] smartv = new Television[5]; 
        
        //  L   O   G   I   N       D   A   T   O   S
        //T E L E V I S I O N
        System.out.println("\tTELEVISION");
        //FOR MARCA Y MODELO
        for (int i=0;i<5; i++){
            smartv[i] = new Television();
            System.out.printf("Ingresa la marca de la television #d", i);
            String marcaTV = objTV.nextLine();
            smartv[i].setMarca(marcaTV);
            System.out.printf("Ingresa el modelo de la television #d", i);
            String modeloTV = objTV.nextLine();
            smartv[i].setModelo(modeloTV);
            System.out.printf("Ingresa el color de la television #%d", i);
            String colorTV = objTV.nextLine();
            smartv[i].setColor(colorTV);
        }
        //C A L C U L A D O R A S  B A S I C A
        System.out.println("\tCALCULADORAS BASICAS");
        //FOR MARCA Y MODELO
        for (int i=0;i<5; i++){
            calcusio[i] = new Calculadora();    //Lo instanceamos en cada posicion por medio del for
            System.out.printf("\n\nIngresa la marca de la calculadora #%d : ", i);
            String marcaCL = objCL.nextLine();
            calcusio[i].setMarca(marcaCL);
            System.out.printf("\nIngresa el modelo de la calculadora #%d: ", i);
            String modeloCL = objCL.nextLine();
            calcusio[i].setModelo(modeloCL);
        }
        //C A L C U L A D O R A S  C I E N T I F I C A S
        System.out.println("\tCALCULADORAS CIENTIFICAS");
        //FOR MARCA Y MODELO
        for (int i=0;i<5; i++){
            calcusiocf[i] = new CalculadoraCientifica();
            System.out.printf("\n\nIngresa la marca de la calculadora cientifica #%d: ", i);
            String marcaCLCF = objCLCF.nextLine();
            calcusiocf[i].setMarca(marcaCLCF);
            System.out.printf("\nIngresa el modelo de la calculadora cientifica #%d: ", i);
            String modeloCLF = objCLCF.nextLine();
            calcusiocf[i].setModelo(modeloCLF);
        }
        //  P   R   I   N   T       D   A   T   O   S
        //PRINT TELEVISION //
        for (Television tve : smartv) {
            System.out.println("\n\n\tTELEVISION "+tve.getMarca());
            System.out.println("Marca: "+tve.getMarca());
            System.out.println("Modelo: "+tve.getModelo());
            System.out.println("Color: "+tve.getColor());
            System.out.println("\t\"VERIFICACION DEL DISPOSITIVO\"");
            System.out.print("OPCION ENCENDER:\t");
            tve.encender();
            System.out.println("OPCION CAMBIAR CANAL:\t"+tve.cambiarCanal());
            System.out.println("OPCION SUBIR VOLUMEN:\t"+tve.subirVolumen());
            System.out.println("OPCION CONFIGURACION RESOLUCION:\t\t"+tve.configResol());//INTERFACE
            System.out.println("OPCION CONFIGURACION COLOR:\t\t\t"+tve.configColor());//INTERFACE
            System.out.println("OPCION CONFIGURACION SONIDO:\t\t\t"+tve.configSonido());//INTERFACE
            System.out.println("\t\"VERIFICACION DEL DISPOSITIVO TERMINADA\"");
            tve.apagar();
        }
        
        // PRINT CALCULADORAS //
        for( Calculadora cal : calcusio){
            System.out.println("\n\n\tCALCULADORA "+cal.getMarca());
            System.out.println("Marca: "+cal.getMarca());
            System.out.println("\t\"VERIFICACION DEL DISPOSITIVO\"");
            System.out.print("OPCION ENCENDER:\t");
            cal.encender();
            System.out.println("OPCION SUMA:             7.5+13.56= "+cal.suma(7.5, 13.56));
            System.out.println("OPCION RSTA:             8.48-6.96= "+cal.resta(8.48, 6.96));
            System.out.println("OPCION MULTIPLICACION:   (6.16)*(1.38)= "+cal.multpli(6.16, 1.38));
            System.out.println("OPCION DIVISION:         20/19= "+cal.divi(20, 19));
            System.out.println("\t\"VERIFICACION DEL DISPOSITIVO TERMINADA\"");
            cal.apagar();
        }
        // PRINT CALCULADORAS CIENTIFICAS //
        for( CalculadoraCientifica calcf : calcusiocf){
            System.out.println("\n\n\tCALCULADORA "+calcf.getMarca());
            System.out.println("Marca: "+calcf.getMarca());
            System.out.println("\t\"VERIFICACION DEL DISPOSITIVO\"");
            System.out.print("OPCION ENCENDER:\t");
            calcf.encender();
            System.out.println("OPCION SUMA:             7.5+13.56= "+calcf.suma(7.5, 13.56));
            System.out.println("OPCION RSTA:             8.48-6.96= "+calcf.resta(8.48, 6.96));
            System.out.println("OPCION MULTIPLICACION:   (6.16)*(1.38)= "+calcf.multpli(6.16, 1.38));
            System.out.println("OPCION DIVISION:         20/19= "+calcf.divi(20, 19));
            System.out.println("OPCION PORCENTAJE (RESTO):\t20/19= "+calcf.porcentaje(238.00, 3.5));//INTERFACE
            System.out.println("OPCION RAIZ:\t\t\t 81= "+calcf.raiz(81));//INTERFACE 
            System.out.println("\t\"VERIFICACION DEL DISPOSITIVO TERMINADA\"");
            calcf.apagar();
        }
    }
}
