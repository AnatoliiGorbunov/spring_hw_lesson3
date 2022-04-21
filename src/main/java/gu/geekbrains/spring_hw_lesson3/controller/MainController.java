package gu.geekbrains.spring_hw_lesson3.controller;

import gu.geekbrains.spring_hw_lesson3.model.Cart;
import gu.geekbrains.spring_hw_lesson3.model.Product;
import gu.geekbrains.spring_hw_lesson3.repositopry.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {


    @Autowired
    private Repository repository;

    @GetMapping("/product")
    public String getProduct(Model model){
        List<Product> productList = repository.getAllProduct();
        model.addAttribute("product", productList);
        return "product";
    }
}
