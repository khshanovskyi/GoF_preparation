package creational.factory_method;

class Car implements Transport{
    @Override
    public String deliver() {
        return "Delivered by Car";
    }
}
