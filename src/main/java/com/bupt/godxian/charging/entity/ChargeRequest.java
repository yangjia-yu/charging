package com.bupt.godxian.charging.util;

import javax.persistence.*;

@Entity
@Table(name = "charge_request")
public class ChargeRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Integer state;

    @Column(name = "user_id", length = 20)
    private String userId;

    @Column(name = "charge_mode", length = 20)
    private String chargeMode;

    @Column(name = "require_amount")
    private Double requireAmount;

    @Column(name = "charge_time")
    private Double chargeTime;

    @Column(name = "start_time")
    private Long startTime;

    @Column(name = "battery_size")
    private Double batterySize;

    @Column(name = "charge_id", length = 20)
    private String chargeId;

    @Column(name = "charge_pile_id", length = 20)
    private String chargePileId;

    @Column(name = "request_submit_time")
    private Long requestSubmitTime;

    // Getters and Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
    }

    public Double getRequireAmount() {
        return requireAmount;
    }

    public void setRequireAmount(Double requireAmount) {
        this.requireAmount = requireAmount;
    }

    public Double getChargeTime() {
        return chargeTime;
    }

    public void setChargeTime(Double chargeTime) {
        this.chargeTime = chargeTime;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Double getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(Double batterySize) {
        this.batterySize = batterySize;
    }

    public String getChargeId() {
        return chargeId;
    }

    public void setChargeId(String chargeId) {
        this.chargeId = chargeId;
    }

    public String getChargePileId() {
        return chargePileId;
    }

    public void setChargePileId(String chargePileId) {
        this.chargePileId = chargePileId;
    }

    public Long getRequestSubmitTime() {
        return requestSubmitTime;
    }

    public void setRequestSubmitTime(Long requestSubmitTime) {
        this.requestSubmitTime = requestSubmitTime;
    }
}