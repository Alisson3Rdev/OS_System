package br.com.infoX.dal;
import java.sql.*;

public class Modulo_conexao {

    //Metodo responsavel por estabelecer conexao com o banco
    public static Connection conector() {
        java.sql.Connection conexao = null;
        //linha abaixo chama o driver do BD importado nas bibliotecas (DRIVER)
        String driver = "com.mysql.cj.jdbc.Driver";
        // Armazenando info sobre o BD (caminho)
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        //Nome
        String user = "root";
        //Autenticação
        String password = "";
        //estabelecendo conexao com o BD
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user,password);
            return conexao;
        }
        catch (Exception e) {
            return null;
        }
    }

}