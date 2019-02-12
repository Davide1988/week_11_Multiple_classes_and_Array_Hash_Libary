import java.util.ArrayList;

public class Client {

    private String name;
    private ArrayList<Book> bag;

    public Client(String name){
        this.name = name;
        this.bag = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public int checkBag(){
        return this.bag.size();
    }

    public void getBook(Book book){
        this.bag.add(book);
    }

    public void getBookFromLibrary(Library library){
        this.bag.add(library.giveBook());
    }


}
