import java.util.Scanner;

public class Ejercicio6 
{
    public static void dividir(int a, int b) 
    {
        try 
        {
            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } 
        catch (Exception e) 
        {
            System.out.println("Error");
        }
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();

        dividir(num1, num2); 

        dividir(10, 2);
        
        dividir(5, 0);

        scanner.close();
    }
}
