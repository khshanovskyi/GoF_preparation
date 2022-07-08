package creational.abstract_factory;

import creational.abstract_factory.entity.Furniture;
import creational.abstract_factory.entity.FurnitureStyle;
import creational.abstract_factory.entity.FurnitureType;
import creational.abstract_factory.factory.ClassicFurnitureFactory;
import creational.abstract_factory.factory.FurnitureFactory;
import creational.abstract_factory.factory.ModernFurnitureFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class OrderExecutor {

    private static FurnitureFactory classic;
    private static FurnitureFactory modern;

    public static List<Furniture> provideOrder(Map<FurnitureStyle, Map<FurnitureType, Integer>> order){
        Objects.requireNonNull(order, "[order] cannot be null");
        List<Furniture> furniture = new ArrayList<>();

        for (Map.Entry<FurnitureStyle, Map<FurnitureType, Integer>> orderEntry: order.entrySet()) {
            if (orderEntry.getKey().equals(FurnitureStyle.CLASSIC)){
                if (Objects.isNull(classic)){
                    classic = new ClassicFurnitureFactory();
                }
                furniture.addAll(new FurnitureProvider(classic).provideFurnitureAccordingToOrder(orderEntry.getValue()));
            }else if (orderEntry.getKey().equals(FurnitureStyle.MODERN)){
                if (Objects.isNull(modern)){
                    modern = new ModernFurnitureFactory();
                }
                furniture.addAll(new FurnitureProvider(modern).provideFurnitureAccordingToOrder(orderEntry.getValue()));
            }
        }

        return furniture;
    }
}
