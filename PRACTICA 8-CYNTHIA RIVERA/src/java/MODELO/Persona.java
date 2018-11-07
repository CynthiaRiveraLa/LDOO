package MODELO;

public final class Persona{
    private String usuario;
    private String contrasena;
    
    
    public Persona(String usuario, String contrasena){
        
        setUsuario(usuario);
        
        
        setContrasena(contrasena);
    }

    public String getUsuario() {
       
        return usuario;
    }

    public void setUsuario(String usuario) {
        
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }
    
    public void setContrasena(String contrasena) {
        
        this.contrasena = contrasena;
    }
}
