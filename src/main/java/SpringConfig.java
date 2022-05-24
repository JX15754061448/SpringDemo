import Model.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "Model")
public class SpringConfig {

    @Bean
    public Product product() {
        Product product = new Product();
        product.setProductName("草莓味的番茄");
        System.out.println("==>product: " + product);
        return product;
    }
}
