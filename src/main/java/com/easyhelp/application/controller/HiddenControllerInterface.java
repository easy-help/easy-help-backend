package com.easyhelp.application.controller;

import com.easyhelp.application.server.ServerResponse;

import java.io.Serializable;

public interface HiddenControllerInterface<T extends Serializable> {

    ServerResponse<T> handleRequest(String act);
}
