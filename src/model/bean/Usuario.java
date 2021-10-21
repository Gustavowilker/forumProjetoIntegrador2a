
package model.bean;


public class Usuario {
    
    private int id_user;
    private String usu_senha;

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getSenha() {
        return usu_senha;
    }

    public void setSenha(String usu_senha) {
        this.usu_senha = usu_senha;
    }
    
}
