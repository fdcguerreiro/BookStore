import java.util.ArrayList;

/**
 * Loja de livros com 2 classes (Book e Stock)
 * Implementa métodos de busca e iteração de objectos
 */
public class App {

    public static void main(String[] args) {

        //Cria um objecto para guardar os livros que criamos
        Stock stockLoja = new Stock();

        //Livros para a loja
        Book book1 = new Book("1","Os Lusíadas", "Luis Vaz de Camões", 10.00);
        Book book2 = new Book("2", "Mensagem", "Fernando Pessoa", 10.00);
        Book book3 = new Book("3", "O Rapaz ao Fundo da Sala", "Onjali Rauf", 14.99);
        Book book4 = new Book("4", "O Rapaz do Rio", "Tim Bowler", 10.71);
        Book book5 = new Book("5", "O Rapaz do caixote de madeira", "Leon Leyson", 12.90);

        //Adicionamos os livros a uma ArrayList que existe dentro da classe Stock
        stockLoja.addBookToStock(book1);
        stockLoja.addBookToStock(book2);
        stockLoja.addBookToStock(book3);
        stockLoja.addBookToStock(book4);
        stockLoja.addBookToStock(book5);
        //Banner :-D
        System.out.println(" _______     ______      ______    __   ___       ________  ___________  ______     _______    _______");
        System.out.println("|   _  \"\\   /    \" \\    /    \" \\  |/\"| /  \")     /\"       )(\"     _   \")/    \" \\   /\"      \\  /\"     \"|");
        System.out.println("(. |_)  :) // ____  \\  // ____  \\ (: |/   /     (:   \\___/  )__/  \\\\__/// ____  \\ |:        |(: ______)");
        System.out.println("|:     \\/ /  /    ) :)/  /    ) :)|    __/       \\___  \\       \\\\_ /  /  /    ) :)|_____/   ) \\/    |");
        System.out.println("(|  _  \\\\(: (____/ //(: (____/ // (// _  \\        __/  \\\\      |.  | (: (____/ //  //      /  // ___)_");
        System.out.println("|: |_)  :)\\        /  \\        /  |: | \\  \\      /\" \\   :)     \\:  |  \\        /  |:  __   \\ (:      \"|");
        System.out.println("(_______/  \\\"_____/    \\\"_____/   (__|  \\__)    (_______/       \\__|   \\\"_____/   |__|  \\___) \\_______)");
        System.out.println("Stock de Livros da Loja: \n");
        //Apresentação do stock dos livros criados em cima
        printToAppConsole(stockLoja); //Uso do interface que criámos para o print

        //função de average implementada no método "tradicional"
        System.out.println("\nPreço médio do stock em loja : " + stockLoja.getTotalBookPrice());
        System.out.println("");
        //função de average implementada no método stream
        System.out.println("\nPreço médio do stock em loja (by stream) :" + stockLoja.getStockAveragePriceByStream());
        System.out.println("");
        System.out.println("Remove o 5º livro...");
        stockLoja.removeBookFromStock(book5); //função de remover o objecto

        printToAppConsole(stockLoja);
        System.out.print("\n");

        System.out.println("Adiciona o 5º livro novamente...");
        stockLoja.addBookToStock(book5); //função para adicionar livros ao stock
        System.out.print("\n");

        printToAppConsole(stockLoja);

        ArrayList<Book> resultado = new ArrayList<>();
        System.out.print("\n");
        resultado = stockLoja.getBookListByTerm("Rapaz");//função de pesquisa por termo
        stockLoja.toConsole(resultado);

        resultado = new ArrayList<>();

        System.out.println("\n");
        resultado = stockLoja.getBookListByValue(10.00);//função de pesquisa por valor específico
        stockLoja.toConsole(resultado);

        resultado= new ArrayList<>();

        System.out.println("\n");
        resultado = stockLoja.getBookListByValue(9, 11);//função pesquisa por intervalo de valores
        stockLoja.toConsole(resultado);

    }

    /**
     * implementa a função de printer para a main
     * @param printer
     */
    public static void printToAppConsole (Printer printer){
        printer.printToConsole();
    }

}
