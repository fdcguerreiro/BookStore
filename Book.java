import java.util.Objects;

/**
 * Classe java que vai guardar as informações dos livros que criamos
 *
 */
public class Book {

    private String id;
    private String name;
    private String author;
    private double price;

    public Book(String id, String name, String author, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id.equals(book.id) && name.equals(book.name) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, author);
    }

    @Override
    public String toString() {
        return "Livro -> " +
                "ISBN: " + id + '\'' +
                ", Titulo: '" + name + '\'' +
                ", Autor: '" + author + '\'' +
                ", Preço: " + price +
                '}';
    }

    public void toConsole(){
        System.out.println(id + " " + name + " " + author + " " + price);
    }
}
