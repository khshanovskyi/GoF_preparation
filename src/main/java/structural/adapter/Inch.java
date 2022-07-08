package structural.adapter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
public class Inch extends Measure {
    public Inch(double unit) {
        super(unit);
    }
}
