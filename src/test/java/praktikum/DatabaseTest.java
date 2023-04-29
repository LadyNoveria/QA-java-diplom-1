package praktikum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static praktikum.IngredientType.FILLING;

public class DatabaseTest {
    Database database = new Database();

    @Test
    public void availableBunsTest(){
        Bun bun = database.availableBuns().get(1);
        assertEquals(200, bun.getPrice(), 0);
        assertEquals("white bun", bun.getName());
    }

    @Test
    public void availableIngredientsTest(){
        Ingredient ingredient = database.availableIngredients().get(5);
        assertEquals(FILLING, ingredient.getType());
        assertEquals("sausage", ingredient.getName());
        assertEquals(300, ingredient.getPrice(), 0);
    }
}
