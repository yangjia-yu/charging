package com.bupt.godxian.charging.util;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "charge_wait_area")
public class ChargeWaitArea {
    @Id
    @Column(name = "request_id")
    private String requestId;

    @Column
    private String type;

    @Column(name = "waiting_area_size")
    private Integer waitingAreaSize;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getWaitingAreaSize() {
        return waitingAreaSize;
    }

    public void setWaitingAreaSize(Integer waitingAreaSize) {
        this.waitingAreaSize = waitingAreaSize;
    }
}