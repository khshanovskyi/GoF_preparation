package oop_relations.aggregation;

import lombok.Getter;

@Getter
class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }
}
