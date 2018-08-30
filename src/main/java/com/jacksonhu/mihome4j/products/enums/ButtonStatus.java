package com.jacksonhu.mihome4j.products.enums;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ButtonStatus
{
    @JsonProperty("click")
    CLICK,

    @JsonProperty("double_click")
    DOUBLE_CLICK,

    @JsonProperty("both_click")
    BOTH_CLICK
}
