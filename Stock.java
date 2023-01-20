import java.util.ArrayList;
import java.util.Iterator;

/**
 * Classe que implementa a gestão de stock dos livros
 * implementa as várias funções de pesquisa, calculo da média, e printing
 */

public class Stock implements Printer{
    ArrayList<Book> bookStock;
    public Stock(){
        this.bookStock = new ArrayList<>();
    }
    public ArrayList<Book> getBookStock() {
        return bookStock;
    }
    public void addBookToStock(Book book){
        this.bookStock.add(book);
    }
    public void removeBookFromStock(Book book){
        this.bookStock.remove(book);
    }
    public void removeBookFromStockByID(String id){

        for(Book book : bookStock){
            if(book.getId().equals(id)){
                bookStock.remove(book);
            }
        }
    }
    public ArrayList<Book> getBookListByTitle(String title){
        ArrayList<Book> result = new ArrayList<>();
        for(Book book : bookStock){;
            if(book.getName().equals(title)){
                result.add(book);
            }
        }
        return result;
    }
    public ArrayList<Book> getBookListByTerm(String term){
        ArrayList<Book> result = new ArrayList<>();
        System.out.println("Resultado dos valores pela pesquisa do termo '" + term+"'");
        for(Book book : bookStock){;
            if(book.getName().contains(term)){
                result.add(book);
            }
        }
        return result;
    }

    public ArrayList<Book> getBookListByValue(double term){
        ArrayList<Book> result = new ArrayList<>();
        System.out.println("Resultados da pesquisa pelo valor "+term);
        for( Book book : this.bookStock){
            if(book.getPrice() == term){
                result.add(book);
            }
        }
        return result;
    }

    public ArrayList<Book> getBookListByValue(double lower, double higher){
        ArrayList<Book> result = new ArrayList<>();
        System.out.println("Resultados da pesquisa entre os valores "+ lower + " e " +higher);
            for( Book book : this.bookStock){
                if(book.getPrice() >= lower && book.getPrice()<= higher){
                    result.add(book);
                }
            }
        return result;
    }

@Override
    public void printToConsole(){

        for( Book book : this.bookStock){
            System.out.println(book.getId() +" - " + book.getName() + " - " + book.getAuthor() + " - " + book.getPrice());
        }
    }
    public double getTotalBookPrice(){

        double total= 0.0;
        for( Book book : this.bookStock){
            total += book.getPrice();
        }
        return (total/bookStock.size());
    }

    @Override
    public String toString() {
        return "Stock{" +
                "bookStock=" + bookStock +
                '}';
    }

    public void toConsole(ArrayList<Book> bookList)
    {
        System.out.println("Lista de livros : ");
        /*for (Book book : bookList){
            book.toConsole();
        }*/
        //substitui o método foreach pelo iterator

        Iterator<Book> iter = bookList.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
    public double getStockAveragePriceByStream(){
        return this.bookStock.stream().mapToDouble(Book::getPrice).average().getAsDouble();
    }
}
