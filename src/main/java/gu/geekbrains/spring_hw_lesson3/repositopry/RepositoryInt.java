package gu.geekbrains.spring_hw_lesson3.repositopry;

import gu.geekbrains.spring_hw_lesson3.model.Product;
import org.springframework.stereotype.Component;


@Component
public interface RepositoryInt {
    Product findById(Long id);
}
