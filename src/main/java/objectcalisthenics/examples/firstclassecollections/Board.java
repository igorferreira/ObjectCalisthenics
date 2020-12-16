package objectcalisthenics.examples.firstclassecollections;

import lombok.Data;

@Data
public class Board {
    
    private BoardRowCollection rows;
    private BoardColumnCollection columns;

    public Board(BoardRowCollection rows, BoardColumnCollection columns) {
        this.rows = rows;
        this.columns = columns;
    }

	public Board() {
	}
   
}
