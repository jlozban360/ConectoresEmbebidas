import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnApacheDerby {
    public ConnApacheDerby() {
        String url = "jdbc:derby:ADerbyDB;create=true";
        try( Connection conn = DriverManager.getConnection( url ) ) {
            if( conn != null ) {
                System.out.println( "Conexión a Apache Derby establecida." );
            }
        } catch ( SQLException e ) {
            System.err.println( "Error de conexión a Apache Derby: " + e.getMessage( ) );
        }
    }
}
