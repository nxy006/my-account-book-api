package com.nxy006.project.myaccountbook.bean.vo.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.nxy006.project.myaccountbook.exception.SystemRuntimeException;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * BasicResponse Comment
 *
 * @author nxy006
 * @since 1.0
 */
@Data
@AllArgsConstructor
@JsonPropertyOrder({"error_code", "message", "data"})
public class BasicResponse {
    @JsonProperty(value = "error_code")
    private Integer errorCode;
    private String message;
    private Object data;

    public static BasicResponse SUCCESS_RSP = new BasicResponse(0, "Success", null);
    public static BasicResponse ERROR_RSP = new BasicResponse(500, "系统错误，请联系管理员", null);

    public BasicResponse(SystemRuntimeException exception) {
        this.errorCode = exception.getErrorCode();
        this.message = exception.getMessage();
    }
}
