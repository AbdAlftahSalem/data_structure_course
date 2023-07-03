import java.util.*;

class Ebook {
    private final String title;
    private final String author;

    public Ebook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void read() {
        System.out.println("Reading " + title + " by " + author);
    }
}

class EbookReader {
    private final List<Ebook> purchasedBooks;

    public EbookReader() {
        purchasedBooks = new ArrayList<>();
    }

    public void buyBook(Ebook book) {
        purchasedBooks.add(book);
        System.out.println("You have purchased the book: " + book.getTitle());
    }

    public void viewPurchasedBooks() {
        if (purchasedBooks.isEmpty()) {
            System.out.println("You haven't purchased any books yet.");
        } else {
            System.out.println("Your purchased books:");
            for (Ebook book : purchasedBooks) {
                System.out.println(book.getTitle() + " by " + book.getAuthor());
            }
        }
    }

    public void readBook(Ebook book) {
        if (purchasedBooks.contains(book)) {
            book.read();
        } else {
            System.out.println("You haven't purchased this book. Please buy it first.");
        }
    }
}