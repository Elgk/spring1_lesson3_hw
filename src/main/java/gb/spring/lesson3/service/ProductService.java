package gb.spring.lesson3.service;

import gb.spring.lesson3.model.Product;
import gb.spring.lesson3.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product findById(Integer id){
        return  productRepository.findById(id).orElseThrow(() -> new NoSuchElementException());
    }

    public void save(Product product){
        productRepository.saveProduct(product);
    }
}
