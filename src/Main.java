import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> genre = new ArrayList<>();
        genre.add("Horror");
        genre.add("Sci-Fi");

        ArrayList<String> format = new ArrayList<>();
        format.add("Small");

        ArrayList<String> editorialAgency = new ArrayList<>();
        editorialAgency.add("Polirom");

        Book book = new Book("Brave New World",
                1967,
                326,
                genre,
                format,
                "English",
                16,
                editorialAgency,
                25.90,
                true,
                700
                );

        System.out.println(book);
        book.priceCut(15);
        System.out.println(book);

    }
}