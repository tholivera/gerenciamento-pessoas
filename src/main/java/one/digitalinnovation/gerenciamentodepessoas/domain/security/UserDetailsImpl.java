package one.digitalinnovation.gerenciamentodepessoas.domain.security;

import one.digitalinnovation.gerenciamentodepessoas.domain.model.contributors.Supervisor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serial;
import java.util.Collection;
import java.util.List;

public class UserDetailsImpl implements UserDetails {

    @Serial
    private static final long serialVersionUID = 1L;

    private String userName;
    private String password;
    private List<GrantedAuthority> authorities;

    public UserDetailsImpl(Supervisor gerenciador){
        this.userName = gerenciador.getEmail();
        this.password = gerenciador.getSenha();
    }

    public UserDetailsImpl() { }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities(){
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }
    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    public boolean isAccountNonExpired(){
        return true;
    }

    @Override
    public boolean isAccountNonLocked(){
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled(){
        return true;
    }
}
