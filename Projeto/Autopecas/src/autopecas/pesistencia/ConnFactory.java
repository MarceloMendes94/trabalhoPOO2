package autopecas.pesistencia;

import java.sql.Connection;
import java.sql.DriverManager;




public class ConnFactory {
       private final String url = "jdbc:postgresql://localhost:45453/banana";//"jdbc:postgresql://stampy.db.elephantsql.com:5432/pvunmqpv"
       private final String user = "postgres";//"pvunmqpv"
       private final String password = "aluno";//"rX3CKCsGeqAIlEut5W2HeMxF8f-uyYNA

    
       public synchronized void teste(){
            Connection c = null;   
            try{
                c = DriverManager.getConnection("jdbc:postgresql://localhost:5453/banana","postgres", "aluno");   
                System.out.println("Opened database successfully"); 
            }catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());            
        }
    }
    
}
