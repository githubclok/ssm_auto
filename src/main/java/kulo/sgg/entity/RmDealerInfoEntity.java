package kulo.sgg.entity;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class RmDealerInfoEntity {
    /**
     * 主键
     */
    private Integer dealerId;

    /**
     * 经销商名称
     */
    private String dealerName;

    /**
     * 黑名单标志。1表示该经销商为黑名单经销商；0表示该经销商不为黑名单经销商。
     */
    private Integer blackFlag;

    /**
     * 备注
     */
    private String note;

    /**
     * 是否启用黑名单功能。1，启用；0，不启用。
     */
    private Integer status;

    public Integer getDealerId() {
        return dealerId;
    }

    public void setDealerId(Integer dealerId) {
        this.dealerId = dealerId;
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName == null ? null : dealerName.trim();
    }

    public Integer getBlackFlag() {
        return blackFlag;
    }

    public void setBlackFlag(Integer blackFlag) {
        this.blackFlag = blackFlag;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}