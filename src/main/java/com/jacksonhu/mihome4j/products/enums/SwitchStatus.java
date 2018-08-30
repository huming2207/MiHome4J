package com.jacksonhu.mihome4j.products.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum SwitchStatus
{
    @JsonProperty("on")
    ON,

    @JsonProperty("off")
    OFF,

    @JsonProperty("unknown")
    UNKNOWN
}
