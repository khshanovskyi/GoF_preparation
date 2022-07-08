import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
public class M {
    private int j;
    private int k;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        M m = (M) o;
        return j == m.j && k == m.k;
    }

    @Override
    public int hashCode() {
        return Objects.hash(j, k);
    }
}
