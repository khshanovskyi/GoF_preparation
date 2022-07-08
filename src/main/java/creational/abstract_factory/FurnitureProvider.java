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

public class FurnitureProvider {

    private FurnitureFactory factory;

    public FurnitureProvider(FurnitureFactory factory) {
        this.factory = factory;
    }

    List<Furniture> provideFurnitureAccordingToOrder(Map<FurnitureType, Integer> order) {
        Objects.requireNonNull(order, "[order] cannot be null");
        List<Furniture> furniture = new ArrayList<>();

        for (Map.Entry<FurnitureType, Integer> orderEntry : order.entrySet()) {
            if (Objects.nonNull(orderEntry.getKey()) && Objects.nonNull(orderEntry.getValue())){
                furniture.addAll(provideFurniture(orderEntry.getKey(), orderEntry.getValue()));
            }
        }

        return furniture;
    }

    private List<Furniture> provideFurniture(FurnitureType type, Integer amount) {
        List<Furniture> furniture = new ArrayList<>();

        for (int i = 0; i < amount; i++) {
            switch (type) {
                case SOFA:
                    furniture.add(factory.createSofa());
                    break;
                case CHAIR:
                    furniture.add(factory.createChair());
                    break;
                case TABLE:
                    furniture.add(factory.createTable());
                    break;
            }
        }
        return furniture;
    }

}
