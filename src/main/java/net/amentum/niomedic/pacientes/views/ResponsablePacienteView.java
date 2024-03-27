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
@ApiModel(description = "Responsable del paciente")
public class ResponsablePacienteView implements Serializable {

    @ApiModelProperty(value = "El ID es un UUID", allowEmptyValue = true, example = "60acd6be-3089-41b1-a616-16059270a456")
    private String idResponsable;

    @ApiModelProperty(allowEmptyValue = true)
    private String nombre;

    @ApiModelProperty(allowEmptyValue = true)
    private String primerApellido;

    @ApiModelProperty(allowEmptyValue = true)
    private String segundoApellido;

    @ApiModelProperty(allowEmptyValue = true)
    private String tipoVialidad;

    @ApiModelProperty(allowEmptyValue = true)
    private String nombreVialidad;

    @ApiModelProperty(allowEmptyValue = true)
    private String numeroExterior;

    @ApiModelProperty(allowEmptyValue = true)
    private String numeroInterior;

    @ApiModelProperty(allowEmptyValue = true)
    private String tipoAsentamiento;

    @ApiModelProperty(allowEmptyValue = true)
    private String nombreAsentamiento;

    @ApiModelProperty(allowEmptyValue = true)
    private String valorLocalidad;

    @ApiModelProperty(allowEmptyValue = true)
    private String valorMunicipio;

    @ApiModelProperty(allowEmptyValue = true)
    private String valorEntidad;

    @ApiModelProperty(allowEmptyValue = true)
    private String valorCodigoPostal;

    @ApiModelProperty(allowEmptyValue = true)
    private String pais;

    @ApiModelProperty(allowEmptyValue = true)
    private String telefono;

    @ApiModelProperty(allowEmptyValue = true)
    private String correo;


}
