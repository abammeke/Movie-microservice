package com.webnet.moviecatalog.model;


import lombok.Data;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@ToString
public class CatalogItem {

    private String name;
    private String desc;
    private int rating;

    public CatalogItem() {
        log.info("New Catalog Instance Created: ");
    }

    public CatalogItem(String name, String desc, int rating) {
        this.name = name;
        this.desc = desc;
        this.rating = rating;
    }
}
