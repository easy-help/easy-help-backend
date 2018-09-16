package com.easyhelp.application.server;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class ServerResponse<T extends Serializable> implements Serializable {
    private String id;
    private String act;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<T> model;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private ServerError error;
}
