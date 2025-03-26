package net.amentum.niomedic.pacientes.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RelacionTitularView {
    private String idPaciente;
    private String idPacienteTitular;
    private String idPacienteBeneficiario;
    private String nombreCompleto;
    private String telefono;
    private String email;
    private String parentesco;
}
