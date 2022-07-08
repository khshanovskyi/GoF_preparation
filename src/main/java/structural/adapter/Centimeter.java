package structural.adapter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class Centimeter extends Measure {

    public Centimeter(double unit) {
        super(unit);
    }
}
