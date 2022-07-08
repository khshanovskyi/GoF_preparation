package creational.builder.multi_builder;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Phone{
    private Screen screen;
    private Protection protection;
    private Keyboard keyboard;

    public Phone(PhoneBuilder phoneBuilder) {
        this.screen = phoneBuilder.screen;
        this.protection = phoneBuilder.protection;
        this.keyboard = phoneBuilder.keyboard;
    }

    public static class PhoneBuilder {
        private Screen screen;
        private Protection protection;
        private Keyboard keyboard;

        public PhoneBuilder screen(Screen screen) {
            this.screen = screen;
            return this;
        }

        public PhoneBuilder protection(Protection protection) {
            this.protection = protection;
            return this;
        }

        public PhoneBuilder keyboard(Keyboard keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public Phone build() {
            return new Phone(this);
        }
    }
}
