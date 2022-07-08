package creational.prototype;

import creational.builder.multi_builder.Keyboard;
import creational.builder.multi_builder.Screen;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@EqualsAndHashCode(callSuper = false)
public class Laptop extends Computer implements Cloneable{
    private final Screen screen;
    private final Keyboard keyboard;
    private final String dynamics;
    private final String camera;
    private final String microphone;

    public Laptop(LaptopBuilder builder) {
        this.setProcessor(builder.processor);
        this.setProcessorCores(builder.processorCores);
        this.setRAM(builder.RAM);
        this.setMemory(builder.memory);
        this.setChargeBlock(builder.chargeBlock);
        this.setCuller(builder.culler);
        this.setInnerVideoCard(builder.innerVideoCard);
        this.screen = builder.screen;
        this.keyboard = builder.keyboard;
        this.dynamics = builder.dynamics;
        this.camera = builder.camera;
        this.microphone = builder.microphone;
    }

    private Laptop(Laptop laptop) {
        this.setProcessor(laptop.getProcessor());
        this.setProcessorCores(laptop.getProcessorCores());
        this.setRAM(laptop.getRAM());
        this.setMemory(laptop.getMemory());
        this.setChargeBlock(laptop.getChargeBlock());
        this.setCuller(laptop.getCuller());
        this.setInnerVideoCard(laptop.getInnerVideoCard());
        this.screen = laptop.screen;
        this.keyboard = laptop.keyboard;
        this.dynamics = laptop.dynamics;
        this.camera = laptop.camera;
        this.microphone = laptop.microphone;
    }

    @Override
    public Computer clone() {
        return new Laptop(this);
    }

    public static class LaptopBuilder {
        private String processor;
        private int processorCores;
        private String RAM;
        private String memory;
        private String chargeBlock;
        private String culler;
        private String innerVideoCard;
        private Screen screen;
        private Keyboard keyboard;
        private String dynamics;
        private String camera;
        private String microphone;

        public LaptopBuilder processor(String processor) {
            this.processor = processor;
            return this;
        }

        public LaptopBuilder processorCores(int processorCores) {
            this.processorCores = processorCores;
            return this;
        }

        public LaptopBuilder RAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public LaptopBuilder memory(String memory) {
            this.memory = memory;
            return this;
        }

        public LaptopBuilder chargeBlock(String chargeBlock) {
            this.chargeBlock = chargeBlock;
            return this;
        }

        public LaptopBuilder culler(String culler) {
            this.culler = culler;
            return this;
        }

        public LaptopBuilder innerVideoCard(String innerVideoCard) {
            this.innerVideoCard = innerVideoCard;
            return this;
        }

        public LaptopBuilder screen(Screen screen) {
            this.screen = screen;
            return this;
        }

        public LaptopBuilder keyboard(Keyboard keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public LaptopBuilder dynamics(String dynamics) {
            this.dynamics = dynamics;
            return this;
        }

        public LaptopBuilder camera(String camera) {
            this.camera = camera;
            return this;
        }

        public LaptopBuilder microphone(String microphone) {
            this.microphone = microphone;
            return this;
        }

        public Laptop build() {
            return new Laptop(this);
        }
    }
}
