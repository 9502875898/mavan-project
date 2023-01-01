package com.javatechin.exampleprograms;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ApiResponse {

    private int statusCoed;

    private String message;

    private Object data;

    public ApiResponse(int  statusCoed, String message, Object data) {
        this.statusCoed = statusCoed;
        this.message = message;
        this.data = data;
    }

    public ApiResponse(int statusCoed, String message) {
        this.statusCoed = statusCoed;
        this.message = message;
    }
}
