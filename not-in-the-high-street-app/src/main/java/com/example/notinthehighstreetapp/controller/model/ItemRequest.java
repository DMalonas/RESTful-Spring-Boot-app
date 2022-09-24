package com.example.notinthehighstreetapp.controller.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ItemRequest {
    @JsonProperty private String name;
    @JsonProperty private double price;
}
