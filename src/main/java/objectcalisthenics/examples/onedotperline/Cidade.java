package objectcalisthenics.examples.onedotperline;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cidade {

    private String nome;
    private Estado estado;
}
