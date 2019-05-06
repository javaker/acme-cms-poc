package com.acme.cmspoc.demoamp;

import org.springframework.extensions.webscripts.Cache;
import org.springframework.extensions.webscripts.DeclarativeWebScript;
import org.springframework.extensions.webscripts.Status;
import org.springframework.extensions.webscripts.WebScriptRequest;

import java.util.HashMap;
import java.util.Map;

public class UserInfoWebScript extends DeclarativeWebScript {
    protected Map<String, Object> executeImpl(
            WebScriptRequest req, Status status, Cache cache) {
        return new HashMap<String, Object>();
    }
}
