package objectcalisthenics.examples.firstclassecollections;

import java.util.Iterator;

import lombok.Data;

@Data
public class Foo {

    private BoardRowCollection rows;
 
	public Foo(BoardRowCollection rows) {
        this.rows = rows;
	}

	public BoardRow find5thRow() {
		
        int count = 0;
        Iterator<BoardRow> it=rows.iterator();
        BoardRow row = null;
        while(it.hasNext()) {
            row = (BoardRow) it.next();
            count++;
            if (count == 5) break;
        }
        return row;
	}

}
