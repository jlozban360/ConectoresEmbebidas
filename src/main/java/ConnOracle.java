import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnOracle {
    public ConnOracle( ) {
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String user = "PDBADMIN";
        String password = "oretania";

        try( Connection conn = DriverManager.getConnection( url, user, password ) ) {
            if( conn != null ) {
                System.out.println("Conexión a Oracle establecida.");
            }
        } catch ( SQLException e ) {
            System.err.println("Error de conexión a Oracle: " + e.getMessage());
        }
    }
}
