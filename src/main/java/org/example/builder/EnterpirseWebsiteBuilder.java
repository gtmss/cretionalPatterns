package org.example.builder;

public class EnterpirseWebsiteBuilder extends WebsiteBuilder{

    @Override
    void buidName() {
        website.setName("Enterprise web site");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.ALIFRESCO);
    }

    @Override
    void buildPrice() {
        website.setPrice(10000);
    }
}
