package creational.factory_method;

class BicycleDelivery extends Delivery {

    @Override
    public Transport createTransport() {
        return new Bicycle();
    }
}
