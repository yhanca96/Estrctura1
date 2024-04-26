public class empleado {
    private String Nombre;
    private String Apellido;
    private int Edad;
    private String Direccion;
    private String Cargo;
    
    public empleado(String nombre, String apellido, int edad, String cargo) {
        Nombre = nombre;
        Apellido = apellido;
        Edad = edad;
        Cargo = cargo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }
  
}
