public class LibraryService {

    // Issues a book and decrements available copies from the catalogue
    public static int issueBook(int availableCopies, String title) throws BookUnavailableException {
        if (availableCopies <= 0) {
            throw new BookUnavailableException("Book '" + title + "' is out of stock.");
        }
        return availableCopies - 1;
    }

    public static void main(String[] args) {
        try {
            int remaining = issueBook(3, "Java Programming");
            System.out.println("Remaining copies: " + remaining);
        } catch (BookUnavailableException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}