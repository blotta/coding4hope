package model;

public class UsuarioColaborador extends Usuario {
	private String profissaoRamo;
	private String siteBlog;

	public String getProfissaoRamo() {
		return profissaoRamo;
	}
	public void setProfissaoRamo(String profissaoRamo) {
		this.profissaoRamo = profissaoRamo;
	}
	public String getSiteBlog() {
		return siteBlog;
	}
	public void setSiteBlog(String siteBlog) {
		this.siteBlog = siteBlog;
	}
	
}
