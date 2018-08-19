package com.jacksonhu.mihome4j.commands;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface BaseCommand
{
    String command = null;
    String getCommand();
    String toJsonString() throws JsonProcessingException;
}
