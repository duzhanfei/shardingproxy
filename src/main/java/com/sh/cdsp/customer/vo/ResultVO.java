package com.sh.cdsp.customer.vo;

import java.io.Serializable;

public class ResultVO<T> implements Serializable {
    private static final long serialVersionUID = 3555395666344431133L;
    private T data;
    private String returnCode;
    private String returnMsg;
    private PageVO page;

    public ResultVO(T data, PageVO page, Long countNum) {
        this.data = data;
        this.returnCode = "0";
        this.returnMsg = "success";
        if (page == null) {
            page = new PageVO(10, 1);
        }

        page.setCountNum(countNum);
        this.page = page;
    }

    public ResultVO(T data) {
        this.data = data;
        this.returnCode = "0";
        this.returnMsg = "success";
    }

    public ResultVO() {
        this.returnCode = "0";
        this.returnMsg = "success";
    }

    public ResultVO(String returnMsg, String errorCode) {
        this.returnCode = errorCode;
        this.returnMsg = returnMsg;
    }

    public T getData() {
        return this.data;
    }

    public String getReturnCode() {
        return this.returnCode;
    }

    public String getReturnMsg() {
        return this.returnMsg;
    }

    public PageVO getPage() {
        return this.page;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }

    public void setPage(PageVO page) {
        this.page = page;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof ResultVO)) {
            return false;
        } else {
            ResultVO<?> other = (ResultVO)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label59: {
                    Object this$data = this.getData();
                    Object other$data = other.getData();
                    if (this$data == null) {
                        if (other$data == null) {
                            break label59;
                        }
                    } else if (this$data.equals(other$data)) {
                        break label59;
                    }

                    return false;
                }

                Object this$returnCode = this.getReturnCode();
                Object other$returnCode = other.getReturnCode();
                if (this$returnCode == null) {
                    if (other$returnCode != null) {
                        return false;
                    }
                } else if (!this$returnCode.equals(other$returnCode)) {
                    return false;
                }

                Object this$returnMsg = this.getReturnMsg();
                Object other$returnMsg = other.getReturnMsg();
                if (this$returnMsg == null) {
                    if (other$returnMsg != null) {
                        return false;
                    }
                } else if (!this$returnMsg.equals(other$returnMsg)) {
                    return false;
                }

                Object this$page = this.getPage();
                Object other$page = other.getPage();
                if (this$page == null) {
                    if (other$page != null) {
                        return false;
                    }
                } else if (!this$page.equals(other$page)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof ResultVO;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $data = this.getData();
        result = result * 59 + ($data == null ? 43 : $data.hashCode());
        Object $returnCode = this.getReturnCode();
        result = result * 59 + ($returnCode == null ? 43 : $returnCode.hashCode());
        Object $returnMsg = this.getReturnMsg();
        result = result * 59 + ($returnMsg == null ? 43 : $returnMsg.hashCode());
        Object $page = this.getPage();
        result = result * 59 + ($page == null ? 43 : $page.hashCode());
        return result;
    }

    public String toString() {
        return "ResultVO(data=" + this.getData() + ", returnCode=" + this.getReturnCode() + ", returnMsg=" + this.getReturnMsg() + ", page=" + this.getPage() + ")";
    }
}

