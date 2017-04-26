package com.sakshi.webservice.controller;

import com.sakshi.webservice.config.DesignConfiguration;
import com.sakshi.webservice.domain.Design;
import com.sakshi.webservice.repository.DesignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Sakshi Kukreti on 25-04-2017.
 */
@RestController
@RequestMapping(value = "test")
public class DesignController {

    @Autowired
    private DesignRepository designRepository;

    @Autowired
    private DesignConfiguration designConfiguration;


    @RequestMapping(value = "/designNum/{designNum}", method = RequestMethod.GET, produces = "application/json")
    public List<Design> getDesignByDesignNum(@PathVariable("designNum") String designNum) {
        List<Design> optionalDesign = designRepository.findByDesignNumber(designNum);
        return optionalDesign;
    }

    @RequestMapping(value = "/author/{author}", method = RequestMethod.GET, produces = "application/json")
    public List<Design> getDesignByAuthor(@PathVariable("author") String author) {
        List<Design> optionalDesign = designRepository.findByAuthor(author);
        return optionalDesign;

    }

    @RequestMapping(value = "/testAuthor", method = RequestMethod.GET, produces = "application/json")
    public String configTest() {
        return designConfiguration.getAuthor();
    }
}
