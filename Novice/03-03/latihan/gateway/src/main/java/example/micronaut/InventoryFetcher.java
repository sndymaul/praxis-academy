package main.java.example.micronaut;

/**
 * InventoryFetcher
 */
import io.reactivex.Maybe;

/**
 * InventoryFetcher
 */
public interface InventoryFetcher {

    Maybe<Integer> inventory(String isbn);
}