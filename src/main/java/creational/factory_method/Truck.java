package creational.factory_method;

class Truck implements Transport{
    @Override
    public String deliver() {
        return "Delivered by Truck";
    }
}
