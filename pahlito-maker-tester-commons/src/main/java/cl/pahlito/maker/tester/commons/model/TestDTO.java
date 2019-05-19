package cl.pahlito.maker.tester.commons.model;

import java.io.Serializable;

public class TestDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6299569412058072689L;

	private Long id;
	
	private String descripcion;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
}
