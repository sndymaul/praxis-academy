package main.groovy.example.micronaut

/**
 * BooksRepository
 */


interface BooksRepository{
    List<Book> findAll()
}