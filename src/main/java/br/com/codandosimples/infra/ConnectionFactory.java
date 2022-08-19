package br.com.codandosimples.infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private ConnectionFactory(){}

    public Connection getConnection(){

        try {
            DriverManager.getConnection("jdbc:postgresql://localhost/DespesasDB", "postgres", "142536");
        } catch (SQLException e) {
            throw new RuntimeException(ex);
        }
    }



}
