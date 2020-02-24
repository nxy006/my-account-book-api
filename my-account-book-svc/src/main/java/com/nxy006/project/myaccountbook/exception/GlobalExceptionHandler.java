package com.nxy006.project.myaccountbook.exception;

import com.nxy006.project.myaccountbook.bean.vo.base.BasicResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * GlobalExceptionHandler Comment
 *
 * @author nxy006
 * @since 1.0
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(SystemRuntimeException.class)
    @ResponseBody
    public BasicResponse systemRuntimeExceptionHandler(HttpServletRequest request, SystemRuntimeException e) {
        e.printStackTrace();
        return new BasicResponse(e);
    }

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public BasicResponse errorExceptionHandler(HttpServletRequest request, RuntimeException e) {
        return BasicResponse.ERROR_RSP;
    }
}
