package main.groovy.example.micronaut


import groovy.transform.CompileStatic
import javax.inject.Singleton

@CompileStatic
@Singleton
class BooksRepositoryImpl implements BooksRepository {

    @Override
    List<Book> findAll() {
        [
            new Book("1491950358", "Holan Buku"),
            new Book("1680502395", "Bukunya!"),
        ]
    }
}