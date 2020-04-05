package main.java.example.micronaut;

/**
 * BooksFetcher
 */
/**
 * InnerBooksFetcher
 */
    import io.reactivex.Flowable;
    
public interface InnerBooksFetcher {
    Flowable<Book> fetchBooks();
    
}