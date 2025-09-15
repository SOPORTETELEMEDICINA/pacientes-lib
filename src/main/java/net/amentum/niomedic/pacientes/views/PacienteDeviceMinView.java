package net.amentum.niomedic.pacientes.views;

import io.swagger.annotations.ApiModel;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel(description = "Vista mínima: nombre completo, idPaciente e idDevice")
public class PacienteDeviceMinView {
    private String nombre;      // nombre completo
    private String idPaciente;  // UUID del paciente
    private String idDevice;    // id del dispositivo
}
