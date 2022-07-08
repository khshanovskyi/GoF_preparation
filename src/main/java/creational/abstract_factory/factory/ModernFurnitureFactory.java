package creational.abstract_factory.factory;

import creational.abstract_factory.entity.Chair;
import creational.abstract_factory.entity.Furniture;
import creational.abstract_factory.entity.Sofa;
import creational.abstract_factory.entity.Table;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Furniture createSofa() {
        System.out.println("New Modern Sofa creation...");
        return new Sofa();
    }

    @Override
    public Furniture createChair() {
        System.out.println("New Modern Chair creation...");
        return new Chair();
    }

    @Override
    public Furniture createTable() {
        System.out.println("New Modern Table creation...");
        return new Table();
    }
}
