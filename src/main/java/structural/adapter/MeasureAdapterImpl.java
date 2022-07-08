package structural.adapter;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class MeasureAdapterImpl implements MeasureAdapter {

    Map<Class<? extends Measure>, Map<Class<? extends Measure>, Function<Double, Double>>> map = new HashMap<>();

    public MeasureAdapterImpl() {
        map.put(Millimeter.class, getMmMap());
        map.put(Centimeter.class, getCmMap());
        map.put(Inch.class, getInchMap());
        map.put(Foot.class, getFootMap());
    }

    @Override
    public Measure transform(Measure from, Class<? extends Measure> to) {
        return createRequiredMeasure(to, map.get(from.getClass()).get(to).apply(from.getUnit()));
    }

    private Map<Class<? extends Measure>, Function<Double, Double>> getMmMap() {
        Map<Class<? extends Measure>, Function<Double, Double>> mmTo = new HashMap<>();
        mmTo.put(Centimeter.class, val -> val / 10);
        mmTo.put(Inch.class, val -> val / 25.4);
        mmTo.put(Foot.class, val -> val / 304.8);
        return mmTo;
    }

    private Map<Class<? extends Measure>, Function<Double, Double>> getCmMap() {
        Map<Class<? extends Measure>, Function<Double, Double>> cmTo = new HashMap<>();
        cmTo.put(Millimeter.class, val -> val * 10);
        cmTo.put(Inch.class, val -> val / 2.54);
        cmTo.put(Foot.class, val -> val / 30.48);
        return cmTo;
    }

    private Map<Class<? extends Measure>, Function<Double, Double>> getInchMap() {
        Map<Class<? extends Measure>, Function<Double, Double>> inchTo = new HashMap<>();
        inchTo.put(Millimeter.class, val -> val * 25.4);
        inchTo.put(Centimeter.class, val -> val * 2.54);
        inchTo.put(Foot.class, val -> val / 12);
        return inchTo;
    }

    private Map<Class<? extends Measure>, Function<Double, Double>> getFootMap() {
        Map<Class<? extends Measure>, Function<Double, Double>> footTo = new HashMap<>();
        footTo.put(Millimeter.class, val -> val * 304.8);
        footTo.put(Centimeter.class, val -> val * 30.48);
        footTo.put(Inch.class, val -> val * 12);
        return footTo;
    }

    private Measure createRequiredMeasure(Class<? extends Measure> clazz, double value) {
        if (clazz.isAssignableFrom(Millimeter.class)) {
            return new Millimeter(value);
        } else if (clazz.isAssignableFrom(Centimeter.class)) {
            return new Centimeter(value);
        } else if (clazz.isAssignableFrom(Inch.class)) {
            return new Inch(value);
        } else if (clazz.isAssignableFrom(Foot.class)) {
            return new Foot(value);
        }
        return null;
    }
}
