package icu.lyt0628.jzr_takeout.controller.dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.io.Serializable;

/**
 * @desc:
 * @author: Ping
 * @date: 2024/10/28 10:04
 */

@Data
@Builder
public class ResponseResult<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private T data ;
    private String statusCode ;
    private String operationCode ;
    private String message ;
    /**
     * statusCode表示网络传输状态；而业务操作状态则由OPERATION_CODE表示
     */
    private static final String OPER_SUCCESS = "success" ;
    private static final String OPER_FAILED = "failed" ;

    public static <T> ResponseResult<T> ok(T data, String message) {
        return ResponseResult.<T>builder()
                .data(data)
                .statusCode(String.valueOf(HttpStatus.OK.value()))
                .operationCode(OPER_SUCCESS)
                .message(message)
                .build();
    }

    public static <T> ResponseResult<T> ok(T data) {
        return ok(data, null) ;
    }

    public static <T> ResponseResult<T> ok() {
        return ok("ok") ;
    }

    public static <T> ResponseResult<T> ok(String msg) {
        return ok(null, msg) ;
    }

    public static <T> ResponseResult<T> notFound(){
        return error(HttpStatus.NOT_FOUND, "Resource is not avaliable");
    }

    public static <T> ResponseResult<T> error(HttpStatus status, String message) {
        return ResponseResult.<T>builder()
                .statusCode(String.valueOf(status.value()))
                .operationCode(OPER_FAILED)
                .message(message)
                .build();
    }


    public static <T> ResponseResult<T> error(HttpStatus status,String message, T data) {
        return ResponseResult.<T>builder()
                .statusCode(String.valueOf(status.value()))
                .operationCode(OPER_FAILED)
                .message(message)
                .data(data)
                .build();
    }
}
