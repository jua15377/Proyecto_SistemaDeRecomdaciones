/******************************************************************************
*	Usuario.java
*	Clase para los usuarios a utilizar lael sistema de recomenadaciones
*	Por: Diego Castaneda,   Carnet: 15151
*   	 Jonnathan Juarez,  Carnet: 15377
*        Davis Alvarez, 	Carnet: 15842
* 		 Javier Jo, 		Carnet: 14343
*   Algoritmos y Estructura de Datos, Seccion: 30
*******************************************************************************/

public class Usuario {
	private String nombre; 
	private String usuario; 
	private String contrasena; 
	private String correo; 
	private String direccion; 
	private String horarioInicio; 
	private String horarioFinal; 

	private final String[] lengaujes = {"Java", "C++", "Python", "C", "MySQL", ".Net", "SQLite", "C#", "JavaScript", "php", "ARM", "Cypher"};
	private boolean[] conocimiento = new boolean[12]; 
	
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

}
