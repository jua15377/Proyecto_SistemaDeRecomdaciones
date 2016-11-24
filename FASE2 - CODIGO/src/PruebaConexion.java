/**
 * Created by Alejanddro on 22/11/2016.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class PruebaConexion {
    /**
     * Launch the application.
     */
    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection("jdbc:neo4j:bolt://localhost", "neo4j", "123456789");
            try (Statement stmt = con.createStatement()) {
                ResultSet rs = stmt.executeQuery("MATCH (n:User) RETURN n.name");
                while (rs.next()) {
                    System.out.println(rs.getString("n.name"));
                }
            }


            con.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}