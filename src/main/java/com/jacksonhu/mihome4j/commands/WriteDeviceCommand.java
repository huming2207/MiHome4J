package com.jacksonhu.mihome4j.commands;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;

public class WriteDeviceCommand implements BaseCommand
{
    @JsonIgnore
    private String token;

    @JsonIgnore
    private String password;

    @JsonProperty("cmd")
    private String command;

    @JsonProperty("model")
    private String model;

    @JsonProperty("sid")
    private String deviceId;

    @JsonProperty("short_id")
    private String zigbeeId;

    public WriteDeviceCommand(String token, String password)
    {
        this.token = token;
        this.password = password;
    }

    @Override
    public String getCommand()
    {
        return null;
    }

    @Override
    public String toJsonString() throws JsonProcessingException
    {
        return null;
    }
}
