package com.pepebyte.coffeeMachine;

import com.pepebyte.coffeeMachine.machine.GenericMachine;
import com.pepebyte.coffeeMachine.machine.Machine;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import static com.pepebyte.coffeeMachine.Ingredient.*;

public class App {
    public static void main(String[] args) {
        Map<Ingredient, Integer> supplies = new LinkedHashMap<>();

        supplies.put(WATER, 400);
        supplies.put(MILK, 540);
        supplies.put(BEANS, 120);
        supplies.put(CUPS, 9);

        Machine machine = new GenericMachine(
                "coffee",
                new Scanner(System.in)::nextLine,
                System.out::println,
                supplies,
                new Product[]{Product.CAPPUCCINO, Product.LATTE, Product.ESPRESSO},
                550
        );
        machine.run();
    }
}
