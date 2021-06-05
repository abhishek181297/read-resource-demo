package com.abhishek.readresourcedemo;

import com.fasterxml.jackson.databind.json.JsonMapper;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class ResourceUtil {
    public static String getResourceFileAsString(String fileName) {
        InputStream is = getResourceFileAsInputStream(fileName);
        if (is != null) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            return (String) reader.lines().collect(Collectors.joining(System.lineSeparator()));
        } else {
            throw new RuntimeException("resource not found");
        }
    }
    public static InputStream getResourceFileAsInputStream(String fileName) {
        ClassLoader classLoader = JsonMapper.class.getClassLoader();
        return classLoader.getResourceAsStream(fileName);
    }
}
