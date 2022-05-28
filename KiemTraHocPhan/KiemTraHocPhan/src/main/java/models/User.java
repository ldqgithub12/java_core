package models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    private int id;
    private String phone;
    private String password;
    private String account;
    private long balance;
}
