package xyz.chen;

/**
 * Description:
 * Author: chen
 * 2019/12/3
 */
public class BaseRequest {
    private String uid;

    private Integer serialNo;

    public static void foo() {
        // 在此处填写代码
        String str = "在staging2分支添加了代码233";
        String str2 = "在dev分支添加了代码";
    }

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
