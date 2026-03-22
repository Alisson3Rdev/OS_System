package br.com.infoX.telas;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import br.com.infoX.dal.Modulo_conexao;


public class Tela_Login extends JFrame{
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public Tela_Login() {

        setTitle("Login");
        setSize(400,150);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //criar painel principal
        JPanel painelPrincipal = new JPanel(new BorderLayout(10,10));

        //forma do painel para ajustar layout
        JPanel painelForm = new JPanel(new GridBagLayout());
        //gridBag vai delimitar o tamanho dos quadrados a serem preenchidos
        GridBagConstraints gbc = new GridBagConstraints();
        //linha abaixo define uma "Margem"
        gbc.insets = new Insets(5, 5,5,5);
        //a linha abaixo diz que os componentes devem "Nascer" somente na horizontal
        gbc.fill = GridBagConstraints.HORIZONTAL;


        //cria label e textField de user
        JLabel user = new JLabel("User:");
        JTextField text_field = new JTextField(15);


        //label e textField de password
        JLabel password = new JLabel("Password:");
        JPasswordField pass_field = new JPasswordField(15);

        //Painel do botão
        //JPanel painelBotao = new JPanel(new FlowLayout(FlowLayout.LEADING));
        JButton login_button = new JButton("Login");

        //adicionando as coisas ao painel
        //User label
        // gridx = x gridy = y da pg ou seja o local x e y de cada label
        gbc.gridx = 0;
        gbc.gridy = 0;
        painelForm.add(user,gbc);

        //User textField
        gbc.gridx= 1;
        painelForm.add(text_field,gbc);

        //Password label
        gbc.gridx = 0;
        gbc.gridy = 1;
        painelForm.add(password,gbc);

        //Password Field
        gbc.gridx = 1;
        painelForm.add(pass_field,gbc);

        gbc.gridx = 3;
        gbc.gridy = 3;
        painelForm.add(login_button,gbc);

        //Montagem do painel principal
        painelPrincipal.add(painelForm,BorderLayout.PAGE_START);


        //adiciona painel na tela
        add(painelPrincipal);


        //deixando tudo visivel
        setVisible(true);

//----------------Fim do InitComponents---------------

        conexao = Modulo_conexao.conector();
        System.out.print(conexao);

    }

    public static void main(String[] args) {
        new Tela_Login();
    }
}
