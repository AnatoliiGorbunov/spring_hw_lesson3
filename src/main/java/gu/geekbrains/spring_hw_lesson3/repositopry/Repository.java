package gu.geekbrains.spring_hw_lesson3.repositopry;

import gu.geekbrains.spring_hw_lesson3.model.Product;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class Repository implements RepositoryInt {

    private List<Product> product;

    @PostConstruct
    private void init(){
        product = new ArrayList<>(Arrays.asList(
                new Product(1l,"Milk",60),
                new Product(2l,"Bread",25),
                new Product(3l,"Oil",100),
                new Product(4l,"Orange",120),
                new Product(5l,"Tomato",200)

        ));
    }
    public List<Product> getAllProduct(){
        return Collections.unmodifiableList(product);
    }

    @Override
    public Product findById(Long id) {
        return product.stream()
                .filter(p->p.getId().equals(id))
                .findFirst()
                .orElseThrow(RuntimeException::new);
    }
}
