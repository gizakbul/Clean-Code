package specification.impl;

import lombok.AllArgsConstructor;
import lombok.Getter;
import model.Color;
import model.Product;
import specification.Specification;

@Getter
@AllArgsConstructor
public class ColorSpecification implements Specification<Product> {
    private Color color;

    @Override
    public boolean isSatisfied(Product p) {
        return p.getColor() == color;
    }
}
