import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class User {
    private String id;
    private String userName;
    private String email;
    private String password;
    private Date createAt;
}
