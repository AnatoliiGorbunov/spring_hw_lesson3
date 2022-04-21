package gu.geekbrains.spring_hw_lesson3.model;


import gu.geekbrains.spring_hw_lesson3.repositopry.Repository;
import gu.geekbrains.spring_hw_lesson3.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Cart {

    private Service serviceProduct;
    private List<Product> product;

    @Autowired
    public void setServiceProduct(Service serviceProduct){
        this.serviceProduct = serviceProduct;
    }

    public List<Product> getProduct() {
        return product;
    }

    private void init(){
        product = new ArrayList<>();
    }

    public void addProduct(Long id){
        product.add(serviceProduct.getProduct(id));
    }

    public void removeProduct(Long id){
        product.removeIf(p ->p.getId().equals(id));
    }

}
