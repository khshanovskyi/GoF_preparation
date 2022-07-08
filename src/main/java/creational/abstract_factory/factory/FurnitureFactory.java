package creational.abstract_factory.factory;

import creational.abstract_factory.entity.Furniture;

public interface FurnitureFactory {

    Furniture createSofa();
    Furniture createChair();
    Furniture createTable();
}
