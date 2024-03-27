package net.amentum.niomedic.pacientes.views;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel(description = "Domicilio del Paciente")
public class DomicilioView implements Serializable {

   private static final long serialVersionUID = 1747984703820758967L;

   @ApiModelProperty(value = "El ID es un UUID", allowEmptyValue = true, example = "60acd6be-3089-41b1-a616-16059270a456")
   private String idDomicilio;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,200]")
   @Size(max = 200, message = "Máximo 200 caracteres")
   private String domicilio;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,200]")
   @Size(max = 200, message = "Máximo 200 caracteres")
   private String colonia;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,200]")
   @Size(max = 200, message = "Máximo 200 caracteres")
   private String municipio;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,200]")
   @Size(max = 200, message = "Máximo 200 caracteres")
   private String estado;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,200]")
   @Size(max = 200, message = "Máximo 200 caracteres")
   private String pais;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,6]")
   @Size(max = 6, message = "Máximo 6 caracteres")
   private String cp;

   @ApiModelProperty(value = "Para uso interno es un TIMESTAMP", dataType = "java.util.Date", example = "197650800")
   private Date fechaCreacion;

   @ApiModelProperty(required = true, allowEmptyValue = false)
   @NotNull(message = "No puede ser nulo o vacío")
   private Boolean activo;
}
