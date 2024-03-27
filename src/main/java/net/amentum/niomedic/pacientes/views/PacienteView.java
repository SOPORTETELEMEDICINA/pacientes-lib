package net.amentum.niomedic.pacientes.views;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "Datos de los Pacientes")
public class PacienteView implements Serializable {

   private static final long serialVersionUID = -8382136673993710998L;

   @ApiModelProperty(value = "El ID es un UUID", allowEmptyValue = true, example = "60acd6be-3089-41b1-a616-16059270a456")
   private String idPaciente;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[1,100]")
   @Size(max = 100, message = "Máximo 100 caracteres")
   @NotEmpty(message = "No puede ser nulo o vacío")
   private String nombre;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[1,100]")
   @Size(max = 100, message = "Máximo 100 caracteres")
   @NotEmpty(message = "No puede ser nulo o vacío")
   private String apellidoPaterno;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,100]")
   @Size(max = 100, message = "Máximo 100 caracteres")
   private String apellidoMaterno;

   @ApiModelProperty(required = true, dataType = "java.util.Date", example = "197650800")
   @NotNull(message = "No puede ser nulo o vacío")
   private Date fechaNacimiento;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,200]")
   @Size(max = 200, message = "Máximo 200 caracteres")
   private String lugarNacimiento;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[1,20]")
   @Size(max = 20, message = "Máximo 20 caracteres")
   @NotEmpty(message = "No puede ser nulo o vacío")
   private String curp;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[1,20]")
   @Size(max = 20, message = "Máximo 20 caracteres")
   @NotEmpty(message = "No puede ser nulo o vacío")
   private String sexo;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,50]")
   @Size(max = 50, message = "Máximo 50 caracteres")
   private String religion;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,50]")
   @Size(max = 50, message = "Máximo 50 caracteres")
   private String estadoCivil;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,10]")
   @Size(max = 10, message = "Máximo 10 caracteres")
   private String telefonoLocal;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,50]")
   @Size(max = 50, message = "Máximo 50 caracteres")
   private String telefonoCelular;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[0,100]")
   @Email(message = "email no válido")
   @Size(max = 100, message = "Máximo 100 caracteres")
   private String email;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[0,15]")
   @Size(max = 15, message = "Máximo 15 caracteres")
   private String rfc;

   @ApiModelProperty(value = "Para uso interno es un TIMESTAMP", dataType = "java.util.Date", example = "197650800")
   private Date fechaCreacion;

   @ApiModelProperty(allowEmptyValue = false)
   @Min(value = 1, message = "No debe ser menor a 1")
   @Max(value = 9223372036854775806L, message = "No debe ser mayor a 9223372036854775806")
   private Long idUsuario;

   @NotNull(message = "No puede ser nulo o vacío")
   private Boolean activo;

   //nuevos campos
   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[0,255]")
   @Size(max = 255, message = "Máximo 255 caracteres")
   private String padecimientoCronico;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[0,255]")
   @Size(max = 255, message = "Máximo 255 caracteres")
   private String transfusiones;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[0,255]")
   @Size(max = 255, message = "Máximo 255 caracteres")
   private String alergias;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[0,25]")
   @Size(max = 25, message = "Máximo 25 caracteres")
   private String tipoSangre;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[0,50]")
   @Size(max = 50, message = "Máximo 50 caracteres")
   private String afiliacion;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[0,50]")
   @Size(max = 50, message = "Máximo 50 caracteres")
   private String numeroAfiliacion;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[0,50]")
   @Size(max = 50, message = "Máximo 50 caracteres")
   private String userName;

   @ApiModelProperty(allowEmptyValue = true)
   private Boolean esTutor;

   @ApiModelProperty(allowEmptyValue = true)
   private String idDevice;

   @ApiModelProperty(allowEmptyValue = true)
   private String claveElector;

   @ApiModelProperty(allowEmptyValue = true)
   private Boolean esCanalizado;

   @ApiModelProperty(allowEmptyValue = true)
   private Long idUnidadMedica;

   @ApiModelProperty(allowEmptyValue = false)
   @Min(value = 1, message = "No debe ser menor a 1")
   @Max(value = 9223372036854775806L, message = "No debe ser mayor a 9223372036854775806")
   private Long numeroExpediente;

   //campos agregados  en el sprint 2 13/04/2021
   @ApiModelProperty(allowEmptyValue = true)
   private Integer genero;

   @ApiModelProperty(allowEmptyValue = true)
   private Integer claveEdad;

   @ApiModelProperty(allowEmptyValue = true)
   private Integer seAutodenominaAfromexicano;

   @ApiModelProperty(allowEmptyValue = true)
   private Integer seConsideraIndigena;

   //campo agregado en el sprint 3 04/05/2021
   @ApiModelProperty(allowEmptyValue = true)
   private String etnia;
   //
   //campo agregado en el sprint 3 07/05/2021
   @ApiModelProperty(allowEmptyValue = true)
   private Integer nacionalidad;
   //
   @ApiModelProperty(allowEmptyValue = true)
   private Integer migrante;


   //las relaciones
   private Collection<DatosContactoView> datosContactoViewList = new ArrayList<>();
   private Collection<ServicioAdicionalesView> servicioAdicionalesViewList = new ArrayList<>();
   private Collection<PersonasViviendaView> personasViviendaViewList = new ArrayList<>();
   private DatosAdicionalesView datosAdicionalesView;
   private ResponsablePacienteView responsablePacienteView;
   private Collection<AfiliacionesView> afiliacionesViewList = new ArrayList<>();
   private Collection<AlergiasView> alergiasViewList = new ArrayList<>();

   //    private DomicilioView domicilioView;
   private Collection<DomicilioView> domicilioViewList = new ArrayList<>();

   private Collection<CatServicioView> catServiciosList = new ArrayList<>();

   @Override
   public String toString() {
      return "PacienteView{" +
         "idPaciente='" + idPaciente + '\'' +
         ", nombre='" + nombre + '\'' +
         ", apellidoPaterno='" + apellidoPaterno + '\'' +
         ", apellidoMaterno='" + apellidoMaterno + '\'' +
         ", fechaNacimiento=" + fechaNacimiento +
         ", lugarNacimiento='" + lugarNacimiento + '\'' +
         ", curp='" + curp + '\'' +
         ", sexo='" + sexo + '\'' +
         ", religion='" + religion + '\'' +
         ", estadoCivil='" + estadoCivil + '\'' +
         ", telefonoLocal='" + telefonoLocal + '\'' +
         ", telefonoCelular='" + telefonoCelular + '\'' +
         ", email='" + email + '\'' +
         ", rfc='" + rfc + '\'' +
         ", fechaCreacion=" + fechaCreacion +
         ", idUsuario=" + idUsuario +
         ", activo=" + activo +
         ", padecimientoCronico='" + padecimientoCronico + '\'' +
         ", alergias='" + alergias + '\'' +
         ", tipoSangre='" + tipoSangre + '\'' +
         ", afiliacion='" + afiliacion + '\'' +
         ", numeroAfiliacion='" + numeroAfiliacion + '\'' +
         ", numeroExpediente=" + numeroExpediente +
         ", userName='" + userName + '\'' +
         //campos agregados  en el sprint 2 13/04/2021
         ",genero="+genero+'\''+
         ", claveEdad="+claveEdad+'\''+
         ", seAutodenominaAfromexicano="+seAutodenominaAfromexicano+'\''+
         ", seConsideraIndigena="+seConsideraIndigena+'\''+
          //campo agregado en el sprint 3 04/05/2021
         ", etnia="+etnia+'\''+
          //campo agregado en el sprint 3 04/05/2021
         ", nacionalidad="+nacionalidad+'\''+
              ", migrante="+migrante+'\''+

              '}';
   }
}
