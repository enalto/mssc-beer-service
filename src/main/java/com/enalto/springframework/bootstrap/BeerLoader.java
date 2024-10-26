package com.enalto.springframework.bootstrap;

import com.enalto.springframework.domain.Beer;
import com.enalto.springframework.repositories.BeerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;
    private static final Logger logger = LoggerFactory.getLogger(BeerLoader.class);

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjets();
    }

    private void loadBeerObjets() {

        if (beerRepository.count() == 0) {
            beerRepository.save(
                    Beer.builder()
                            .beerName("Beer")
                            .beerStyle("IPA")
                            .minOnhand(12)
                            .quantityToBrew(200)
                            .upc(337010000001L)
                            .price(new BigDecimal("10.95"))
                            .build()
            );

            beerRepository.save(
                    Beer.builder()
                            .beerName("Galaxy")
                            .beerStyle("PALE_ALE")
                            .minOnhand(6)
                            .quantityToBrew(200)
                            .upc(337010000002L)
                            .price(new BigDecimal("12.95"))
                            .build()

            );

        }

        logger.error("Loaded {} beers", beerRepository.count());
        beerRepository.findAll().forEach(System.out::println);

    }
}
