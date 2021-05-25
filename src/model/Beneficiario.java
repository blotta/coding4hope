package model;

import java.util.Date;

/**
 * Indivíduo que fará uso do equipamento emprestado
 *
 */
public class Beneficiario {
	private Integer id;
	private String nome;
	private Usuario responsavel;
	private Date dataNascimento;
	private float altura;
	private float peso;
	private Integer nrCalcado;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Usuario getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(Usuario responsavel) {
		this.responsavel = responsavel;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public Integer getNrCalcado() {
		return nrCalcado;
	}
	public void setNrCalcado(Integer nrCalcado) {
		this.nrCalcado = nrCalcado;
	}
	
	

}
