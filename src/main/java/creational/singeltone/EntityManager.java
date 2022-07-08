package creational.singeltone;

import java.util.Objects;

public final class EntityManager {
    private static EntityManager entityManager;

    private EntityManager() {
    }

    public static EntityManager getInstance(){
        if (Objects.isNull(entityManager)){
            entityManager = new EntityManager();
        }
        return entityManager;
    }
}
