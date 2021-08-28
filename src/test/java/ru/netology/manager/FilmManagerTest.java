package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movies;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FilmManagerTest {
    private FilmManager manager = new FilmManager();
    private final Movies first = new Movies(1, 2020, "Бладшот", "Боевик", "url 1");
    private final Movies second = new Movies(2, 2021, "Медиатр", "Боевик", "url 2");
    private final Movies third = new Movies(3, 2013, "Рик и Морти", "Мультфильм", "url 3");
    private final Movies fourth = new Movies(4, 2011, "Бесстыжие", "Драма", "url 4");
    private final Movies fifth = new Movies(5, 2012, "Американская История Ужасоы", "Ужасы", "url 5");
    private final Movies sixth = new Movies(6, 2019, "Человек паук", "Фантастика", "url 6");
    private final Movies seventh = new Movies(7, 2021, "Гнев человеческий", "Боевик", "url 7");
    private final Movies eighth = new Movies(8, 2020, "Джентельмены", "Боевик", "url 8");
    private final Movies ninth = new Movies(9, 2010, "Ходячие мертвецы", "Ужасы", "url 9");
    private final Movies tenth = new Movies(10, 2021, "Майор Гром", "Боевик", "url 10");
    private final Movies eleventh = new Movies(11, 2010, "Пустой", "Пустой", "url 11");

    @Test
    public void shouldGetAllFilmsOverLimit(){
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        Movies[] actual = manager.getAddedFilms();
        Movies[] expected = new Movies[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldFilmsUnderLimit(){
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        Movies[] actual = manager.getAddedFilms();
        Movies[] expected = new Movies[]{fifth, fourth, third, second, first};
        assertArrayEquals(actual, expected);

    }

}


