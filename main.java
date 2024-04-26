import java.io.BufferedReader;
import java.io.IOException;
import java.util.LinkedList;
import java.io.InputStreamReader;

public class main{
    public static void main(String[] args) throws IOException {
        BufferedReader cp = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<empleado> listaEmpleados = new LinkedList<empleado>();
        for (int i = 0; i < 3; i++) {
            empleado e = new empleado(null, null, i, null);
            System.out.println("Ingrese el nombre del empleado");
            e.setNombre(cp.readLine());
            System.out.println("Ingrese el apellido del empleado");
            e.setApellido(cp.readLine());
            System.out.println("Ingrese la edad del empleado");
            e.setEdad(Integer.parseInt(cp.readLine()));
            System.out.println("Ingrese el cargo del empleado");
            e.setCargo(cp.readLine());
            listaEmpleados.add(e);
        }
        System.out.println(listaEmpleados);
        
    }
}