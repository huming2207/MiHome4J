package com.jacksonhu.mihome4j.products.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum SmokeAlarmType
{
    @JsonProperty("0")
    DISMISSED,

    @JsonProperty("1")
    ALARMING,

    @JsonProperty("2")
    SIMULATING,

    @JsonProperty("8")
    BATTERY_FAULT,

    @JsonProperty("64")
    SENSOR_FAULT,

    @JsonProperty("32768")
    IIC_FAULT
}
