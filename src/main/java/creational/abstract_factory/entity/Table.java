package creational.abstract_factory.entity;

import lombok.ToString;

@ToString
public class Table implements Furniture {
    @Override
    public void use() {
        System.out.println("You can eat from this");
    }
}
