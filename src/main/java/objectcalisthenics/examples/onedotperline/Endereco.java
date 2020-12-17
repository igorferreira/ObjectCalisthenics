package objectcalisthenics.examples.onedotperline;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Endereco {

    private String logradouro;
    private Integer numero;
    private Cidade cidade;
}
