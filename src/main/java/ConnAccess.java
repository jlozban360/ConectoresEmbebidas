import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnAccess{
    public ConnAccess() {
        String databasePath = "./northwind.accdb";
        File databaseFile = new File(databasePath);

        // Verifica si el archivo de base de datos existe
        if (!databaseFile.exists()) {
            try {
                // Crea una nueva base de datos Access
                createNewDatabase(databasePath);
                System.out.println("Base de datos creada: " + databasePath);
            } catch (SQLException e) {
                System.err.println("Error al crear la base de datos: " + e.getMessage());
                return;
            }
        } else {
            System.out.println("La base de datos ya existe: " + databasePath);
        }

        // Conectar a la base de datos
        try (Connection conn = DriverManager.getConnection("jdbc:ucanaccess://" + databasePath)) {
            if (conn != null) {
                System.out.println("Conexión a Access establecida.");
            }
        } catch (SQLException e) {
            System.err.println("Error de conexión a Access: " + e.getMessage());
        }
    }

    private void createNewDatabase(String dbPath) throws SQLException {
        // Usa 'create=true' para crear la base de datos
        try (Connection conn = DriverManager.getConnection("jdbc:ucanaccess://" + dbPath + ";create=true")) {
            // Crear una tabla de ejemplo
            String createTableSQL = "CREATE TABLE example_table (id INT PRIMARY KEY, name VARCHAR(255))";
            try (Statement stmt = conn.createStatement()) {
                stmt.execute(createTableSQL); // Ejecuta la creación de la tabla
            }
        }
    }
}
