/******************************************************************************
*	Conexion.java
*	Programa que permite relizar una conexion con neo4j
*	Por: Diego Castaneda,   Carnet: 15151
*   	 Jonnathan Juarez,  Carnet: 15377
*        Davis Alvarez, 	Carnet: 15842
* 		 Javier Jo, 		Carnet: 14343
*   Algoritmos y Estructura de Datos, Seccion: 30
*******************************************************************************/

import java.sql.*;


public class Conexion {
    private Connection con;
    private Statement stmt;
    private final String USER="neo4j";
    private final String PASSWORD="neo4j1";
    static final String URL="jdbc:neo4j:bolt://localhost";
    
    //constructor
    public Conexion(){
        try{
            con= DriverManager.getConnection(URL,USER,PASSWORD);
            stmt=con.createStatement();
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }
    
    public void crearUsuario(Usuario e){
        stmt.executeUpdate("CREATE(" +e.getNombre()+ ":Usuario{usuario:" +e.getUsuario() + ",contrasena:" + e.getContrasena() +  ",name:" +e.getNombre()+ ",correo:" +e.getCorreo()+ ",edad:" +e.getEdad()+ " ,direccion:" + e.getDireccion() + ",telefono:" + e.getTelefono() + ",horarioEntrada:" + e.getHorarioInicio() + ",horarioSalida:" + e.getHorarioFinal() + "})");
    }
    
    public void crearEmpresa(Empresa r){
        stmt.executeUpdate("CREATE("+r.getNombre()+":Empresa{name:"+r.getNombre()+",pbx:"+r.getpbx()+",ubicacion:"+r.getDireccion()+",Mision:"+r.getMision()+ ",Vision:"+ r.getVision() + "})");
    }
    
    public void crearPlaza(Usuario e, Empresa r){
    	stmt.executeUpdate("MATCH(" + e.getNombre() + ")-[:leInteresa]->(" + e.getInteres1() + ")<-[:leInteresa]-(" + r.getNombre()")<-[:perteneceA]-() " + "})");
        
    } 
    
    public void delete(){
        try {
            stmt.executeUpdate("MATCH (n) " +
                    "OPTIONAL MATCH (n)-[r]-()"+" delete n,r" );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void crearAmigo(Estudiante e1,Estudiante e2){
        try{
            stmt.executeUpdate("MATCH (x:User {name:"+ e1.getName()+"})MATCH (y:User{name:"+e2.getName()+"})");
        }
    }

    
}