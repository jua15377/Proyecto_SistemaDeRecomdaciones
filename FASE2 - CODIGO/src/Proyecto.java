/******************************************************************************
 *	Proyecto.java
 *	Clase para la creacion de proyectos o trabajos que se tomaran segun la recomenda
 *	Por: Diego Castaneda,   Carnet: 15151
 *   	 Jonnathan Juarez,  Carnet: 15377
 *        Davis Alvarez, 	Carnet: 15842
 * 		 Javier Jo, 		Carnet: 14343
 *   Algoritmos y Estructura de Datos, Seccion: 30
 *******************************************************************************/

public class Proyecto{
    private String nombre;
    private String descripcion;
    private String contacto;

    public Proyecto(String nombre, String descripcion, String contacto){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.contacto = contacto;
    }

    public String toString(){
        return nombre + "\n" + descripcion + "\nContacto: " + contacto;
    }
}
