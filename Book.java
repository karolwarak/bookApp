public class Book {

    private String author;
    private String title;
    private String bookDescription;
    private Integer numberOfPages;

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Book(String author, String title, String bookDescription, Integer numberOfPages) {
        this.author = author;
        this.title = title;
        this.bookDescription = bookDescription;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", bookDescription='" + bookDescription + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }
}
