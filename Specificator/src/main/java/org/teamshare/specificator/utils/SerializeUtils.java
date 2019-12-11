package org.teamshare.specificator.utils;

import com.google.gson.Gson;

import java.io.Serializable;

public class SerializeUtils {
    public static String toJson(Object obj) {
        return new Gson().toJson(obj);
    }
    public static <T> T fromJson(String json, Class<T> clazz) {
        return new Gson().fromJson(json, clazz);
    }
}
