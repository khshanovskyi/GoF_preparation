package creational.builder.multi_builder;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Screen {
    private String type;
    private double diagonal;

    public Screen(ScreenBuilder builder) {
        this.type = builder.type;
        this.diagonal = builder.diagonal;
    }

    public static class ScreenBuilder {
        private String type;
        private double diagonal;

        public ScreenBuilder type(String type) {
            this.type = type;
            return this;
        }

        public ScreenBuilder diagonal(double diagonal) {
            this.diagonal = diagonal;
            return this;
        }

        public Screen build() {
            return new Screen(this);
        }
    }
}
