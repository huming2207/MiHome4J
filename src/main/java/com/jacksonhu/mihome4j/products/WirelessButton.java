package com.jacksonhu.mihome4j.products;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jacksonhu.mihome4j.products.enums.ButtonStatus;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class WirelessButton
{
    @JsonProperty("status")
    private ButtonStatus status;

    @JsonProperty("voltage")
    private int voltage;

    public ButtonStatus getStatus()
    {
        return status;
    }

    public void setStatus(ButtonStatus status)
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
