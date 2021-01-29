package com.sarbesh.test;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class OfferCollectTest {

    @org.junit.jupiter.api.Test
    void offerResponseSizeTest() {
        List<Offers> offersList = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i <15 ; i++) {
            int offerCatPrio = rand.nextInt(5)+1;
            int offerPrio = rand.nextInt(4)+1;
            offersList.add(new Offers(offerPrio,offerCatPrio,
                    String.format("offer%d%d", offerPrio, offerCatPrio)));
        }
        OfferCollect offerCollect = new OfferCollect();
        assertEquals(3,offerCollect.offerResponse(offersList).size());
    }

    @Test
    void nullArrayListTest(){
        OfferCollect offerCollect = new OfferCollect();
        assertNull(offerCollect.offerResponse(null));
    }

    @Test
    void testMain(){
        assertDoesNotThrow(() -> OfferCollect.main(null));
    }

    @Test
    void testSetters(){
        Offers offers = new Offers();
        offers.setOffer("offer");
        offers.setOfferPriority(1);
        offers.setOfferCategoryPriority(1);
        offers.setMetadata("Meta Data");
        assertAll(
                () -> assertEquals(1,offers.getOfferCategoryPriority()),
                () -> assertEquals(1,offers.getOfferPriority()),
                () -> assertTrue(offers.getOffer().equalsIgnoreCase("offer")),
                () -> assertTrue(offers.getMetadata().equalsIgnoreCase("Meta data"))
        );
    }
}