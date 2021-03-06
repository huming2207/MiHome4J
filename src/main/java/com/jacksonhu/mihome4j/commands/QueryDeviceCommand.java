package com.jacksonhu.mihome4j.commands;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class QueryDeviceCommand implements BaseCommand
{
    @JsonProperty("cmd")
    private String command;

    @JsonProperty("sid")
    private String deviceId;

    public QueryDeviceCommand(String deviceId)
    {
        this.command = "get_id_list";
        this.deviceId = deviceId;
    }

    public String getCommand()
    {
        return this.command;
    }

    public String getDeviceId()
    {
        return this.deviceId;
    }

    public String toJsonString() throws JsonProcessingException
    {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(this);
    }

}
