package com.dmx.evaluationplatform.config;

public class Constant {
    public static long MaxFileSize = 15 * 1000 * 1000 * 1000L;
    public enum STATUS {
        SUCCESS("Success", "Operation completed successfully", 200),
        FAILURE("Failure", "Operation failed", 500);

        private final String desc;
        private final String detail;
        private final int statusCode;

        STATUS(String desc, String detail, int statusCode) {
            this.desc = desc;
            this.detail = detail;
            this.statusCode = statusCode;
        }

        public String getDes() {
            return desc;
        }

        public String getDetail() {
            return detail;
        }

        public int getStatusCode() {
            return statusCode;
        }
    }

    public enum DATATYPE {
        INVALID_DATA_TYPE("非法文件类型","",0),
        CUSTOM("用户自定义评测流量","csv",1),
        NATIVE_THRIFT_IDL("原生thrift idl文件","thrift",2);

        private final String desc;
        private final String suffix;
        private final int dataType;

        DATATYPE(String desc, String suffix, int dataType) {
            this.desc = desc;
            this.suffix = suffix;
            this.dataType = dataType;
        }

        public String getDesc() {
            return desc;
        }

        public String getSuffix() {
            return suffix;
        }

        public int getDataType() {
            return dataType;
        }

        public static DATATYPE  findByValue(int value) {
            for (DATATYPE dataType : values()) {
                if (dataType.dataType == value) {
                    return dataType;
                }
            }
            return INVALID_DATA_TYPE;
        }
    }
}
