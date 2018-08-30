package com.jacksonhu.mihome4j.products.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum MotionStatus
{
    @JsonProperty("motion")
    MOTION,

    @JsonProperty("unknown")
    UNKNOWN
}
