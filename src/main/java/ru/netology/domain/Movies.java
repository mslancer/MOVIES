package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Movies {
    private int id;
    private int year;
    private String name;
    private String genre;
    private String imageUrl;
}
