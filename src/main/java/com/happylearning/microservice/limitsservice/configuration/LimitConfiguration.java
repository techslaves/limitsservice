package com.happylearning.microservice.limitsservice.configuration;

    public class LimitConfiguration {

        private int maximumLimit;
        private int minimumLimit;

        public int getMaximumLimit() {
            return maximumLimit;
        }

        public void setMaximumLimit(int maximumLimit) {
            this.maximumLimit = maximumLimit;
        }

        public int getMinimumLimit() {
            return minimumLimit;
        }

        public void setMinimumLimit(int minimumLimit) {
            this.minimumLimit = minimumLimit;
        }

        public LimitConfiguration() {

        }

        public LimitConfiguration(int maximumLimit, int minimumLimit) {
            maximumLimit = this.maximumLimit;
            minimumLimit = this.minimumLimit;
        }
    }
