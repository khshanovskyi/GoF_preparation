package creational.abstract_factory.entity;

import lombok.ToString;

@ToString
public class Chair implements Furniture{
    @Override
    public void use() {
        System.out.println("You can seat and relax");
    }
}
