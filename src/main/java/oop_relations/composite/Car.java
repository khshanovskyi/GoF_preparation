package oop_relations.composite;

import lombok.Getter;

@Getter
class Car {
    private final Engine engine;

    public Car(Engine engine) {
        this.engine = new Engine();
    }
}
