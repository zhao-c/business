package xyz.chen;

/**
 * Description:
 * Author: chen
 * 2019/12/3
 */
public class BaseRequest {
    private String uid;

    private Integer serialNo;

    public Integer getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(Integer serialNo) {
        this.serialNo = serialNo;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
