package net.amentum.niomedic.pacientes.views;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel(description = "Datos Adicionales del Paciente")
public class DatosAdicionalesView implements Serializable {

   private static final long serialVersionUID = 3602116802847701981L;

   @ApiModelProperty(value = "El ID es un UUID", allowEmptyValue = true, example = "60acd6be-3089-41b1-a616-16059270a456")
   private String idDatosAdicionales;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,170]")
   @Size(max = 170, message = "Máximo 170 caracteres")
   private String escolaridad;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,170]")
   @Size(max = 170, message = "Máximo 170 caracteres")
   private String ocupacion;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,170]")
   @Size(max = 170, message = "Máximo 170 caracteres")
   private String ocupacionAnterior;

   @ApiModelProperty(value = "Para uso interno es un TIMESTAMP", dataType = "java.util.Date", example = "197650800")
   private Date fechaCreacion;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,170]")
   @Size(max = 170, message = "Máximo 170 caracteres")
   private String origenEtnico;

   @ApiModelProperty(allowEmptyValue = true)
   private Boolean viveSolo;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,255]")
   @Size(max = 255, message = "Máximo 255 caracteres")
   private String localidad;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,170]")
   @Size(max = 170, message = "Máximo 170 caracteres")
   private String lenguaIndigena;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,255]")
   @Size(max = 255, message = "Máximo 255 caracteres")
   private String antecedentes;

}
