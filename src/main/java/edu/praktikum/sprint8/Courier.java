package edu.praktikum.sprint8;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
public class Courier {

    private String login;
    private String password;
    private String firstName;
}
