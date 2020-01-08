package org.teamshare.itschool.utils;

import javafx.util.Pair;

import java.net.URISyntaxException;

public class UrlUtils {
    public static Pair<String, String> getFirstQueryParam(String queryString) throws URISyntaxException {
        String[] queryParams = queryString.split("&");
        String[] queryParam = queryParams[0].split("=");
        if (queryParam.length < 2) {
            throw new URISyntaxException(queryParams[0], "Invalid query parameter", 0);
        }

        String queryParamKey = queryParam[0];
        String queryParamValue = queryParam[1];

        return new Pair<>(queryParamKey, queryParamValue);
    }
}
