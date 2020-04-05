package main.java.example.micronaut;

/**
 * BooksClient
 */
/**
 * BooksClient
 */
    import io.micronaut.context.annotation.Requires;
    import io.micronaut.context.env.Environment;
    import io.micronaut.http.annotation.Get;
    import io.micronaut.http.client.annotation.client;
    import io.reactivex.Flowable;

    @Client("books")
    @Requires(notEnv = Environment.TEST)
    public interface BooksClient extends BooksFetcher {
        
        @Override @Get("/api/books") Flowable<Book> fetchBooks();

        
    }