package structural.adapter;

public interface MeasureAdapter {
    Measure transform(Measure from, Class<? extends Measure> to);
}
