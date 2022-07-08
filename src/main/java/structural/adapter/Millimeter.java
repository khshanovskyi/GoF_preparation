package structural.adapter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class Millimeter extends Measure {
    public Millimeter(double unit) {
        super(unit);
    }
}
