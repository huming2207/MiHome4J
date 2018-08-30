package com.jacksonhu.mihome4j.products;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jacksonhu.mihome4j.products.enums.MotionStatus;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class HumanMotionSensor
{
    @JsonProperty("status")
    private MotionStatus status;

    @JsonProperty("voltage")
    private int voltage;


    public MotionStatus getStatus()
    {
        return status;
    }

    public void setStatus(MotionStatus status)
    {
        this.status = status;
    }

    public int getVoltage()
    {
        return voltage;
    }

    public void setVoltage(int voltage)
    {
        this.voltage = voltage;
    }
}
