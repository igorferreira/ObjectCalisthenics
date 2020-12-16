package objectcalisthenics.examples.firstclassecollections;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {

        BoardRowCollection boardRowCollection = new BoardRowCollection(new ArrayList<>());

        boardRowCollection.add(new BoardRow("1"));
        boardRowCollection.add(new BoardRow("2"));
        boardRowCollection.add(new BoardRow("3"));
        boardRowCollection.add(new BoardRow("4"));
        boardRowCollection.add(new BoardRow("5"));
        boardRowCollection.add(new BoardRow("6"));
        boardRowCollection.add(new BoardRow("7"));
        boardRowCollection.add(new BoardRow("8"));

        BoardColumnCollection boardColumnCollection = new BoardColumnCollection(new ArrayList<>());

        boardColumnCollection.add(new BoardColumn("1"));
        boardColumnCollection.add(new BoardColumn("2"));
        boardColumnCollection.add(new BoardColumn("3"));
        boardColumnCollection.add(new BoardColumn("4"));
        boardColumnCollection.add(new BoardColumn("5"));
        boardColumnCollection.add(new BoardColumn("6"));
        boardColumnCollection.add(new BoardColumn("7"));
        boardColumnCollection.add(new BoardColumn("8"));

        Board board = new Board(boardRowCollection,boardColumnCollection);
        Foo foo = new Foo(board.getRows());
        Buu buu = new Buu(foo.getRows());

        BoardRow row5 = foo.find5thRow();
        BoardRow row8 = buu.find8thRow();

        System.out.println("print row5: \n" + row5 + "\n\n");
        System.out.println("print row8: \n" + row8 + "\n\n");
    }
}
