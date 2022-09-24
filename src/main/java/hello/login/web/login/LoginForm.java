package hello.login.web.login;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * packageName    : hello.login.web.login
 * fileName       : LoginForm
 * author         : kanghyun Kim
 * date           : 2022/09/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/09/24        kanghyun Kim      최초 생성
 */
@Data
public class LoginForm {

    @NotEmpty
    private String loginId;

    @NotEmpty
    private String password;
}
