package org.teamshare.specificator.utils;

import com.google.gson.Gson;

import java.io.Serializable;

public class SerializeUtils {
    public static <T extends Serializable> String toJson(T obj) {
        return new Gson().toJson(obj);
    }
}
