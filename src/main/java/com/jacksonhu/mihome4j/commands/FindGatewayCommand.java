package com.jacksonhu.mihome4j.commands;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FindGatewayCommand implements BaseCommand
{
    @JsonProperty("cmd")
    private String command;

    public FindGatewayCommand()
    {
        command = "whoami";
    }

    public String getCommand()
    {
        return this.command;
    }

    public String toJsonString() throws JsonProcessingException
    {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(this);
    }

}
