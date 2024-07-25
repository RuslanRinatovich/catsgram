package ru.yandex.practicum.catsgram.model;

import java.time.Instant;

import lombok.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@EqualsAndHashCode(of = {"email"})
public class User {

    final Long id;

    String username;

    String email;

    String password;

    Instant registrationDate;
}
