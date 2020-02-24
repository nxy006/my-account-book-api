package com.nxy006.project.myaccountbook.exception;

import lombok.Data;

/**
 * SystemException Comment
 *
 * @author nxy006
 * @since 1.0
 */
@Data
public class SystemRuntimeException extends RuntimeException{

    private Integer errorCode;
    private String message;

    public static SystemRuntimeException EntityOptimisticLockingFailure = new SystemRuntimeException(101, "操作的对象已经变化，请刷新后重试");

    public SystemRuntimeException(String message) {
        super(message);
    }

    public SystemRuntimeException(Integer errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }
}
