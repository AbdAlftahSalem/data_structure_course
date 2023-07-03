public class Main {
    public static void main(String[] args) {

        EbookReader reader = new EbookReader();

        Ebook book1 = new Ebook("First book", "Abd Alftah");
        Ebook book2 = new Ebook("Second book", "Ahmed");
        Ebook book3 = new Ebook("Third book", "Ali");

        reader.buyBook(book1);
        reader.buyBook(book2);

        reader.viewPurchasedBooks();

        reader.readBook(book1);
        reader.readBook(book2);
        reader.readBook(book3);

    }
}