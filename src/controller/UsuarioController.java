package controller;

import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.Usuario;

@SessionScoped
@ManagedBean()
public class UsuarioController {
	
	public UsuarioController() {
	}
	
	public String excluir(Usuario u) {
		u.excluir();
		return "index.xhtml";		
	}

	public void alterar(Usuario u) throws SQLException {		
		u.atualizar();		
	}

	public void consultar(Usuario u) {
		u.consultar();				
	}

	public String salvar(Usuario u) throws Exception {
		u.salvar();	
		return "/login.xhtml";
	}
	
	public String logar(Usuario u) throws Exception {
		if (u.logar()){
			return "usuario/menuUsuario.xhtml";
		}{
			return null;
		}
		
	}
}