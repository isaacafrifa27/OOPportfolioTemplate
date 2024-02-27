class Book {
    private String title;
    private String author;
    private String publisher;
    private int copyrightDate;

    public Book(String title, String author, String publisher, int copyrightDate) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.copyrightDate = copyrightDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getCopyrightDate() {
        return copyrightDate;
    }

    public void setCopyrightDate(int copyrightDate) {
        this.copyrightDate = copyrightDate;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nPublisher: " + publisher +
                "\nCopyright Date: " + copyrightDate;
    }
}

public class Bookshelf {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Scribner", 1925);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "J.B. Lippincott & Co.", 1960);

        System.out.println("Initial Information:");
        System.out.println("Book 1:\n" + book1);
        System.out.println("\nBook 2:\n" + book2);

        book1.setPublisher("Penguin Classics");
        book2.setCopyrightDate(1962);

        System.out.println("\nUpdated Information:");
        System.out.println("Book 1:\n" + book1);
        System.out.println("\nBook 2:\n" + book2);
    }
}
