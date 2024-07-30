package com.dmx.evaluationplatform.config;

public class Constant {
    public enum STATUS {
        SUCCESS("Success", "Operation completed successfully", 200),
        FAILURE("Failure", "Operation failed", 500);

        private final String displayName;
        private final String meaning;
        private final int statusCode;

        STATUS(String displayName, String meaning, int statusCode) {
            this.displayName = displayName;
            this.meaning = meaning;
            this.statusCode = statusCode;
        }

        public String getDisplayName() {
            return displayName;
        }

        public String getMeaning() {
            return meaning;
        }

        public int getStatusCode() {
            return statusCode;
        }
    }
}
