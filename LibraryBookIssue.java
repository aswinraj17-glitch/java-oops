class Book {
    String title; boolean available = true;
    Book(String title) { this.title = title; }
    void issueBook() {
        if (available) { available = false; System.out.println(title + " issued"); }
        else System.out.println(title + " is not available");
    }
    void returnBook() { available = true; System.out.println(title + " returned"); }
}
public class LibraryBookIssue {
    public static void main(String[] args) {
        Book book = new Book("Java Programming");
        book.issueBook(); book.issueBook(); book.returnBook(); book.issueBook();
    }
}
