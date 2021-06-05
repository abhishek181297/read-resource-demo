package com.abhishek.readresourcedemo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonMapper {
    public static <T> T convertJsonToPojo(String fileName, Class<?> targetClass) throws ClassNotFoundException, JsonProcessingException {
        String dataString = ResourceUtil.getResourceFileAsString("data/user.json");
        ObjectMapper mapper = new ObjectMapper();
        // need to add below configuration if you don't want to throw exception on seeing unknown properties
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        return (T) mapper.readValue(dataString, Class.forName(targetClass.getName()));
    }
}
