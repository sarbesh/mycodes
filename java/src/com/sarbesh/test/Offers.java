package com.sarbesh.test;

public class Offers {
    private int offerPriority;
    private int offerCategoryPriority;
    private String offer;
    private String metadata;

    public int getOfferPriority() {
        return offerPriority;
    }

    public void setOfferPriority(int offerPriority) {
        this.offerPriority = offerPriority;
    }

    public int getOfferCategoryPriority() {
        return offerCategoryPriority;
    }

    public void setOfferCategoryPriority(int offerCategoryPriority) {
        this.offerCategoryPriority = offerCategoryPriority;
    }

    public String getOffer() {
        return offer;
    }

    public void setOffer(String offer) {
        this.offer = offer;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    @Override
    public String toString() {
        return "com.sarbesh.test.Offers{" +
                "offerPriority=" + offerPriority +
                ", offerCategoryPriority=" + offerCategoryPriority +
                ", offer='" + offer + '\'' +
                ", metadata='" + metadata + '\'' +
                '}';
    }

    public Offers(int offerPriority, int offerCategoryPriority, String offer) {
        this.offerPriority = offerPriority;
        this.offerCategoryPriority = offerCategoryPriority;
        this.offer = offer;
    }

    public Offers() {
    }
}
