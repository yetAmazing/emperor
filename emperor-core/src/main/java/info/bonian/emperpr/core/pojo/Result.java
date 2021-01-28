package info.bonian.emperpr.core.pojo;

import info.bonian.emperpr.core.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author here
 * @date 2021/1/28 1:11 下午
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result implements Serializable {

    private Integer code;

    private String msg;

    private Object data;


    private Result(Status status, Object data){
        this.code = status == Status.SUCCESS ? 0 : 1;
        this.msg = status.name();
        this.data = data;
    }

    private Result(String msg) {
        this.code = 1;
        this.msg = msg;
    }

    public static Result ok(){
        return new Result(Status.SUCCESS, null);
    }

    public static Result fail(){
        return new Result(Status.EXCEPTION, null);
    }

    public static Result ok(Object data){
        return new Result(Status.SUCCESS, data);
    }

    public static Result fail(String msg) {
        return new Result(msg);
    }

    public static Result status(Status status, Object data){
        return new Result(status, data);
    }

    public boolean isSuccess() {
        return getCode().equals(0);
    }

}
