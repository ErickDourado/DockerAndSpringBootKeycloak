package br.com.springkeycloak.services;

import br.com.springkeycloak.models.User;
import org.springframework.http.ResponseEntity;

public interface LoginService<T> {

    ResponseEntity<T> login(User user);
    ResponseEntity<T> refreshToken(String refreshToken);

}
