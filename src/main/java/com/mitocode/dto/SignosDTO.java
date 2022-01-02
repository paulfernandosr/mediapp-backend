package com.mitocode.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;

import com.mitocode.model.Paciente;

public class SignosDTO {
	
	private Integer idSignos;

	@NotNull
	private Paciente paciente;

	@NotNull
	private LocalDateTime fecha;
	
	@NotNull
	private String temperatura;

	@NotNull
	private String pulso;
	
	@NotNull
	private String ritmoRespiratorio;

	public Integer getIdSignos() {
		return idSignos;
	}

	public void setIdSignos(Integer idSignos) {
		this.idSignos = idSignos;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}

	public String getPulso() {
		return pulso;
	}

	public void setPulso(String pulso) {
		this.pulso = pulso;
	}

	public String getRitmoRespiratorio() {
		return ritmoRespiratorio;
	}

	public void setRitmoRespiratorio(String ritmoRespiratorio) {
		this.ritmoRespiratorio = ritmoRespiratorio;
	}
	
	

}
