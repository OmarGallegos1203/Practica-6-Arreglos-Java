package fcfmclases.practica6.labprogramacion;
/** PRACTICA 6 "ARREGLOS DE JAVA"
 * CLASE HIJA
 * @since 01/03/2022
 * @author Omar Gallegos
 * OMAR ESAU GALLEGOS MORENO 1969869
 */
public class Television extends DispositivoElectronico{
    @Override
    public void encender(){
    System.out.println("ENCENDIENDO TELEVISION...");
    System.out.println("                  \tTELEVISION ENCENDIENDA!");
    }
    //PROPIEDADES
    private String color;
    //METODOS
    public String cambiarCanal(){
    return "CANAL CAMBIADO!";
    }
    //
    public String subirVolumen(){
    return "SUBIENDO VOLUMEN!"; 
    }
    //METODOS PARA LA INTERFACE
    public String configResol(){
    return "CONFIGURANDO RESOLUCION!";
    }
    public String configColor(){
    return "CONFIGURANDO COLOR!";
    }
    public String configSonido(){
    return "CONFIGURANDO SONIDO!";
    }

   //ENCAPSULAMIENTO DE COLOR (GET Y SET)
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
 