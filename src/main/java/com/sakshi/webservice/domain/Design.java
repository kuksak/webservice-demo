package com.sakshi.webservice.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Sakshi Kukreti on 25-04-2017.
 */
@Entity
public class Design {
    @Id
    @GeneratedValue
    private Long designId;
    private String designNumber;
    private String author;


    public Design() {
    }

    public Design(Long designId, String designNumber, String author) {
        this.designId = designId;
        this.designNumber = designNumber;
        this.author = author;
    }

    public Long getDesignId() {
        return designId;
    }

    public void setDesignId(Long designId) {
        this.designId = designId;
    }

    public String getDesignNumber() {
        return designNumber;
    }

    public void setDesignNumber(String designNumber) {
        this.designNumber = designNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
