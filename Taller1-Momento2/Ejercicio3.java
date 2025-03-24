import java.util.HashMap;
import java.util.Map;

class TestResults 
{
    private Map<Integer, String> resultados;

    public TestResults() 
    {
        this.resultados = new HashMap<>();
    }

    public void agregarResultado(int id, String estado) 
    {
        if (estado.equals("PASSED") || estado.equals("FAILED") || estado.equals("BLOCKED")) 
        {
            resultados.put(id, estado);
        } 
        else 
        {
            System.out.println("Estado incorrecto. Debe ser PASSED, FAILED o BLOCKED.");
        }
    }

    public void actualizarResultado(int id, String nuevoEstado) 
    {
        if (resultados.containsKey(id)) 
        {
            if (nuevoEstado.equals("PASSED") || nuevoEstado.equals("FAILED") || nuevoEstado.equals("BLOCKED")) {
                resultados.put(id, nuevoEstado);
            } 
            else 
            {
                System.out.println("Estado incorrecto. Debe ser PASSED, FAILED o BLOCKED.");
            }
        }
        else 
        {
            System.out.println("No se encontro un caso de prueba con ID " + id);
        }
    }

    public void mostrarResultados() 
    {
        System.out.println("Resultado:");
        for (Map.Entry<Integer, String> entry : resultados.entrySet()) 
        {
            System.out.println("ID: " + entry.getKey() + " - Estado: " + entry.getValue());
        }
    }
}

public class Ejercicio3 
{
    public static void main(String[] args) 
    {
        TestResults resultados = new TestResults();

        resultados.agregarResultado(1, "PASSED");
        resultados.agregarResultado(2, "FAILED");
        resultados.agregarResultado(3, "BLOCKED");
        resultados.agregarResultado(4, "PASSED");
        resultados.agregarResultado(5, "FAILED");

        resultados.mostrarResultados();

        System.out.println("\nActualizando...\n");
        resultados.actualizarResultado(3, "PASSED");
        resultados.actualizarResultado(5, "PASSED");

        resultados.mostrarResultados();
    }
}
