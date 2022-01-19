package coder.wetagustin.desafio3.products;

import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class ProductService {

    static ArrayList<Product> productsList = new ArrayList<Product>();

    public Object getAllProducts() {
        if( productsList.isEmpty() ){
            return new ErrorResponse("no hay productos cargados");
        }
        return productsList;
    }

    public Object createProduct( Product product ){
        product.generateId();
        if( productsList.add( product ) ){
            return product;
        }
        return new ErrorResponse("fallo la creacion de producto");
    }

    public Object getProduct( int id ) {

        for ( Product product : productsList ) {
            if( product.getId() == id ){
                return product;
            }
        }

        return new ErrorResponse("producto no encontrado");
    }
}
