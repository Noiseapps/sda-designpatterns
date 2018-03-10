package pl.sdacademy.patterns.builder;

public class Car {

    private double engineCapacity;
    private int doorsCount;
    private String chassisType;
    private boolean hasAbs;
    private boolean hasESP;
    private boolean hasAirConditioning;
    private boolean hasNavi;
    private int airbagCount;

    private Car(double engineCapacity, int doorsCount, String chassisType, boolean hasAbs, boolean hasESP, boolean hasAirConditioning, boolean hasNavi, int airbagCount) {
        this.engineCapacity = engineCapacity;
        this.doorsCount = doorsCount;
        this.chassisType = chassisType;
        this.hasAbs = hasAbs;
        this.hasESP = hasESP;
        this.hasAirConditioning = hasAirConditioning;
        this.hasNavi = hasNavi;
        this.airbagCount = airbagCount;
    }

    public static class Builder {
        private double engineCapacity;
        private int doorsCount;
        private String chassisType;
        private boolean hasAbs;
        private boolean hasESP;
        private boolean hasAirConditioning;
        private boolean hasNavi;
        private int airbagCount;

        public Builder(double engineCapacity, int doorsCount, String chassisType) {
            this.engineCapacity = engineCapacity;
            this.doorsCount = doorsCount;
            this.chassisType = chassisType;
        }

        public Car build() {
            return new Car(engineCapacity, doorsCount, chassisType, hasAbs, hasESP, hasAirConditioning, hasNavi, airbagCount);
        }

        public Builder setEngineCapacity(double engineCapacity) {
            this.engineCapacity = engineCapacity;
            return this;
        }

        public Builder setDoorsCount(int doorsCount) {
            this.doorsCount = doorsCount;
            return this;
        }

        public Builder setChassisType(String chassisType) {
            this.chassisType = chassisType;
            return this;
        }

        public Builder setHasAbs(boolean hasAbs) {
            this.hasAbs = hasAbs;
            return this;
        }

        public Builder setHasESP(boolean hasESP) {
            this.hasESP = hasESP;
            return this;
        }

        public Builder setHasAirConditioning(boolean hasAirConditioning) {
            this.hasAirConditioning = hasAirConditioning;
            return this;
        }

        public Builder setHasNavi(boolean hasNavi) {
            this.hasNavi = hasNavi;
            return this;
        }

        public Builder setAirbagCount(int airbagCount) {
            this.airbagCount = airbagCount;
            return this;
        }
    }
}
