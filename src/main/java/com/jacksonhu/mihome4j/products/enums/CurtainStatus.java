package com.jacksonhu.mihome4j.products.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum CurtainStatus
{
    @JsonProperty("open")
    OPEN,

    @JsonProperty("close")
    CLOSE,

    @JsonProperty("stop")
    STOP,

    @JsonProperty("auto")
    AUTO
}
