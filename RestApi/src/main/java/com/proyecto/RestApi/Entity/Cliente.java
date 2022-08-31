package com.proyecto.RestApi.Entity;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer cod_cliente,ruc,estado;
	String nombre_completo,grupo_fact,codigosap;
	Date inac_desde;
	String nombre_corto;
	String abreviatura;
	
	public Cliente() {
		super();
		
	}

	public Cliente(Integer cod_cliente, Integer ruc, Integer estado, String nombre_completo, String grupo_fact,
			String codigosap, Date inac_desde, String nombre_corto, String abreviatura) {
		super();
		this.cod_cliente = cod_cliente;
		this.ruc = ruc;
		this.estado = estado;
		this.nombre_completo = nombre_completo;
		this.grupo_fact = grupo_fact;
		this.codigosap = codigosap;
		this.inac_desde = inac_desde;
		this.nombre_corto = nombre_corto;
		this.abreviatura = abreviatura;
	}

	public Integer getCod_cliente() {
		return cod_cliente;
	}

	public void setCod_cliente(Integer cod_cliente) {
		this.cod_cliente = cod_cliente;
	}

	public Integer getRuc() {
		return ruc;
	}

	public void setRuc(Integer ruc) {
		this.ruc = ruc;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public String getNombre_completo() {
		return nombre_completo;
	}

	public void setNombre_completo(String nombre_completo) {
		this.nombre_completo = nombre_completo;
	}

	public String getGrupo_fact() {
		return grupo_fact;
	}

	public void setGrupo_fact(String grupo_fact) {
		this.grupo_fact = grupo_fact;
	}

	public String getCodigosap() {
		return codigosap;
	}

	public void setCodigosap(String codigosap) {
		this.codigosap = codigosap;
	}

	public Date getInac_desde() {
		return inac_desde;
	}

	public void setInac_desde(Date inac_desde) {
		this.inac_desde = inac_desde;
	}

	public String getNombre_corto() {
		return nombre_corto;
	}

	public void setNombre_corto(String nombre_corto) {
		this.nombre_corto = nombre_corto;
	}

	public String getAbreviatura() {
		return abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	
	
	
	
	
}
