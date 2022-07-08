package creational.factory_method;

class CarDelivery  extends Delivery {

    @Override
    public Transport createTransport() {
        return new Car();
    }
}
