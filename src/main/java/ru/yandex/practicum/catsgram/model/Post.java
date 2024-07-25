package ru.yandex.practicum.catsgram.model;

import java.time.Instant;

import lombok.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class Post {
    Long id;
    long authorId;
    String description;
    Instant postDate;
}
