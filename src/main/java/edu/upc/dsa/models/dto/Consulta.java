package edu.upc.dsa.models.dto;

public class Consulta {

    String fecha;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    String title;

    String comentario;
    String sender;

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public Consulta(){

    }

    public Consulta(String fecha, String title, String comentario, String sender){

        setFecha(fecha);
        setTitle(title);
        setComentario(comentario);
        setSender(sender);

    }
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
