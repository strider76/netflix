package com.at.netflix.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorDTO {

    private String errorNum;
    private String errorDescription;

}
