package org.example.builder;

public class VisitCardWebsiteBuilder extends WebsiteBuilder{

    @Override
    void buidName() {
        website.setName("Visit card");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.WORDPRESS);
    }

    @Override
    void buildPrice() {
        website.setPrice(500);
    }
}
