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
        private static String usuario = "Usuario";
        private static String senha = "123"; 
        
        boolean testa_conexao (){
   try{
        cnc = DriverManager.
               getConnection(url,usuario,senha);
        cnc.close();
        return true;
   }catch(SQLException e){return false;}     
    
        }
        boolean cria_db(){
       try {
          cnc = DriverManager.
               getConnection(url,usuario,senha);
          stmt = cnc.createStatement();
          String sql = "create table if not "
                  + "exists aluno ("
                  + "ra integer primary key,"
                  + "nome character varying(100),"
                  + "cpf character varying(11)"
                  + ");";
          
         stmt.executeUpdate(sql);
         stmt.close();
        cnc.close();
        return true;
       } catch (Exception e) {
       return false;
       }
}
         boolean insere (String SQL){
     try{
       cnc = DriverManager.
               getConnection(url,usuario,senha);
       stmt = cnc.createStatement();
       String sql = null;
       
       stmt.executeUpdate(sql);
       stmt.close(); 
       cnc.close();
       return true;
   }catch(SQLException e){return false;}   
    
   }
}
