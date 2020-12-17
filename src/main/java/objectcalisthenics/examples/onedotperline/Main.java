package objectcalisthenics.examples.onedotperline;

public class Main {
    
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua Campos Sales", 705, new Cidade("Rio de Janeiro", new Estado("Rio de Janeiro")));
        System.out.println("\n Endereco: " + endereco.getLogradouro() + "," + endereco.getNumero());
        System.out.println(" Cidade: " + endereco.getCidade().getNome());
        System.out.println(" Estado: " + endereco.getCidade().getEstado().getNome());
    }
}
