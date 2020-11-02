package com.sh.cdsp.customer.vo;

public class PageVO {
    private int pageSize;
    private int pageNO;
    private long countNum;
    private long beforeOffset;

    public PageVO() {
        this.beforeOffset = (long)((this.pageNO - 1) * this.pageSize);
    }

    public PageVO(int pageSize, int pageNO) {
        if (pageSize != 0 && pageNO != 0) {
            this.pageNO = pageNO;
            this.pageSize = pageSize;
        } else {
            this.pageNO = 1;
            this.pageSize = 10;
        }

    }

    public int getPageSize() {
        return this.pageSize;
    }

    public int getPageNO() {
        return this.pageNO;
    }

    public long getCountNum() {
        return this.countNum;
    }

    public long getBeforeOffset() {
        return this.beforeOffset;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void setPageNO(int pageNO) {
        this.pageNO = pageNO;
    }

    public void setCountNum(long countNum) {
        this.countNum = countNum;
    }

    public void setBeforeOffset(long beforeOffset) {
        this.beforeOffset = beforeOffset;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof PageVO)) {
            return false;
        } else {
            PageVO other = (PageVO)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getPageSize() != other.getPageSize()) {
                return false;
            } else if (this.getPageNO() != other.getPageNO()) {
                return false;
            } else if (this.getCountNum() != other.getCountNum()) {
                return false;
            } else {
                return this.getBeforeOffset() == other.getBeforeOffset();
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof PageVO;
    }

    public int hashCode() {
        int result = 1;
        result = result * 59 + this.getPageSize();
        result = result * 59 + this.getPageNO();
        long $countNum = this.getCountNum();
        result = result * 59 + (int)($countNum ^ $countNum >>> 32);
        long $beforeOffset = this.getBeforeOffset();
        result = result * 59 + (int)($beforeOffset ^ $beforeOffset >>> 32);
        return result;
    }

    public String toString() {
        return "PageVO(pageSize=" + this.getPageSize() + ", pageNO=" + this.getPageNO() + ", countNum=" + this.getCountNum() + ", beforeOffset=" + this.getBeforeOffset() + ")";
    }
}
