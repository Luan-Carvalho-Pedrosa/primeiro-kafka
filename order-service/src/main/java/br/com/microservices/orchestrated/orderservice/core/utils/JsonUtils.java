package br.com.microservices.orchestrated.orderservice.core.utils;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.microservices.orchestrated.orderservice.core.document.Event;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@AllArgsConstructor
public class JsonUtils {

    private final ObjectMapper objectMapper;

    public String toJson(Object object){

        try {
            return objectMapper.writeValueAsString(object);
        } catch (Exception e) {
            // TODO: handle exception
            return "";
        }

    }

    public Event toEvent(String json){

         try {
            return objectMapper.readValue(json, Event.class);
        } catch (Exception e) {
            // TODO: handle exception
            return null;
        }

    }
    
}
