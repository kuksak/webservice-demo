package com.sakshi.webservice.repository;

import com.sakshi.webservice.domain.Design;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * Created by Sakshi Kukreti on 25-04-2017.
 */
public interface DesignRepository extends JpaRepository<Design,Long>{

    List<Design> findByDesignNumber(String designNumber);
    List<Design> findByAuthor(String author);



}
