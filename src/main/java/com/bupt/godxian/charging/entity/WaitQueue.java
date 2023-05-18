package com.bupt.godxian.charging.util;

import com.bupt.godxian.charging.util.dto.QueueType;

import javax.persistence.*;

@Entity
@Table(name = "wait_queue")
public class WaitQueue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    private QueueType type;

    @Column
    private Integer state;

    @Column(name = "charge_id", length = 20)
    private String chargeId;

    // Getters and Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public QueueType getType() {
        return type;
    }

    public void setType(QueueType type) {
        this.type = type;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getChargeId() {
        return chargeId;
    }

    public void setChargeId(String chargeId) {
        this.chargeId = chargeId;
    }
}