package gu.geekbrains.spring_hw_lesson3.service;

import gu.geekbrains.spring_hw_lesson3.model.Product;
import gu.geekbrains.spring_hw_lesson3.repositopry.RepositoryInt;
import org.springframework.stereotype.Component;

@Component
public class Service {

    private RepositoryInt repositoryInt;

    public Product getProduct(Long id){
        return repositoryInt.findById(id);
    }

}
