package creational.factory_method;

abstract class Delivery {

    public abstract Transport createTransport();

    public  String deliver(){
        Transport transport = createTransport();
        return transport.deliver();
    }

}
