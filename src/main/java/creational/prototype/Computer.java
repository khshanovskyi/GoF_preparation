package creational.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public abstract class Computer implements Cloneable{
    private String processor;
    private int processorCores;
    private String RAM;
    private String memory;
    private String chargeBlock;
    private String culler;
    private String innerVideoCard;

    public abstract Computer clone();

}
