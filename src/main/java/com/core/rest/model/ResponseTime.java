package com.core.rest.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseTime {
    private String tiempoRespuesta;
    private String fechaHoraInicio;
    private String fechaHoraFin;
}
