package creational.abstract_factory.factory;

import creational.abstract_factory.entity.Chair;
import creational.abstract_factory.entity.Furniture;
import creational.abstract_factory.entity.Sofa;
import creational.abstract_factory.entity.Table;

public class ClassicFurnitureFactory implements FurnitureFactory {

    @Override
    public Furniture createSofa() {
        System.out.println("New Classic Sofa creation...");
        return new Sofa();
    }

    @Override
    public Furniture createChair() {
        System.out.println("New Classic Chair creation...");
        return new Chair();
    }

    @Override
    public Furniture createTable() {
        System.out.println("New Classic Table creation...");
        return new Table();
    }
}
