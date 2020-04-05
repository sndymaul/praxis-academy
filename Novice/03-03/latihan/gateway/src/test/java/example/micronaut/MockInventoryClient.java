package test.java.example.micronaut;

/**
 * MockInventoryClient
 */

 import io.micronaut.context.annotation.Requires;
 import io.micronaut.context.env.Environment;
 import io.reactivex.Flowable;
import main.java.example.micronaut.InventoryFetcher;

import javax.inject.Singleton;

 @Singleton
 @Requires(env = Environment.TEST)
public class MockInventoryClient implements InventoryFetcher{

    @Override
    public maybe<Integer> inventory(String isbn){
        if(isbn.equals("1491950358")){
            return Maybe.just(2);
        }
        if (isbn.equals("1680502395")){
            return Maybe.just(0);
        }
        return Maybe.empty();
    }

}