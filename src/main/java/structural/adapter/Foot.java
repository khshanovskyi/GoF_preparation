package structural.adapter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
public class Foot extends Measure {
    public Foot(double unit) {
        super(unit);
    }
}
