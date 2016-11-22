/******************************************************************************
 *	Empresa.java
 *	Clase para las empresas proponiendo trabajos para los usuarios
 *	Por: Diego Castaneda,   Carnet: 15151
 *   	 Jonnathan Juarez,  Carnet: 15377
 *        Davis Alvarez, 	Carnet: 15842
 * 		 Javier Jo, 		Carnet: 14343
 *   Algoritmos y Estructura de Datos, Seccion: 30
 *******************************************************************************/

public class Empresa{
    private String nombre;
    private int pbx;
    private String direccion;
    private String mision;
    private String vision;

    private String interes1;
    private String interes2;

    public Empresa(String nombre, int pbx, String direccion){
        this.nombre = nombre;
        this.pbx = pbx;
        this.direccion = direccion;
    }

    public String getNombre(){return nombre;}

    public int getpbx(){return pbx;}

    public String getDireccion(){return direccion;}

    public String getMision(){return mision;}

    public String getVision(){return vision;}

    public String getInteres1(){return interes1;}

    public String getInteres2(){return interes2;}

	/*--------------------------------------------*/

    public void setNombre(String nombre){this.nombre = nombre;}

    public void setPbx(int numero){this.pbx = numero;}

    public void setDireccion(String direccion){this.direccion = direccion;}

    public void setMision(String mision){this.mision = mision;}

    public void setVision(String vision){this.vision = vision;}

    public void setInteres1(String interes){this.interes1 = interes;}

    public void setInteres2(String interes){this.interes2 = interes;}
}