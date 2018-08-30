package com.jacksonhu.mihome4j.products.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum WaterLeakStatus
{
    @JsonProperty("leak")
    LEAK,

    @JsonProperty("no_leak")
    NO_LEAK
}
