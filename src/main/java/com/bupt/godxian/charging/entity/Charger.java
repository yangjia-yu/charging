package com.bupt.godxian.charging.entity;

import com.bupt.godxian.charging.util.dto.ChargerStatus;

import javax.persistence.*;

@Entity
@Table(name = "charger")
public class Charger {
    @Id
    @Column(length = 20)
    private String id;

    @Enumerated(EnumType.STRING)
    @Column(name = "charger_status")
    private ChargerStatus chargerStatus;

    @Column(length = 20)
    private String type;

    @Column(name = "charging_queue_len")
    private Integer chargingQueueLen;

    @Column(name = "last_end_time")
    private Long lastEndTime;

    @Column(name = "cumulative_usage_times")
    private Integer cumulativeUsageTimes;

    @Column(name = "cumulative_charging_time")
    private Integer cumulativeChargingTime;

    @Column(name = "cumulative_charging_amount")
    private String cumulativeChargingAmount;

    @Column(name = "start_time")
    private Long startTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ChargerStatus getChargerStatus() {
        return chargerStatus;
    }

    public void setChargerStatus(ChargerStatus chargerStatus) {
        this.chargerStatus = chargerStatus;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getChargingQueueLen() {
        return chargingQueueLen;
    }

    public void setChargingQueueLen(Integer chargingQueueLen) {
        this.chargingQueueLen = chargingQueueLen;
    }

    public Long getLastEndTime() {
        return lastEndTime;
    }

    public void setLastEndTime(Long lastEndTime) {
        this.lastEndTime = lastEndTime;
    }

    public Integer getCumulativeUsageTimes() {
        return cumulativeUsageTimes;
    }

    public void setCumulativeUsageTimes(Integer cumulativeUsageTimes) {
        this.cumulativeUsageTimes = cumulativeUsageTimes;
    }

    public Integer getCumulativeChargingTime() {
        return cumulativeChargingTime;
    }

    public void setCumulativeChargingTime(Integer cumulativeChargingTime) {
        this.cumulativeChargingTime = cumulativeChargingTime;
    }

    public String getCumulativeChargingAmount() {
        return cumulativeChargingAmount;
    }

    public void setCumulativeChargingAmount(String cumulativeChargingAmount) {
        this.cumulativeChargingAmount = cumulativeChargingAmount;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }
}

