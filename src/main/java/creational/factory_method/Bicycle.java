package creational.factory_method;

class Bicycle implements Transport{
    @Override
    public String deliver() {
        return "Delivered by Bicycle";
    }
}
