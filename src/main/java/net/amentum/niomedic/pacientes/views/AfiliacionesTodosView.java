package net.amentum.niomedic.pacientes.views;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AfiliacionesTodosView implements Serializable {

    private String idAfiliacion;
    private String programa;
    private String poliza;
    private String folio;
    private String tipoBeneficiario;
    private String inicio;
    private String fin;
    private String idPaciente;
}
