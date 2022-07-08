package creational.prototype;

import creational.builder.multi_builder.Keyboard;
import creational.builder.multi_builder.Screen;

import java.util.ArrayList;
import java.util.List;

class Starter {
    public static void main(String[] args) {
        Computer pc22423111Model = new PC.PCBuilder()
                .processor("Intel i7-10439H")
                .processorCores(8)
                .chargeBlock("750W")
                .culler("double")
                .memory("1Tb N2me ssd")
                .RAM("32 gb")
                .discreteVideoCard("Nvidia GForce 3080")
                .innerVideoCard("Intel HD620")
                .build();

        Computer laptop738Model = new Laptop.LaptopBuilder()
                .processor("Intel i5-11439H")
                .processorCores(8)
                .chargeBlock("500W")
                .culler("one")
                .memory("500Gb N2me ssd")
                .RAM("16 gb")
                .innerVideoCard("Intel HD620")
                .camera("FullHD")
                .dynamics("stereo")
                .screen(new Screen.ScreenBuilder().diagonal(15).type("IPS").build())
                .keyboard(new Keyboard.KeyboardBuilder().buttons(56).build())
                .microphone("2 high quality")
                .build();

        List<Computer> pcs = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            pcs.add(pc22423111Model.clone());
        }

        List<Computer> laptops = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            laptops.add(laptop738Model.clone());
        }

        System.out.println(pcs.get(0).equals(pcs.get(5)));
        System.out.println(laptops.get(0).equals(laptops.get(5)));
    }
}
