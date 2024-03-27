package net.amentum.niomedic.pacientes.views;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel(description = "Alergias del paciente")
public class AlergiasView implements Serializable {

    @ApiModelProperty(value = "El ID es un UUID", allowEmptyValue = true, example = "60acd6be-3089-41b1-a616-16059270a456")
        private String idAlergias;

    @ApiModelProperty(allowEmptyValue = true)
    private String alergeno;

    @ApiModelProperty(allowEmptyValue = true)
    private String fechaInicial;

    @ApiModelProperty(allowEmptyValue = true)
    private String medico;

    @ApiModelProperty(allowEmptyValue = true)
    private String reaccion;

    @ApiModelProperty(allowEmptyValue = true)
    private String estadoActual;

    @ApiModelProperty(allowEmptyValue = true)
    private String observaciones;




}
