import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnApacheDerby {
    public ConnApacheDerby() {
        String url = "jdbc:derby:miBaseDerby;create=true"; // Crea la base de datos si no existe
        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                System.out.println("Conexión a Apache Derby establecida.");
            }
        } catch (SQLException e) {
            System.err.println("Error de conexión a Apache Derby: " + e.getMessage());
        }
    }
}
