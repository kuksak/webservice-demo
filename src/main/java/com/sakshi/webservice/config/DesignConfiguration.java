package com.sakshi.webservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Sakshi Kukreti on 26-04-2017.
 */
@Component
@ConfigurationProperties(prefix = "design")
public class DesignConfiguration {

    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
