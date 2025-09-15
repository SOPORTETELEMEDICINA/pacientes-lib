package net.amentum.niomedic.pacientes.views;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel(description = "Los datos que se muestran en los page/search")
public class PacientePageView {
   private String nombre;
   private Date fechaCreacion;
   private long idUsuario;
   private String userName;
   private String idPaciente;
   private String curp;
   private Long numeroExpediente;
   private Boolean esCanalizado;
   private Boolean pacienteAtendido;
   private Integer idGroup;
   private String groupName;
   private String idDevice;
}
