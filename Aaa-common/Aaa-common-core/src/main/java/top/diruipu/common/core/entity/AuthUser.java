package top.diruipu.common.core.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
/**
 * @author diruipu
 * @create 2021-12-16 9:08 PM
 * @ClassName AuthUser
 */
@Data
@SuppressWarnings("all")
@EqualsAndHashCode(callSuper = true)
public class AuthUser extends User implements Serializable {

        private Long userId;

        private String avatar;

        private String email;

        private String mobile;

        private String sex;

        private Long deptId;

        private String deptName;

        private String roleId;

        private String roleName;

        private Date lastLoginTime;

        private String description;

        private String status;

        private String deptIds;

        public AuthUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
            super(username, password, authorities);
        }

        public AuthUser(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
            super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
        }
}