import com.infoshare.bz.calculations.Calculate;
import com.infoshare.bz.calculations.CalculationsType;
import com.infoshare.bz.data.Product;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static com.infoshare.bz.calculations.CountryDiscounts.PL;
import static org.assertj.core.api.Assertions.assertThat;

public class AppBuisnessTest {

    @Test
    public void CalculateNormal() {
        List<Product> products = Arrays.asList(
                new Product()
                        .setName("p1")
                        .setCategory("c1")
                        .setPrice(BigDecimal.valueOf(200))
                        .setQuantity(5),
                new Product()
                        .setName("p2")
                        .setCategory("c1")
                        .setPrice(BigDecimal.valueOf(200))
                        .setQuantity(5)
        );


        assertThat(new Calculate(CalculationsType.BUSINESS)
                .setCountry(PL)
                .getOrderTotal(products).doubleValue()).isEqualTo(1710.0);

    }
}
