package com.feiyu.codegenerator.exception;

/**
 * @Description
 * @Author feiyu831143
 * @Date 2021/12/24 16:40
 */
public class GeneratorException extends RuntimeException{

    private String msg;
    private int code = 500;

    public GeneratorException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public GeneratorException(String msg, Throwable e) {
        super(msg, e);
        this.msg = msg;
    }

    public GeneratorException(String msg, int code) {
        super(msg);
        this.msg = msg;
        this.code = code;
    }

    public GeneratorException(String msg, int code, Throwable e) {
        super(msg, e);
        this.msg = msg;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
