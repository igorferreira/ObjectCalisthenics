package objectcalisthenics.examples.firstclassecollections;

import java.util.Iterator;

import lombok.Data;

@Data
public class Buu {

    private BoardRowCollection rows;
 
	public Buu(BoardRowCollection rows) {
        this.rows = rows;
	}

	public BoardRow find8thRow() {
        int count = 0;

        BoardRow row = null;
        Iterator<BoardRow> it=rows.iterator();

        while(it.hasNext()) {
            row = (BoardRow) it.next();
            count++;
            if (count == 8) break;
        }
        return row;
	}
}
