
package design_parttens;

import logica_negocio.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ClienteDAO implements BaseDAO{

    @Override
    public ArrayList<Object> find() {
        Connection c;
        Statement stmt;
        ResultSet rs ;
        ResultSetMetaData rsmd ;
        ArrayList<Object> saida = null ;
        String query= "select * from cliente;";
        try{
            saida= new ArrayList<Object>();
            c       = DriverManager.getConnection("jdbc:postgresql://localhost:5432/autopecas","postgres","aluno");   
            System.out.println("Opened database successfully"); 
            stmt    = c.createStatement();
            rs      = stmt.executeQuery(query);
            rsmd    = rs.getMetaData();
            int numero_colunas;
            numero_colunas = rsmd.getColumnCount()+1;
            while (rs.next()) {
                String buffer_saida="";
                for (int i=1; i<numero_colunas; i++ ){
                    if (i==1){
                        buffer_saida = buffer_saida + rs.getString(i);
                    }else{
                        buffer_saida = buffer_saida +"," + rs.getString(i);
                    }   
                }if(!buffer_saida.isEmpty()){
                     saida.add(parseCliente(buffer_saida));
                }               
            }
            //fechando tudo
            rs.close(); stmt.close(); c.close();            
        }catch (SQLException e) {
          System.err.println("meu erro "+e.getClass().getName() + ": " + e.getMessage());            
        }         
        return saida;   
    }

    @Override
    public void insert(Object obj) {
        String query    = transform(obj);
        Connection c    ;
        Statement stmt  ;
        ResultSet rs    ;
        try{
            c       = DriverManager.getConnection("jdbc:postgresql://localhost:5432/autopecas","postgres","aluno");   
            System.out.println("Opened database successfully"); 
            stmt    = c.createStatement();
            rs      = stmt.executeQuery(query);
            // fechando tudo
            rs.close(); stmt.close(); c.close();     
        }catch (SQLException e) {
          System.err.println("não entrou "+e.getClass().getName() + ": " + e.getMessage()); /*socorro*/           
        }
    }

    @Override
    public void update(Object velho,Object novo) {
        String comeco_query=prepareUpdate(novo);
        String fim_query=prepareCondition(velho);
        String query =comeco_query+fim_query;
        Connection c    ;
        Statement stmt  ;
        ResultSet rs    ;
        try{
            c       = DriverManager.getConnection("jdbc:postgresql://localhost:5432/autopecas","postgres","aluno");   
            System.out.println("Opened database successfully"); 
            stmt    = c.createStatement();
            rs      = stmt.executeQuery(query);
            //fechando
            rs.close();stmt.close();c.close();     
        }catch (SQLException e) {
          System.err.println("meu erro "+e.getClass().getName() + ": " + e.getMessage()); /*socorro*/           
        }
    }

    @Override
    public void delete(String query) {
        System.out.println("ainda não esta implementado");
    }
    
    /**
 * 
 * @param obj
 * @return  uma String com uma query para inserir no banco de dados
 */
    @Override    
    public String transform(Object obj) {
        Cliente cliente = (Cliente)obj;
        String insert_query="INSERT INTO public.cliente(cpf, nome, nascimento, email, senha, logradouro, cep, numero, complemento, referencia)VALUES(";
        String cpf   = String.valueOf(cliente.getCpf().getD1())+String.valueOf(cliente.getCpf().getD2())+String.valueOf(cliente.getCpf().getD3())+String.valueOf(cliente.getCpf().getValidador());
        String nome  = cliente.getNomeCompleto();
        String nasc  = String.valueOf(cliente.getNascimento());
        String email = cliente.getUser().getEmail();
        String senha = cliente.getUser().getSenha();
        String logradouro = cliente.getEndereco().getLogradouro();
        String cep = String.valueOf(cliente.getEndereco().getCep());
        String numero = cliente.getEndereco().getNumero();
        String complemento = cliente.getEndereco().getComplemento();
        String ref= cliente.getEndereco().getReferencia();
        insert_query =  insert_query +"'"+ cpf +"' ," ;
        insert_query =  insert_query +"'"+ nome +"' ," ;
        insert_query =  insert_query +"'"+nasc+"' ," ;
        insert_query =  insert_query +"'"+email+"' ," ;
        insert_query =  insert_query +"'"+senha+"' ," ;
        insert_query =  insert_query +"'"+logradouro+"' ," ;
        insert_query =  insert_query +"'"+cep+"' ," ;
        insert_query =  insert_query +"'"+numero+"' ," ;
        insert_query =  insert_query +"'"+complemento+"' ," ;
        insert_query =  insert_query +"'"+ref+"' );" ;
        return insert_query;     
    }
    
    /*funções próprias*/ 
    /**
     * 
     * @param values
     * @return 
     * tranforma uma linha CSV em um Object cliente
     */
    public Object parseCliente(String values){
        //System.out.println(values);
        String array[] = new String[10];
        array = values.split(",");
        String cpf   = array[0];
        int d1=Integer.parseInt(array[0].substring(0, 3));
        int d2=Integer.parseInt(array[0].substring(3, 6));
        int d3=Integer.parseInt(array[0].substring(6, 9));
        int validador = Integer.parseInt(array[0].substring(9, 11));
        String nome  = array[1];
        String data_nascimento[] = new String[3];
        data_nascimento = array[2].split("-");
        //c.set(1994, 06, 01);
        //Calendar c = null;
        //c.set(1994, 06, 01);
        //Data nasc = new Data(Integer.parseInt(data_nascimento[0]), Integer.parseInt(data_nascimento[1]), Integer.parseInt(data_nascimento[2]));
        //nasc.setAno(Integer.parseInt(data_nascimento[0]));
        //nasc.setMes(Integer.parseInt(data_nascimento[1]));
        //nasc.setDia(Integer.parseInt(data_nascimento[2]));
        int ano = Integer.parseInt(data_nascimento[0]);
        int mes = Integer.parseInt(data_nascimento[1]);
        int dia = Integer.parseInt(data_nascimento[2]);
        String email = array[3];
        String senha = array[4];
        String logradouro = array[5];
        int cep = Integer.parseInt(array[6]);
        String numero = array[7];
        String complemento = array[8];
        String ref= array[9];
        
        
        //torcar Date por calendar
        DiretorCliente diretorcliente = new DiretorCliente(d1,d2, d3, validador, email, senha, logradouro, cep, numero, complemento, ref, nome, dia, mes, ano);
        return (Object)diretorcliente.getBuildercliente().getCliente();        
    }
    /**
     * 
     * @param obj
     * @return primeira parte do UPDATE
     */
    private String prepareCondition(Object obj){
        String condition = "WHERE";
        Cliente cliente = (Cliente)obj;
        String cpf          = String.valueOf(cliente.getCpf().getD1())+String.valueOf(cliente.getCpf().getD2())+String.valueOf(cliente.getCpf().getD3())+String.valueOf(cliente.getCpf().getValidador());
        String nome         = cliente.getNomeCompleto();
        String nasc= cliente.getNascimento().transform(cliente.getNascimento());
        String email        = cliente.getUser().getEmail();
        String senha        = cliente.getUser().getSenha();
        String logradouro   = cliente.getEndereco().getLogradouro();
        String cep          = String.valueOf(cliente.getEndereco().getCep());
        String numero       = cliente.getEndereco().getNumero();
        String complemento  = cliente.getEndereco().getComplemento();
        String ref          = cliente.getEndereco().getReferencia();
        condition= condition + " cpf='"+ cpf +"' and ";
        condition= condition + " nome='"+ nome +"' and ";
        condition= condition + " nascimento='"+ nasc +"' and ";
        condition= condition + " email='"+ email +"' and ";
        condition= condition + " senha='"+ senha +"' and ";
        condition= condition + " logradouro='"+ logradouro +"' and ";
        condition= condition + " cep='"+ cep +"' and ";
        condition= condition + " numero='"+ numero +"' and ";
        condition= condition + " complemento='"+ complemento +"' and ";
        condition= condition + "referencia='"+ ref +"';";
        
        return condition;        
    }
    /**
     * 
     * @param obj
     * @return final do UPDATE
     */
    private String prepareUpdate(Object obj){
        Cliente cliente= (Cliente)obj;
        String update="UPDATE cliente SET ";
        String cpf          = String.valueOf(cliente.getCpf().getD1())+String.valueOf(cliente.getCpf().getD2())+String.valueOf(cliente.getCpf().getD3())+String.valueOf(cliente.getCpf().getValidador());
        String nome         = cliente.getNomeCompleto();
        String nasc= cliente.getNascimento().transform(cliente.getNascimento());
        String email        = cliente.getUser().getEmail();
        String senha        = cliente.getUser().getSenha();
        String logradouro   = cliente.getEndereco().getLogradouro();
        String cep          = String.valueOf(cliente.getEndereco().getCep());
        String numero       = cliente.getEndereco().getNumero();
        String complemento  = cliente.getEndereco().getComplemento();
        String ref          = cliente.getEndereco().getReferencia();
        update = update + " cpf='"+ cpf +"',";
        update = update + " nome='"+ nome +"',";
        update = update + " nascimento='"+ nasc +"',";
        update = update + " email='"+ email +"',";
        update = update + " senha='"+ senha +"',";
        update = update + " logradouro='"+ logradouro +"',";
        update = update + " cep='"+ cep +"',";
        update = update + " numero='"+ numero +"',";
        update = update + " complemento='"+ complemento +"',";
        update = update + " referencia='"+ ref +"' ";
        return update;        
    }
}
