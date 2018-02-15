/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelas;

import br.com.atrib.Login;

/**
 *
 * @author sergiany e carol
 */
public class LoginT {
	public static Login usuarioLogado;

	static {
		usuarioLogado = null;
	}

	public static Login getUsuarioLogado() {
		return usuarioLogado;
	}

	public static void setUsuarioLogado(Login usuarioLogado) {
		LoginT.usuarioLogado = usuarioLogado;
	}

}
