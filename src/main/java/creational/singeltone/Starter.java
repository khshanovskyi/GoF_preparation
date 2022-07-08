package creational.singeltone;

class Starter {
    public static void main(String[] args) {
        System.out.println(EntityManager.getInstance().hashCode() == EntityManager.getInstance().hashCode());
    }
}
