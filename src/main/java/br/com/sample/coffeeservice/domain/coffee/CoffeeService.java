package br.com.sample.coffeeservice.domain.coffee;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class CoffeeService {


    public CoffeeDetail check() {
        return new CoffeeDetail(getRandomBoolean());
    }

    private boolean getRandomBoolean() {
        return new Random().nextBoolean();
    }
}
