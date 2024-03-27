package net.amentum.niomedic.pacientes.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ControlNotificacionView {

    Long id;
    Long idUser;
    String idDevice;
    String idNotification;
    Long tipoNotificacion;

}
