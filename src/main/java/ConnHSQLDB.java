import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnHSQLDB {
    public ConnHSQLDB() {
        String dbFileName = "HLSQLDBD.db";
        String url = "jdbc:hsqldb:file:" + dbFileName;

        try( Connection conn = DriverManager.getConnection( url, "SA", "" ) ) {
            if( conn != null ) {
                System.out.println("Conexión a HSQLDB establecida." );
            }
        } catch ( SQLException e ) {
            System.err.println("Error de conexión: " + e.getMessage( ) );
        }
    }
}
