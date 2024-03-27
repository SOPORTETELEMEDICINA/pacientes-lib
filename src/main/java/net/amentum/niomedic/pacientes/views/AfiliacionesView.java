package net.amentum.niomedic.pacientes.views;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.models.auth.In;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel(description = "Afiliacione y planes de aseguramiento del paciente")
public class AfiliacionesView implements Serializable {

    @ApiModelProperty(value = "El ID es un UUID", allowEmptyValue = true, example = "60acd6be-3089-41b1-a616-16059270a456")
    private String idAfiliacion;

    @ApiModelProperty(allowEmptyValue = true)
    private String programa;

    @ApiModelProperty(allowEmptyValue = true)
    private String poliza;

    @ApiModelProperty(allowEmptyValue = true)
    private String folio;

    @ApiModelProperty(allowEmptyValue = true)
    private String tipoBeneficiario;

    @ApiModelProperty(allowEmptyValue = true)
    private String inicio;

    @ApiModelProperty(allowEmptyValue = true)
    private String fin;




}
