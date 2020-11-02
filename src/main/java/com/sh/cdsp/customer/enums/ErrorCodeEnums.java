package com.sh.cdsp.customer.enums;

public enum ErrorCodeEnums {
    ET000("ET0000", "缺少token信息"),
    EI000("EI0000", "服务器内部错误"),
    E00001("E00001", "查询失败"),
    E00002("E00002", "修改失败"),
    E00003("E00003", "删除失败"),
    E00004("E00004", "保存失败"),
    E00005("E00005", "登录失败");

    private String code;
    private String label;

    private ErrorCodeEnums(String code, String label) {
        this.code = code;
        this.label = label;
    }

    public static ErrorCodeEnums getByCode(String code) {
        ErrorCodeEnums[] var4;
        int var3 = (var4 = values()).length;

        for(int var2 = 0; var2 < var3; ++var2) {
            ErrorCodeEnums ErrorCodeEnums = var4[var2];
            if (ErrorCodeEnums.code.equals(code)) {
                return ErrorCodeEnums;
            }
        }

        return null;
    }

    public static ErrorCodeEnums getByLabel(String label) {
        ErrorCodeEnums[] var4;
        int var3 = (var4 = values()).length;

        for(int var2 = 0; var2 < var3; ++var2) {
            ErrorCodeEnums ErrorCodeEnums = var4[var2];
            if (ErrorCodeEnums.label.equals(label)) {
                return ErrorCodeEnums;
            }
        }

        return null;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
