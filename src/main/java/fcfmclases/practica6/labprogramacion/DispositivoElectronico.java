package fcfmclases.practica6.labprogramacion;
/** PRACTICA 6 "ARREGLOS DE JAVA"
 * CLASE PADRE
 * @since 01/03/2022
 * @author Omar Gallegos
 * OMAR ESAU GALLEGOS MORENO 1969869
 */
public abstract class DispositivoElectronico {
    //PROPIEDADES A HEREDAR
    private String marca;
    private String modelo;
    //METODOS
    public abstract void encender();
    public String apagar(){
        return "APAGANDO DISPOSITIVO...";
    }
    //ENCAPSULAMIENTO ( GET Y SET )
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    //
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
    
    
    
    
}
    //NOTAS PARA MI:
    /*EL CONTENIDO EN LLAVES DE CAA METODO SE LLAMA IMPLEMENTACION*/

    /*SI ELIMINARAMOS EL SET SOLO PDRIAN VER O LEER LA VARIABLE MARCA 
    PERO NO SE PODRA EDITAR O REESCRIBIR*/

    /*SI CREAMOS UNA CLASE ABSTRACTA AL MENOS UNO DE SUS METODOS DEBE 
    SER ABSTRACTO, LOS METODOS ABSTRACTOS NO LLEVAN IMPLEMENTACION Y 
    ESTO SE DEBE A QUE POR SER ABSTRACTO AL HEREDAR DECIMOS QUE ESTE 
    METODO SE REALIZA DE DIFERENTE MANERA DIFERENTE Y ESPESIFICA EN CADA 
    CLASE HIJA, COMO SI SE TRATARA DE UN METODO GENERAL 
    ( PERTENECIENTE A UNA CLASE ABSTRACTA PADRE ) Y UN METODO PARTICULAR 
    ( PERTENECIENTE A OTRA CLASE HIJA QUE ESTA HEREDANO) QUE SE DESPLIEGA 
    DEL METODO GENERAL,*/

    /*COMO LA CLASE A LA QUE LE VOY A HEREDAR (CLASE HIJA) NO ES ABSTRACTA 
    Y DENTRO DE LO QUE ESTOY HEREDANDO VA UN METODO ABSTRACTO Y POR ASI 
    DECILO NO ES COMPATIBLE PORQUE POR DEFINICION "UNA CLASE ABSTRACTA 
    NO SE PUEDE INSTANCIAR" PERO SE LE PUEDE DAR UNA FORMA PARECIDA 
    POR MEDIO DEL POLIMORFISMO*/

    /*DENTRO DEL POLIMORFISMO ENTRA EL @OVERRIDE*/