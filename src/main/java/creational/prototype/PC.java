package creational.prototype;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@EqualsAndHashCode(callSuper = false)
public class PC extends Computer implements Cloneable{
    private String discreteVideoCard;

    public PC(PCBuilder builder) {
        this.setProcessor(builder.processor);
        this.setProcessorCores(builder.processorCores);
        this.setRAM(builder.RAM);
        this.setMemory(builder.memory);
        this.setChargeBlock(builder.chargeBlock);
        this.setCuller(builder.culler);
        this.setInnerVideoCard(builder.innerVideoCard);
        this.discreteVideoCard = builder.discreteVideoCard;
    }

    private PC(PC pc) {
        this.setProcessor(pc.getProcessor());
        this.setProcessorCores(pc.getProcessorCores());
        this.setRAM(pc.getRAM());
        this.setMemory(pc.getMemory());
        this.setChargeBlock(pc.getChargeBlock());
        this.setCuller(pc.getCuller());
        this.setInnerVideoCard(pc.getInnerVideoCard());
        this.discreteVideoCard = pc.discreteVideoCard;
    }

    @Override
    public Computer clone() {
        return new PC(this);
    }

    public static class PCBuilder {
        private String processor;
        private int processorCores;
        private String RAM;
        private String memory;
        private String chargeBlock;
        private String culler;
        private String innerVideoCard;
        private String discreteVideoCard;

        public PCBuilder processor(String processor) {
            this.processor = processor;
            return this;
        }

        public PCBuilder processorCores(int processorCores) {
            this.processorCores = processorCores;
            return this;
        }

        public PCBuilder RAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public PCBuilder memory(String memory) {
            this.memory = memory;
            return this;
        }

        public PCBuilder chargeBlock(String chargeBlock) {
            this.chargeBlock = chargeBlock;
            return this;
        }

        public PCBuilder culler(String culler) {
            this.culler = culler;
            return this;
        }

        public PCBuilder innerVideoCard(String innerVideoCard) {
            this.innerVideoCard = innerVideoCard;
            return this;
        }

        public PCBuilder discreteVideoCard(String discreteVideoCard) {
            this.discreteVideoCard = discreteVideoCard;
            return this;
        }

        public PC build() {
            return new PC(this);
        }
    }
}
