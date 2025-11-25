package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StackTest {


    @Test
    public void testStack() {

        Stack <Dish> stack = new Stack(4);

        Dish oneDish = new Dish("A dish with one fish pattern on it");
        Dish twoDish = new Dish("A dish with two fish patterns on it");
        Dish redDish = new Dish("A dish with a red fish pattern on it");
        Dish blueDish = new Dish("A dish with a blue fish pattern on it");

        stack.push(oneDish);
        stack.push(twoDish);
        stack.push(redDish);
        stack.push(blueDish);

        assertEquals(stack.size(),4);

        assertEquals(stack.peek(),blueDish);

        stack.pop();

        assertEquals(stack.peek(),redDish);

        assertEquals(stack.size(),3);

        assertEquals(stack.peek(),redDish);

        assertEquals(stack.isEmpty(),false);

    }

}