import java.util.Scanner;

public class Ejercicio4 
{
    public static String validarEstado() 
    {
        Scanner scanner = new Scanner(System.in);
        String estado;

        while (true) 
        {
            System.out.print("Ingrese el estado del caso de prueba (PASSED, FAILED, BLOCKED): ");
            estado = scanner.nextLine().toUpperCase(); 

            if (estado.equals("PASSED") || estado.equals("FAILED") || estado.equals("BLOCKED"))
            {
                break; 
            }
            else {
                System.out.println("Error: Estado incorrecto. Debe ser PASSED, FAILED o BLOCKED.");
            }
        }
        scanner.close();
        return estado;
    }

    public static void main(String[] args) 
    {
        String estadoValido = validarEstado();
        System.out.println("Estado ingresado correctamente: " + estadoValido);
    }
}
