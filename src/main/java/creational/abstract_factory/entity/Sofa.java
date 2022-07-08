package creational.abstract_factory.entity;

import lombok.ToString;

@ToString
public class Sofa implements Furniture {
    @Override
    public void use() {
        System.out.println("You can lay and relax");
    }
}
