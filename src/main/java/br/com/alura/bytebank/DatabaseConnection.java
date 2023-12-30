package br.com.alura.bytebank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * DatabaseConnection
 */
public class DatabaseConnection {

    public static void main(String[] args) {

        try {

            Connection connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/bytebank?user=root&password=root");

            System.out.println("Conexão recuperada");

            connection.close();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}

// Opinião pessoal: Transformar essa conexão em um singleton 