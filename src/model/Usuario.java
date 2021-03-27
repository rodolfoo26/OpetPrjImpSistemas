package model;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.dao.UsuarioDao;

@SessionScoped
@ManagedBean
public class Usuario extends UsuarioDao {
	
	private int idUsuario;
	private String login;
	private String senha;
	private String nomeUsuario;
	private String sobrenome;
	private String cpf;
	private String cep;
	private String endereco;
	private String uf;
	
	public Usuario(int idUsuario, String login, String senha, String nomeUsuario, String sobrenome, String cpf,
					String cep, String endereco, String uf) {
		this.idUsuario = idUsuario;
		this.login = login;
		this.senha = senha;
		this.nomeUsuario = nomeUsuario;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.cep = cep;
		this.endereco = endereco;
		this.uf = uf;
	}
	
	public Usuario() {}	
	
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	public boolean logar() {
		return super.logar(this);
	}
	
	public boolean excluir() {
		return super.excluir(this);
	}
	
	public Usuario consultar() {
		return super.consultar(this.getCpf());
	}
	
	public boolean salvar() throws SQLException {
		return super.salvar(this);
	}
	
	public boolean atualizar() throws SQLException {
		return super.atualizar(this);
	}
	

}
