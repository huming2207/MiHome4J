package com.jacksonhu.mihome4j.products;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class SmartGateway implements Serializable
{
    @JsonProperty("rgb")
    private int rgbValue;

    @JsonProperty("illumination")
    private int illumination;

    @JsonProperty("proto_version")
    private String protoVersion;

    @JsonProperty("mid")
    private int musicId;

    @JsonProperty("join_permission")
    private String joinPermission;

    @JsonProperty("remove_device")
    private String deviceIdToRemove;

    public int getRgbValue()
    {
        return rgbValue;
    }

    public void setRgbValue(int rgbValue)
    {
        this.rgbValue = rgbValue;
    }

    public int getIllumination()
    {
        return illumination;
    }

    public void setIllumination(int illumination)
    {
        this.illumination = illumination;
    }

    public String getProtoVersion()
    {
        return protoVersion;
    }

    public void setProtoVersion(String protoVersion)
    {
        this.protoVersion = protoVersion;
    }

    public int getMusicId()
    {
        return musicId;
    }

    public void setMusicId(int musicId)
    {
        this.musicId = musicId;
    }

    public String getDeviceIdToRemove()
    {
        return deviceIdToRemove;
    }

    public void setDeviceIdToRemove(String deviceIdToRemove)
    {
        this.deviceIdToRemove = deviceIdToRemove;
    }

    public void setAllowToJoin(boolean allowance)
    {
        this.joinPermission = allowance ? "yes" : "no";
    }

    public boolean isAllowToJoin()
    {
        return this.joinPermission.equals("yes");
    }

}
