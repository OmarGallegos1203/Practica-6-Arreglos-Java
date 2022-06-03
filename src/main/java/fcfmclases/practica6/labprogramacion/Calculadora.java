package fcfmclases.practica6.labprogramacion;
/** PRACTICA 4 "CLASES ABSTRACTAS+INTERFACES"
 * CLASE HIJA 
 * @since 12/02/2022
 * @author Omar Gallegos
 */
public class Calculadora extends DispositivoElectronico implements IOperacionesEstandar {
    //METODOS
    @Override
    public void encender() {
    System.out.println(" ENCENDIENDO CALCULADORA...");
    System.out.println("                       \t CALCULADORA ENCENDIENDA!");
    }
    //
    @Override
    public double suma(double a, double b){
    return a+b;
    }
    //
    @Override
    public double resta(double a, double b){
    return a-b;
    }
    //
    @Override
    public double multpli (double a, double b){
    return a*b;
    }
    //
    @Override
    public double divi (double a, double b){
    return a/b;
    }

    
    
    
}
