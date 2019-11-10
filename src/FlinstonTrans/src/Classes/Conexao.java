package FlinstonTrans.src.Classes;

    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.SQLException;
    import java.sql.Statement;
    import javax.swing.JOptionPane;
    import java.sql.ResultSet;
    import javax.swing.plaf.RootPaneUI;

public class Conexao {
    //Declaração de bibliotecas   
        private ResultSet resSet = null;
        private Connection cnc = null;
        private Statement stmt = null;
        private static String url = "jdbc:postgresql:"
            + "//localhost:5432/postgres";
        private static String usuario = "Cesar Oliveira";
        private static String senha = "123"; 
    
    
    }

