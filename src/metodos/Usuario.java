
package metodos;

public class Usuario implements Forum {
    protected String  usu_nome, usu_email, usu_senha;
    private int id_user;

    

    public Usuario(int id_user, String usu_nome, String usu_email, String usu_senha) {
        
        this.id_user = id_user;       
        this.usu_nome = usu_nome;
        this.usu_email = usu_email;
        this.usu_senha = usu_senha;
    }

    public Usuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

   
  

    public void Incluir(){};
    public void Alterar(){};
    public void Listar(){};

   

    public int getId_user(){
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }
    

    public String getUsu_nome() {
        return usu_nome;
    }

    public void setUsu_nome(String usu_nome) {
        this.usu_nome = usu_nome;
    }

    public String getUsu_email() {
        return usu_email;
    }

    public void setUsu_email(String usu_email) {
        this.usu_email = usu_email;
    }

    public String getUsu_senha() {
        return usu_senha;
    }

    public void setUsu_senha(String usu_senha) {
        this.usu_senha = usu_senha;
    }
}

    


