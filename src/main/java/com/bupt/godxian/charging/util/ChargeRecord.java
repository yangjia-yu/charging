package com.bupt.godxian.charging.util;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "charge_record")
public class ChargeRecord {
    @Id
    @Column(length = 20)
    private String id;

    @Column(name = "order_id", length = 20)
    private String orderId;

    @Column(name = "create_time", length = 20)
    private String createTime;

    @Column(name = "charged_amount")
    private Double chargedAmount;

    @Column(name = "charged_time")
    private Integer chargedTime;

    @Column(name = "begin_time", length = 20)
    private String beginTime;

    @Column(name = "end_time", length = 20)
    private String endTime;

    @Column(name = "charging_cost")
    private Double chargingCost;

    @Column(name = "service_cost")
    private Double serviceCost;

    @Column(name = "total_cost")
    private Double totalCost;

    @Column(name = "pile_id", length = 20)
    private String pileId;

    @Column(name = "user_id", length = 20)
    private String userId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Double getChargedAmount() {
        return chargedAmount;
    }

    public void setChargedAmount(Double chargedAmount) {
        this.chargedAmount = chargedAmount;
    }

    public Integer getChargedTime() {
        return chargedTime;
    }

    public void setChargedTime(Integer chargedTime) {
        this.chargedTime = chargedTime;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Double getChargingCost() {
        return chargingCost;
    }

    public void setChargingCost(Double chargingCost) {
        this.chargingCost = chargingCost;
    }

    public Double getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(Double serviceCost) {
        this.serviceCost = serviceCost;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public String getPileId() {
        return pileId;
    }

    public void setPileId(String pileId) {
        this.pileId = pileId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
