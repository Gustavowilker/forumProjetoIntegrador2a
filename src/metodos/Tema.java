
package metodos;


import java.time.LocalDateTime;

public class Tema implements Forum{
    
    private String id_form, comentarios;
    

    public Tema(String id_form, String comentarios) {
       
        this.id_form = id_form;
        this.comentarios = comentarios;
        
    }

   

    public String getId_form() {
        return id_form;
    }

    public void setId_form(String id_form) {
        this.id_form = id_form;
    }

    public String getComentario() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    

    public void Incluir(){
        System.out.print("Tema incluso");
    };
    public void Listar() {};
}


