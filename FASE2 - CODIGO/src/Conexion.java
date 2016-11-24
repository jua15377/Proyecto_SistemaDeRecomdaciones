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
import java.util.ArrayList;
import java.util.Map;


public class Conexion {
    private Connection con;
    private Statement stmt;
    private final String USER="neo4j";
    private final String PASSWORD="123456789";
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

    public void crearInteres(String e){
        try {
            stmt.executeUpdate("CREATE(" +e+ ":Interes{nombre:'" +e+ "'})");
            con.close();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }

    public void crearUsuario(Usuario e){
        try {
            stmt.executeUpdate("CREATE(" +e.getUsuario()+ ":Usuario{usuario:'" +e.getUsuario() + "',contrasena:'" + e.getContrasena() +  "',nombre:'" +e.getNombre()+ "',correo:'" +e.getCorreo()+ "',edad:'" +e.getEdad()+ "',direccion:'" + e.getDireccion() + "',telefono:'" + e.getTelefono() + "',horarioEntrada:'" + e.getHorarioInicio() + "',horarioSalida:'" + e.getHorarioFinal() + "'})");
            con.close();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }

    public void crearEmpresa(Empresa r){
        try {
            stmt.executeUpdate("CREATE("+r.getNombre()+":Empresa{nombre:'"+r.getNombre()+"',pbx:'"+r.getpbx()+"',ubicacion:'"+r.getDireccion()+"'})");
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void unirIntereses(Usuario e ) {
        try {
            stmt.executeUpdate("MATCH (n:Usuario {usuario: '" + e.getUsuario() + "'})"+
                               "MATCH (x:Interes {nombre:'" + e.getInteres1() + "'})"+
                               "MERGE(n)-[:leInteresa]->(x)");
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }

    public void unirIntereses2(Usuario e ){
        try {
            stmt.executeUpdate("MATCH (n:Usuario {usuario: '" + e.getUsuario() + "'})"+
                               "MATCH (x:Interes {nombre:'" + e.getInteres2() + "'})"+
                               "MERGE(n)-[:leInteresa]->(x)");
        } catch (SQLException e1) {
            e1.printStackTrace();
        }

    }

    public ArrayList<String> Recomendar(Usuario e){
        ArrayList<String> retorno = new ArrayList<>();
        ArrayList<String> temas = new ArrayList<>();

        try {
            ResultSet rs = stmt.executeQuery("MATCH (u:Usuario{nombre: '"+ e.getNombre()+"'})" +
                                             "MATCH (u)-[:leInteresa]->(tema:Interes)<-[:leInteresa]-(e:Empresa) return e");
            int i = 0;
            while(rs.next()){
                Map map = (Map)rs.getObject("e");
                String s = map.get("nombre").toString();
                retorno.add(s);

            }


            con.close();

        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        return retorno;
    }




    public void delete(){
        try {
            stmt.executeUpdate("MATCH (n) " +
                    "OPTIONAL MATCH (n)-[r]-()"+" delete n,r" );
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



}