package com.cartoes_ms.core.service;

import com.cartoes_ms.core.entity.UsuarioEntity;
import com.cartoes_ms.rest.dto.LoginDTO;
import com.cartoes_ms.rest.dto.UsuarioDTO;

public interface LoginService {
    UsuarioEntity signup(UsuarioDTO usuarioDTO);
    UsuarioEntity authenticate(LoginDTO loginDTO);
}
