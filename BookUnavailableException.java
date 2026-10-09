/**
 * Custom exception class for handling cases where a book is unavailable.
 */
public class BookUnavailableException extends Exception {
    public BookUnavailableException(String message) {
        super(message);
    }
}