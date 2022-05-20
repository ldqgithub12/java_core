package model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Movie {
    private int id;
    private String title;
    private String[] category;
    private String director;
    private int length;
    private String release;
    private int view;

}
