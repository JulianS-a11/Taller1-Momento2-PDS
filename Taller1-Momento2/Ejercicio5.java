import java.util.ArrayList;

public class Ejercicio5 
{
    public static void main(String[] args) 
    {
        
        ArrayList<String> resultados = new ArrayList<>();
        resultados.add("PASSED");
        resultados.add("FAILED");
        resultados.add("PASSED");
        resultados.add("BLOCKED");
        resultados.add("FAILED");

   
        int passedCount = 0, failedCount = 0, blockedCount = 0;

        
        for (String resultado : resultados) 
        {
            switch (resultado) 
            {
                case "PASSED":
                    passedCount++;
                    break;
                case "FAILED":
                    failedCount++;
                    break;
                case "BLOCKED":
                    blockedCount++;
                    break;
            }
        }

    
        System.out.println("Total de pruebas ejecutadas: " + resultados.size());
        System.out.println("PASSED: " + passedCount);
        System.out.println("FAILED: " + failedCount);
        System.out.println("BLOCKED: " + blockedCount);
    }
}
