import java.util.ArrayList;

public class Book {
    private String title;
    private int yearPublished;
    private int numberOfPages;
    private ArrayList<String> genre;
    private ArrayList<String> format;
    private String language;
    private int ageRecommandation;
    private ArrayList<String> editorialAgency;
    private double price;
    private boolean isInStock;
    private int quantity;

    public Book(String title, int yearPublished,
                int numberOfPages, ArrayList<String> genre, ArrayList<String> format,
                String language, int ageRecommandation,
                ArrayList<String> editorialAgency, double price,
                boolean isInStock, int quantity) {
        this.title = title;
        this.yearPublished = yearPublished;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
        this.format = format;
        this.language = language;
        this.ageRecommandation = ageRecommandation;
        this.editorialAgency = editorialAgency;
        this.price = price;
        this.isInStock = isInStock;
        this.quantity = quantity;
    }

    public void translateBook(String language) {
        this.language = language;
    }

    public void changeAgeRecommandation(int ageRecommandation) {
        this.ageRecommandation = ageRecommandation;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void priceCut(int percentage) {
        this.price = price - (price * percentage / 100);
    }

    public void priceIncrease(int percentage) {
        this.price = price + (price * percentage / 100);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", yearPublished=" + yearPublished +
                ", numberOfPages=" + numberOfPages +
                ", genre=" + genre +
                ", format=" + format +
                ", language='" + language + '\'' +
                ", ageRecommandation=" + ageRecommandation +
                ", editorialAgency=" + editorialAgency +
                ", price=" + price +
                ", isInStock=" + isInStock +
                ", quantity=" + quantity +
                '}';
    }
}
