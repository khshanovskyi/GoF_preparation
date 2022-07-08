package creational.factory_method;

class TruckDelivery  extends Delivery {

    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
