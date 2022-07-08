package creational.abstract_factory;

import creational.abstract_factory.entity.Furniture;
import creational.abstract_factory.entity.FurnitureStyle;
import creational.abstract_factory.entity.FurnitureType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Starter {

    public static void main(String[] args) {
        Map<FurnitureType, Integer> modern = new HashMap<>();
        modern.put(FurnitureType.CHAIR, 3);
        modern.put(FurnitureType.TABLE, 1);
        Map<FurnitureType, Integer> classic = new HashMap<>();
        classic.put(FurnitureType.CHAIR, 2);
        classic.put(FurnitureType.SOFA, 1);
        Map<FurnitureStyle, Map<FurnitureType, Integer>> order = new HashMap<>();
        order.put(FurnitureStyle.MODERN, modern);
        order.put(FurnitureStyle.CLASSIC, classic);

        List<Furniture> furniture = OrderExecutor.provideOrder(order);

        furniture.forEach(f -> System.out.println(f));
    }
}
