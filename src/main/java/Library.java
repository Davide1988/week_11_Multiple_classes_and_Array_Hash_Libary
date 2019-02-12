import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private String name;
    private int capacity;
    private ArrayList<Book> collection;
    private HashMap<String,Integer> catalogue;

    public Library(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.collection = new ArrayList<>();
        this.catalogue =  new HashMap<>();
    }

    public String getName(){
        return this.name;
    }

    public int getNumberOfBooksInCollection(){
        return this.collection.size();
    }

    public void addBook(Book book){
        if (getNumberOfBooksInCollection() < this.capacity)
        this.collection.add(book);
    }

    public Book giveBook(){
        return this.collection.remove(0);
    }

    public void makeCatalogue(Book book1,Book book2){
        for (int i=0; i<getNumberOfBooksInCollection(); i++){
            this.catalogue.put(book1.getGenre(),1);
        }
//        int num = getNumberOfBooksInCollection();
//        String title = book1.getGenre();
//        this.catalogue.put(title, num);
//        for (Book book : this.collection){
////            this.catalogue.put(book.getGenre(), 1);
////        }
}

    public HashMap<String, Integer> getCatalogue(){
        return this.catalogue;
    }




}
