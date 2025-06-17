package conexaobanco.exemplo;
import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;

import java.sql.SQLException;


public class Main {

    private static final String URL = "jdbc:mysql://localhost:3306/meu_bd";

    private static final String USER = "root"; // Substitua pelo seu usuário do MySQL

    private static final String PASSWORD = "password"; // Substitua pela sua senha do MySQL


    public static void main(String[] args) {

        String nome = "João da Silva";

        String cpf = "12345678901";

        inserirCliente(nome, cpf);

    }


    public static void inserirCliente(String nome, String cpf) {

        String sql = "INSERT INTO tbcliente (nome, cpf) VALUES (?, ?)";


        try {

            // Certifique-se de que o driver JDBC do MySQL está registrado

            Class.forName("com.mysql.cj.jdbc.Driver");


            try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

                 PreparedStatement stmt = conn.prepareStatement(sql)) {


                stmt.setString(1, nome);

                stmt.setString(2, cpf);


                int rowsInserted = stmt.executeUpdate();

                if (rowsInserted > 0) {

                    System.out.println("Um novo cliente foi inserido com sucesso!");

                }

            } catch (SQLException e) {

                System.out.println("Erro ao conectar ou inserir no banco de dados");

                e.printStackTrace();

            }

        } catch (ClassNotFoundException e) {

            System.out.println("Driver JDBC do MySQL não encontrado");

            e.printStackTrace();

        }

    }

}