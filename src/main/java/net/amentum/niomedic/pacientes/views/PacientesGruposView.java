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
public class PacientesGruposView {
   private String idPaciente;
   private Integer idGroup;
   private Integer idPacientesGrupos;
}
