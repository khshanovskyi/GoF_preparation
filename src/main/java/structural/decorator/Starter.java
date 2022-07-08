package structural.decorator;

class Starter {
    public static void main(String[] args) {
        DataSource dataSource = new FileDataSource("decorator_data.txt");
        DataSourceDecorator dataSourceDecorator = new EncryptionBase64Decorator(dataSource);
        dataSourceDecorator.writeData("Pavlo");
        System.out.println(dataSourceDecorator.readData());

        DataSourceDecorator ds = new CompressionDecorator(dataSource);
        ds.writeData("Pavlo");
        System.out.println(ds.readData());
    }
}
