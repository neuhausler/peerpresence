package com.peerpresence;

import org.hibernate.validator.constraints.*;

import com.fasterxml.jackson.annotation.*;
import com.yammer.dropwizard.config.*;


public class PeerpresenceConfiguration extends Configuration
{
    @NotEmpty
    @JsonProperty
    private String pong= "pong";

    public String getPong() {
        return pong;
    }
}