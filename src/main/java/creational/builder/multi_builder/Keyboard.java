package creational.builder.multi_builder;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Keyboard {
    private int buttons;

    public Keyboard(KeyboardBuilder builder) {
        this.buttons = builder.buttons;
    }

    public static class KeyboardBuilder{
        private int buttons;

        public KeyboardBuilder buttons(int buttons){
            this.buttons = buttons;
            return this;
        }

        public Keyboard build(){
            return new Keyboard(this);
        }
    }
}
