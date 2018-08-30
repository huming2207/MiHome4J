package com.jacksonhu.mihome4j.products.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum WindowStatus
{
    @JsonProperty("open")
    OPEN,

    @JsonProperty("close")
    CLOSE,

    @JsonProperty("unknown")
    UNKNOWN
}
