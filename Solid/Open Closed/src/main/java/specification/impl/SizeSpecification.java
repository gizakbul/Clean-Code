package specification.impl;

import lombok.AllArgsConstructor;
import lombok.Getter;
import model.Product;
import model.Size;
import specification.Specification;

@Getter
@AllArgsConstructor
public class SizeSpecification implements Specification<Product> {
    private Size size;

    @Override
    public boolean isSatisfied(Product p) {
        return p.getSize() == size;
    }
}
