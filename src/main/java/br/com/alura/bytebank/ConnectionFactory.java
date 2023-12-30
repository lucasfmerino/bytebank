package br.com.alura.bytebank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * DatabaseConnection
 */
public class ConnectionFactory {

    public Connection recoverConnection() {

        try {
            return DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/bytebank?user=root&password=root");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}

// Opinião pessoal: Fazer uso de um Singleton para a conexão


/* ---------------------------------------------------------------------------

public class DatabaseConnection {

    private static DatabaseConnection instance;
    private Connection connection;

    private DatabaseConnection() {
        try {
            this.connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/bytebank?user=root&password=root");
            System.out.println("Conexão recuperada");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void closeConnection() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }
}

--------------------------------------------------------------------------
 */