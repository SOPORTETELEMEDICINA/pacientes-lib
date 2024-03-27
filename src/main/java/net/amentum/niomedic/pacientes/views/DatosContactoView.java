package net.amentum.niomedic.pacientes.views;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel(description = "Datos Contacto del Paciente")
public class DatosContactoView implements Serializable {

   private static final long serialVersionUID = 1240318172911711237L;

   @ApiModelProperty(value = "El ID es un UUID", allowEmptyValue = true, example = "60acd6be-3089-41b1-a616-16059270a456")
   private String idDatosContacto;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[1,170]")
   @Size(max = 170, message = "Máximo 170 caracteres")
   @NotEmpty(message = "No puede ser nulo o vacío")
   private String nombre;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,100]")
   @Size(max = 100, message = "Máximo 100 caracteres")
   private String parentesco;

   @ApiModelProperty(allowEmptyValue = true)
   @Min(value = 1, message = "No debe ser menor a 1")
   @Max(value = 2147483646, message = "No debe ser mayor a 2147483646")
   private Integer edad;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,170]")
   @Size(max = 170, message = "Máximo 170 caracteres")
   private String convivencia;

   @ApiModelProperty(allowEmptyValue = true)
   @Min(value = 1, message = "No debe ser menor a 1")
   @Max(value = 2147483646, message = "No debe ser mayor a 2147483646")
   private Integer llamarCasoEmergencia;

   @ApiModelProperty(allowEmptyValue = true)
   private Boolean cuentaConLlaves;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[1,10]")
   @Size(max = 10, message = "Máximo 10 caracteres")
   @NotEmpty(message = "No puede ser nulo o vacío")
   private String telefonoLocal;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,10]")
   @Size(max = 10, message = "Máximo 10 caracteres")
   private String telefonoCelular;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,10]")
   @Size(max = 10, message = "Máximo 10 caracteres")
   private String telefonoOficina;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,200]")
   @Size(max = 200, message = "Máximo 200 caracteres")
   private String tipoApoyoMaterial;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,200]")
   @Size(max = 200, message = "Máximo 200 caracteres")
   private String tipoApoyoEmocional;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,200]")
   @Size(max = 200, message = "Máximo 200 caracteres")
   private String tipoApoyoSocial;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,200]")
   @Size(max = 200, message = "Máximo 200 caracteres")
   private String tipoApoyoInstrumental;

   @ApiModelProperty(value = "Para uso interno es un TIMESTAMP", dataType = "java.util.Date", example = "197650800")
   private Date fechaCreacion;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,100]")
   @Size(max = 100, message = "Máximo 100 caracteres")
   private String prioridad;

}
