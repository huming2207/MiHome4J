package com.jacksonhu.mihome4j.products.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum CubeStatus
{
    @JsonProperty("flip90")
    FIIP_90,

    @JsonProperty("flip180")
    FILP180,

    @JsonProperty("move")
    MOVE,

    @JsonProperty("tap_twice")
    TAP_TWICE,

    @JsonProperty("shake_air")
    SHAKE_AIR,

    @JsonProperty("swing")
    SWING,

    @JsonProperty("alert")
    ALERT,

    @JsonProperty("free_fall")
    FREE_FALL
}
