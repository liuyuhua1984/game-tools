package com.lyh.tools.entity;

import com.alibaba.fastjson.JSON;
import com.lyh.tools.utils.ToolUtils;

import java.io.Serializable;
import java.util.List;

public class Result implements Serializable {
    private int code;

    private boolean isOk;

    private String message;

    private String result;

    public int getCode() {
        return this.code;
    }

    public <T> List<T> getList(Class paramClass) {

        return ToolUtils.isStringNull(result) ? JSON.parseArray(this.result, paramClass) : null;
    }

    public List getList(String paramString, Class paramClass) {
        return JSON.parseArray(getResultStr(paramString), paramClass);
    }

    public String getMessage() {
        return this.message;
    }

    public String getResult() {
        return this.result;
    }

    public String getResultStr(String paramString) {
        try {
            if (!ToolUtils.isStringNull(result))
                return JSON.parseObject(this.result).getString(paramString);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    public String getStringBykey(String paramString1, String paramString2) {
        try {
            if (!ToolUtils.isStringNull(paramString1))
                return JSON.parseObject(paramString1).getString(paramString2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    public boolean isOk() {
        boolean bool;
        if (this.code == 0) {
            bool = true;
        } else {
            bool = false;
        }
        this.isOk = bool;
        return this.isOk;
    }

    public void setCode(int paramInt) {
        this.code = paramInt;
    }

    public void setMessage(String paramString) {
        this.message = paramString;
    }

    public void setResult(String paramString) {
        this.result = paramString;
    }
}


/* Location:              C:\Users\牛\Desktop\isiyu_1.0.4-dex2jar.jar!\com\monter\monsterlibrary\net\Result.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */
