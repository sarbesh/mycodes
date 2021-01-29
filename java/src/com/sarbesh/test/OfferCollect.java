package com.sarbesh.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import static java.util.logging.Level.INFO;
import static java.util.logging.Level.WARNING;

public class OfferCollect {

    private Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) {
        OfferCollect offerCollect = new OfferCollect();
        List<Offers> offersList = new ArrayList<>();
        offersList.add(new Offers(1,2,"offer11"));
        offersList.add(new Offers(3,4,"offer11"));
        offersList.add(new Offers(1,3,"offer11"));
        offersList.add(new Offers(2,3,"offer11"));
        offersList.add(new Offers(3,1,"offer11"));
        offersList.add(new Offers(3,3,"offer11"));
        offersList.add(new Offers(1,1,"offer11"));
        offersList.add(new Offers(2,1,"offer11"));
        offersList.add(new Offers(3,2,"offer11"));
        offerCollect.offerResponse(offersList).forEach(System.out::println);
    }

    public List<Offers> offerResponse(List<Offers> offersList){
        if (offersList == null) {
            logger.log(WARNING,"Got Null offerList");
            return null;
        } else {
            logger.log(INFO, String.format("offerList size:%d", offersList.size()));
            return offersList.stream()
                    .sorted(Comparator.comparing(Offers::getOfferCategoryPriority)
                            .thenComparing(Offers::getOfferPriority))
                    .distinct()
                    .limit(3)
                    .collect(Collectors.toList());
        }
    }
}
