/******************************************************************************
 *	Usuario.java
 *	Clase para los usuarios a utilizar lael sistema de recomenadaciones
 *	Por: Diego Castaneda,   Carnet: 15151
 *   	 Jonnathan Juarez,  Carnet: 15377
 *        Davis Alvarez, 	Carnet: 15842
 * 		 Javier Jo, 		Carnet: 14343
 *   Algoritmos y Estructura de Datos, Seccion: 30
 *******************************************************************************/
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Usuario {
    private String nombre;
    private String usuario;
    private String contrasena;
    private String correo;
    private String direccion;
    private String horarioInicio;
    private String horarioFinal;
    public boolean[] datos = new boolean[34];

    private final String[] lenguajes = {"Java", "C++", "Python", "C", "MySQL", ".Net", "SQLite", "C#", "JavaScript", "php", "ARM", "Cypher"};
    private boolean[] conocimiento = new boolean[12];

    public final String[] temas = {"Ciencias Formales", "Ciencias Sociales", "Relaciones Humanas", "Entretenimiento", "Naturaleza", "Ciencias Naturales", "Arte", "Tecnologia"};

    private int edad;
    private int telefono;
    private int salario;
    private String interes1;
    private String interes2;

    public Usuario(String usuario, String contrasena, String nombre, String correo, String direccion, String horarioInicio, String horarioFinal,  int edad, int telefono, int salario){
        this.nombre  = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
        this.usuario = usuario;
        this.direccion = direccion;
        this.edad = edad;
        this.telefono = telefono;
        this.horarioFinal  = horarioFinal;
        this.horarioInicio = horarioInicio;
        this.salario = salario;

    }

    public String getNombre(){return nombre;}

    public String getCorreo(){return correo;}

    public String getDireccion(){return direccion;}

    public int getEdad(){return edad;}

    public int getTelefono(){return telefono;}

    public String getInteres1(){return interes1;}

    public String getInteres2(){return interes2;}

    public String getHorarioInicio(){return horarioInicio;}

    public String getHorarioFinal(){return horarioFinal;}


    public String[] getLenguajes(){return lenguajes;}

    public boolean[] getConocimiento(){return conocimiento;}

    public int getSalario(){return salario;}

    public String getUsuario(){return usuario;}

    public String getContrasena(){return contrasena;}

    public boolean[] getAnswers() {return datos;}
/*--------------------------------------------------------------------------*/

    public void setNombre(String nombre){this.nombre = nombre;}

    public void setCorreo(String correo){this.correo = correo;}

    public void setDireccion(String direccion){this.direccion = direccion;}

    public void setEdad(int edad){this.edad = edad;}

    public void setTelefono(int telefono){this.telefono = telefono;}

    public void setInteres1(String interes){this.interes1 = interes;}

    public void setInteres2(String interes){this.interes2 = interes;}

    public void setHorarioInicio(String horario){this.horarioInicio = horario;}

    public void setHorarioFinal(String horario){this.horarioFinal = horario;}

    public void setConocimiento(int index, boolean booleano){this.conocimiento[index] = booleano;}

    public void setSalario(int salario){this.salario = salario;}

    public void setusuario(String usuario){this.usuario = usuario;}

    public void setContrasena(String contrasena){this.contrasena = contrasena;}

    public void setAnswers(boolean[] answers) {this.datos = answers;}

    /*-------------------------------------------------------------------*/
    public void intereses(){
        ArrayList<Integer> interesesAcumulados = new ArrayList<>();

        for(boolean n: datos){System.out.println(n);}

        if(datos[0]){
            interesesAcumulados.add(0, interesesAcumulados.get(0)+1);
        }
        if(datos[1]){
            interesesAcumulados.add(1, interesesAcumulados.get(1)+1);
        }
        if(datos[2]){
            interesesAcumulados.add(2, interesesAcumulados.get(2)+1);
        }
        if(datos[3]){
            interesesAcumulados.add(3, interesesAcumulados.get(3)+1);
        }
        if(datos[4]){
            interesesAcumulados.add(4, interesesAcumulados.get(4)+1);
        }
        if(datos[5]){
            interesesAcumulados.add(5, interesesAcumulados.get(5)+1);
        }
        if(datos[6]){
            interesesAcumulados.add(6, interesesAcumulados.get(6)+1);
        }
        if(datos[7]){
            interesesAcumulados.add(7, interesesAcumulados.get(7)+1);
        }
        if(datos[8]){
            interesesAcumulados.add(7, interesesAcumulados.get(7)+1);
            interesesAcumulados.add(6, interesesAcumulados.get(6)+1);
        }
        if(datos[9]){
            interesesAcumulados.add(7, interesesAcumulados.get(7)+1);
            interesesAcumulados.add(4, interesesAcumulados.get(4)+1);
        }
        if(datos[10]){
            interesesAcumulados.add(7, interesesAcumulados.get(7)+1);
            interesesAcumulados.add(2, interesesAcumulados.get(2)+1);
        }
        if(datos[11]){
            interesesAcumulados.add(7, interesesAcumulados.get(7)+1);
            interesesAcumulados.add(3, interesesAcumulados.get(3)+1);
        }
        if(datos[12]){
            interesesAcumulados.add(6, interesesAcumulados.get(6)+1);
            interesesAcumulados.add(4, interesesAcumulados.get(4)+1);
        }
        if(datos[13]){
            interesesAcumulados.add(6, interesesAcumulados.get(6)+1);
            interesesAcumulados.add(2, interesesAcumulados.get(2)+1);

        }if(datos[14]){
            interesesAcumulados.add(6, interesesAcumulados.get(6)+1);
            interesesAcumulados.add(3, interesesAcumulados.get(3)+1);
        }
        if(datos[15]){
            interesesAcumulados.add(2, interesesAcumulados.get(2)+1);
            interesesAcumulados.add(3, interesesAcumulados.get(3)+1);
        }
        if(datos[16]){
            interesesAcumulados.add(5, interesesAcumulados.get(5)+1);
            interesesAcumulados.add(1, interesesAcumulados.get(1)+1);
        }
        if(datos[17]){
            interesesAcumulados.add(5, interesesAcumulados.get(5)+1);
            interesesAcumulados.add(0, interesesAcumulados.get(0)+1);

        }if(datos[18]){
            interesesAcumulados.add(5, interesesAcumulados.get(5)+1);
            interesesAcumulados.add(7, interesesAcumulados.get(7)+1);
        }
        if(datos[19]){
            interesesAcumulados.add(5, interesesAcumulados.get(5)+1);
            interesesAcumulados.add(6, interesesAcumulados.get(6)+1);

        }if(datos[20]){
            interesesAcumulados.add(5, interesesAcumulados.get(5)+1);
            interesesAcumulados.add(4, interesesAcumulados.get(4)+1);
        }
        if(datos[21]){
            interesesAcumulados.add(5, interesesAcumulados.get(5)+1);
            interesesAcumulados.add(2, interesesAcumulados.get(2)+1);

        }if(datos[22]){
            interesesAcumulados.add(5, interesesAcumulados.get(5)+1);
            interesesAcumulados.add(3, interesesAcumulados.get(3)+1);
        }
        if(datos[23]){
            interesesAcumulados.add(1, interesesAcumulados.get(1)+1);
            interesesAcumulados.add(0, interesesAcumulados.get(0)+1);
        }
        if(datos[24]){
            interesesAcumulados.add(1, interesesAcumulados.get(1)+1);
            interesesAcumulados.add(7, interesesAcumulados.get(7)+1);
        }
        if(datos[25]){
            interesesAcumulados.add(1, interesesAcumulados.get(1)+1);
            interesesAcumulados.add(6, interesesAcumulados.get(6)+1);

        }if(datos[26]){
            interesesAcumulados.add(1, interesesAcumulados.get(1)+1);
            interesesAcumulados.add(4, interesesAcumulados.get(4)+1);
        }
        if(datos[27]){
            interesesAcumulados.add(1, interesesAcumulados.get(1)+1);
            interesesAcumulados.add(2, interesesAcumulados.get(2)+1);
        }
        if(datos[28]){
            interesesAcumulados.add(1, interesesAcumulados.get(1)+1);
            interesesAcumulados.add(3, interesesAcumulados.get(3)+1);
        }
        if(datos[29]){
            interesesAcumulados.add(0, interesesAcumulados.get(0)+1);
            interesesAcumulados.add(7, interesesAcumulados.get(7)+1);
        }
        if(datos[30]){
            interesesAcumulados.add(0, interesesAcumulados.get(0)+1);
            interesesAcumulados.add(6, interesesAcumulados.get(6)+1);
        }
        if(datos[31]){
            interesesAcumulados.add(0, interesesAcumulados.get(0)+1);
            interesesAcumulados.add(4, interesesAcumulados.get(4)+1);
        }
        if(datos[32]){
            interesesAcumulados.add(0, interesesAcumulados.get(0)+1);
            interesesAcumulados.add(2, interesesAcumulados.get(2)+1);
        }
        if(datos[33]){
            interesesAcumulados.add(0, interesesAcumulados.get(0)+1);
            interesesAcumulados.add(3, interesesAcumulados.get(3)+1);
        }

        int numero = 0;
        int index1 = 0;
        for(int elemento: interesesAcumulados){
            if (elemento > numero){
                numero = elemento;
                index1 = interesesAcumulados.indexOf(elemento);
            }
        }

        numero = 0;
        int index2 = 0;

        for(int elemento: interesesAcumulados){
            if(elemento> numero && interesesAcumulados.indexOf(elemento) != index1){
                numero = elemento;
                index2 = interesesAcumulados.indexOf(elemento);
            }
        }

        this.setInteres1(temas[index1]);
        this.setInteres2(temas[index2]);

    }
}
