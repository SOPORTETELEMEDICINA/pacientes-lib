package net.amentum.niomedic.pacientes.views;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel(description = "Servicio Adicionales del Paciente")
public class ServicioAdicionalesView implements Serializable {

   private static final long serialVersionUID = 8426195241133333516L;

   @ApiModelProperty(value = "El ID es un UUID", allowEmptyValue = true, example = "60acd6be-3089-41b1-a616-16059270a456")
   private String idServicioAdicionales;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,100]")
   @Size(max = 100, message = "Máximo 100 caracteres")
   private String tipoServicio;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,255]")
   @Size(max = 255, message = "Máximo 255 caracteres")
   private String nombre;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,255]")
   @Size(max = 255, message = "Máximo 255 caracteres")
   private String domicilio;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,255]")
   @Size(max = 255, message = "Máximo 255 caracteres")
   private String comentarios;

   @ApiModelProperty(value = "Para uso interno es un TIMESTAMP", dataType = "java.util.Date", example = "197650800")
   private Date fechaCreacion;

}
