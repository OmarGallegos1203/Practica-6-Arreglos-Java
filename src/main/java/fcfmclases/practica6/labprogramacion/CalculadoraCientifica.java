package fcfmclases.practica6.labprogramacion;
/** PRACTICA 6 "ARREGLOS DE JAVA"
 * CLASE HIJA
 * @since 01/03/2022
 * @author Omar Gallegos
 * OMAR ESAU GALLEGOS MORENO 1969869
 */
public class CalculadoraCientifica extends DispositivoElectronico implements IOperacionesEstandar, IOperacionesAvanzadas{
    @Override
    public void encender() {
    System.out.println(" ENCENDIENDO CALCULADORA...");
    System.out.println("                       \t CALCULADORA CIENTIFICA ENCENDIENDA!");
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
    //
    @Override
    public double raiz(double a){
    return Math.sqrt(a);
    }
    //
    @Override
    public double porcentaje(double a, double b){
    return a%b;
    }
    
}
