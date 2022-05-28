package models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {
    private int id;
    private String name;
    private int grade;
    private Gender gender;
}
