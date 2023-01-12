package model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class BaseResponse {
    private int code;
    private String message;

    public BaseResponse() {
        this.code = 0;
        this.message = "";
    }

    @NoArgsConstructor
    @Data
    public static class Http {
        private Integer code;
        private String message;
    }
}

