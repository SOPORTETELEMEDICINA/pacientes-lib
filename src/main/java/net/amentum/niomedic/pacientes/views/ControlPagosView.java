package net.amentum.niomedic.pacientes.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ControlPagosView {

    String idTransaccion;
    String folioVenta;
    String idPac;
    Date pagoFechaDatetime;
    BigDecimal pagoImporte;
    Long pagoTipo;
    Date fechaCreacion;
    Long estatusFolio;
    Long numeroSucursal;

}
