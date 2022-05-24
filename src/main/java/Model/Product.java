package Model;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Product {

    private  String productName;

    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                '}';
    }

    @PostConstruct
    public void init(){
        this.productName = "西瓜";
    }
}

