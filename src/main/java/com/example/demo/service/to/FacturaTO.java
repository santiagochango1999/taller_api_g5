package com.example.demo.service.to;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class FacturaTO {

	private Integer id;
	private LocalDateTime fechaFactura;
	private String detalleFactura;
	private BigDecimal total;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getFechaFactura() {
		return fechaFactura;
	}

	public void setFechaFactura(LocalDateTime fechaFactura) {
		this.fechaFactura = fechaFactura;
	}

	public String getDetalleFactura() {
		return detalleFactura;
	}

	public void setDetalleFactura(String detalleFactura) {
		this.detalleFactura = detalleFactura;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

}
