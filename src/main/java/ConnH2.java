import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnH2 {
    public ConnH2() {
        String dbFileName = "./H2DB.db";
        String url = "jdbc:h2:file:" + dbFileName;

        try( Connection conn = DriverManager.getConnection( url, "sa", "" ) ) {
            if( conn != null ) {
                System.out.println("Conexión a H2 establecida.");
            }
        } catch ( SQLException e ) {
            System.err.println( "Error de conexión: " + e.getMessage( ) );
        }
    }
}
