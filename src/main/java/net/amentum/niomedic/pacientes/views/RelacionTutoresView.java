package net.amentum.niomedic.pacientes.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RelacionTutoresView {
    private Integer idRelacion;
    private Integer idTutor;
    private String idPacTutor;
    private String parentesco;
    private String nombreTutor;
    private String telefono;
    private String email;
}
