package com.yago.aprendo.spring.data.business;


import com.yago.aprendo.spring.data.infrastructure.entity.Usuario;
import com.yago.aprendo.spring.data.infrastructure.exceptions.ConflictException;
import com.yago.aprendo.spring.data.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class UsuarioService {

    private final UsuarioRepository usuarioRepository ;

    public Usuario savaUsuario(Usuario usuario){
        try{
          emailExiste(usuario.getEmail());
          return usuarioRepository.save(usuario);
        }catch(ConflictException e) {
            throw new ConflictException("Email ja cadastrado ", e.getCause());
        }
        }
        public void emailExiste(String email){
         try{
          boolean existe =   verificaEmailExistente(email);
          if(existe){
              throw new ConflictException("Email ja cadastrado " + email);
          }
         }catch (ConflictException e ){
             throw new ConflictException("Email ja cadastrado " + e.getCause());
         }
        }
    public boolean verificaEmailExistente(String email){
        return usuarioRepository.sxistsByEmail(email);
    }
}
