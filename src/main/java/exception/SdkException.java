package exception;

import constant.ErrorMessage;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.ErrorResponse;

@Data
public class SdkException extends RuntimeException {
    private final ErrorResponse.ErrorDTO error;
    private final int code;
    private final String msg;
    private final Http http;

    public SdkException(ErrorMessage errorMessage, ErrorResponse.ErrorDTO error, Http http) {
        super(errorMessage.getMessage());
        this.error = error;
        this.http = http;
        this.code = errorMessage.getCode();
        this.msg = errorMessage.getMessage();
    }

    public SdkException(int code, String msg, ErrorResponse.ErrorDTO error, Http http) {
        super(msg);
        this.error = error;
        this.code = code;
        this.msg = msg;
        this.http = http;
    }

    @NoArgsConstructor
    @Data
    public static class Http {
        private Integer code;
        private String message;

        public Http(Integer code, String message){
            this.code = code;
            this.message = message;
        }
    }

}
