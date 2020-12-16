package objectcalisthenics.examples.onelevelpermethod;

public class Problem {
    
    public String lerDados(String[][] data)
    {
        StringBuilder buf = new StringBuilder();
        // Primeiro nivel 
        for (int i = 0; i < 10; i++)
        {
            // Segundo nivel
            for (int j = 0; j < 10; j++)
            {
                // Primeiro nivel
                buf.append(data[i][j]);
            }
            buf.append("\n");
        }
        return buf.toString();
    }
}
