package structural.adapter;

import java.lang.reflect.InvocationTargetException;

class Starter {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        MeasureAdapter adapter = new MeasureAdapterImpl();
        System.out.println(adapter.transform(new Millimeter(520.0), Centimeter.class).getUnit() + " mm -> cm");
        System.out.println(adapter.transform(new Millimeter(520.0), Inch.class).getUnit() + " mm -> inch");
        System.out.println(adapter.transform(new Millimeter(520.0), Foot.class).getUnit() + " mm -> foot");
        System.out.println();
        System.out.println(adapter.transform(new Centimeter(520.0), Millimeter.class).getUnit() + " cm -> mm");
        System.out.println(adapter.transform(new Centimeter(520.0), Inch.class).getUnit() + " cm -> inch");
        System.out.println(adapter.transform(new Centimeter(520.0), Foot.class).getUnit() + " cm -> foot");
        System.out.println();
        System.out.println(adapter.transform(new Inch(520.0), Millimeter.class).getUnit() + " inch -> mm");
        System.out.println(adapter.transform(new Inch(520.0), Centimeter.class).getUnit() + " inch -> cm");
        System.out.println(adapter.transform(new Inch(520.0), Foot.class).getUnit() + " inch -> foot");
        System.out.println();
        System.out.println(adapter.transform(new Foot(520.0), Millimeter.class).getUnit() + " foot -> mm");
        System.out.println(adapter.transform(new Foot(520.0), Centimeter.class).getUnit() + " foot -> cm");
        System.out.println(adapter.transform(new Foot(520.0), Inch.class).getUnit() + " foot -> inch");
    }
}
