package com.jacksonhu.mihome4j.products;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jacksonhu.mihome4j.products.enums.WindowStatus;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class WindowSensor implements Serializable
{
    @JsonProperty("status")
    private WindowStatus status;

    @JsonProperty("voltage")
    private int voltage;

    public WindowStatus getStatus()
    {
        return status;
    }

    public void setStatus(WindowStatus status)
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
