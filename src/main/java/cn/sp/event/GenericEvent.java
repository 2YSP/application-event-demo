package cn.sp.event;

/**
 * 可以自定义泛型类实现事件调度
 * Created by 2YSP on 2019/5/30.
 */
public class GenericEvent<T> {

    private  T data;
    private boolean success;

    public GenericEvent(T data,boolean success){
        this.data = data;
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
