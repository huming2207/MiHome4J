package com.jacksonhu.mihome4j.commands;

import com.google.common.collect.ImmutableMap;

public class WritePayload
{
    private static final String GATEWAY_SET_LIGHT_RGB = "\\\"rgb\\\":%d";
    private static final String GATEWAY_PLAY_RINGTONE = "\\\"mid\\\":%d";
    private static final String GATEWAY_STOP_RINGTONE = "\\\"mid\\\":10000";
    private static final String GATEWAY_ALLOW_DISCOVER = "\\\"join_permission\\\":\"yes\"";
    private static final String GATEWAY_REMOVE_DEVICE = "\\\"remove_device\\\":\"%s\"";
    private static final String SWITCH_VIRTUAL_CLICK = "\\\"status\\\":\\\"click\\\"";
    private static final String SWITCH_VIRTUAL_DOUBLE_CLICK = "\\\"status\\\":\\\"click\\\"";
    private static final String PLUG_POWER_ON = "\\\"status\\\":\\\"on\\\"";
    private static final String PLUG_POWER_OFF = "\\\"status\\\":\\\"off\\\"";
}
