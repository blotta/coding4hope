package model;

import java.util.ArrayList;
import java.util.Date;

public class Usuario {
	private Integer id;
	private String nome;
	private String whatsapp;
	private Date dataNascimento;
	private ArrayList<Permissao> permissoes;
	private ArrayList<Endereco> enderecos;
	private ArrayList<Beneficiario> beneficiarios;

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
	public String getWhatsapp() {
		return whatsapp;
	}
	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public ArrayList<Permissao> getPermissoes() {
		return permissoes;
	}
	public void setPermissoes(ArrayList<Permissao> permissoes) {
		this.permissoes = permissoes;
	}
	public ArrayList<Endereco> getEnderecos() {
		return enderecos;
	}
	public void setEnderecos(ArrayList<Endereco> enderecos) {
		this.enderecos = enderecos;
	}
	public ArrayList<Beneficiario> getBeneficiarios() {
		return beneficiarios;
	}
	public void setBeneficiarios(ArrayList<Beneficiario> beneficiarios) {
		this.beneficiarios = beneficiarios;
	}
	
}
