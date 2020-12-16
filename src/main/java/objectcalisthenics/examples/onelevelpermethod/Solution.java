package objectcalisthenics.examples.onelevelpermethod;

public class Solution {
    
    public String lerDados(String[][] data) {
        StringBuilder buf = new StringBuilder();

        lerLinhas(data, buf);
        return buf.toString();
    }

    private void lerLinhas(String[][] data, StringBuilder buf) {
        for (int i = 0; i < 10; i++) {
            lerColunas(data, buf, i);
        }
    }

    private static void lerColunas(String[][] data, StringBuilder buf, int i) {
        for (int j = 0; j < 10; j++) {
            buf.append(data[i][j]);
        }
        buf.append("\n");
    }

}
