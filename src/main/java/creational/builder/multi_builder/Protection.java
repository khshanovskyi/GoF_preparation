package creational.builder.multi_builder;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Protection {
    private String waterproofType;
    private String dustProofType;

    public Protection(ProtectionBuilder builder) {
        this.waterproofType = builder.waterproofType;
        this.dustProofType = builder.dustProofType;
    }

    public static class ProtectionBuilder {
        private String waterproofType;
        private String dustProofType;

        public ProtectionBuilder waterproofType(String waterproofType) {
            this.waterproofType = waterproofType;
            return this;
        }

        public ProtectionBuilder dustProofType(String dustProofType) {
            this.dustProofType = dustProofType;
            return this;
        }

        public Protection build() {
            return new Protection(this);
        }
    }
}
