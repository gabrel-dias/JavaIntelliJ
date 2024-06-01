package conexaobanco;
import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;


public class ConexaoBanco {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/meu_bd";

        String usuario = "root"; // Substitua pelo seu usuário

        String senha = ""; // Substitua pela sua senha


        try {

            Connection conexao = DriverManager.getConnection(url, usuario, senha);

            System.out.println("Conexão com o banco efetuada com sucesso!");

            // Aqui você pode executar outras operações no banco de dados

            conexao.close();

        } catch (SQLException e) {

            System.out.println("Erro de conexão com o banco: " + e.getMessage());

        }

    }

}