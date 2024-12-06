package org.factories;

import org.interfaces.IHotDrink;
import org.interfaces.IHotDrinkFactory;
import org.models.Tea;

public class TeaFactory implements IHotDrinkFactory {
    @Override
    public IHotDrink prepare(int amount)
    {
        System.out.println(
                "Put in tea bag, boil water, pour "
                        + amount + "ml, add lemon, enjoy!"
        );
        return new Tea();
    }
}
