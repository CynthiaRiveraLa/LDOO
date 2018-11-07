package MODELO;

public final class Persona1{
    private String usuario;
    private String contrasena;
    
    
    public Persona1(String usuario, String contrasena){
        
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
