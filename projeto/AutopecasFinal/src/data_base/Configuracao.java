package data_base;
public class Configuracao {
    private String url;
    private String user;
    private String senha;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Configuracao() {
        this.url    = "jdbc:postgresql://localhost:5432/autopecas";
        this.user   = "postgres";
        this.senha  = "aluno";
    }
    
    
    
}
