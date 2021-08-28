package ru.netology.manager;

import lombok.NoArgsConstructor;
import ru.netology.domain.Movies;

@NoArgsConstructor
public class FilmManager {
    private Movies[] films = new Movies[0];
    private int maxShowFilms = 10;

    public void setMaxShowFilms(int maxShowFilms) {
        this.maxShowFilms = maxShowFilms;
    }

    public void add(Movies item) {
        int length = films.length + 1;
        Movies[] tmp = new Movies[length];
        System.arraycopy(films, 0, tmp, 0, films.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        films = tmp;
    }

    public Movies[] getAddedFilms() {
        Movies[] result = new Movies[films.length];
        if (films.length > maxShowFilms) {
            result = new Movies[maxShowFilms];
        }
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }
}
