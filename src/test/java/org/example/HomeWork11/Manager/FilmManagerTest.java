package org.example.HomeWork11.Manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {
    FilmManager manager = new FilmManager();

    @Test
    public void addFilms() {

        manager.addFilms("film1");
        manager.addFilms("film2");
        manager.addFilms("film3");
        manager.addFilms("film4");
        manager.addFilms("film5");
        manager.addFilms("film6");
        manager.addFilms("film7");


        String[] expected = {"film1", "film2", "film3", "film4", "film5", "film6", "film7"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void add1Film() {

        manager.addFilms("film1");

        String[] expected = {"film1"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void add0Film() {

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void last5Films() {

        manager.addFilms("film1");
        manager.addFilms("film2");
        manager.addFilms("film3");
        manager.addFilms("film4");
        manager.addFilms("film5");
        manager.addFilms("film6");
        manager.addFilms("film7");

        String[] expected = {"film7", "film6", "film5", "film4", "film3"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void last3Films() {

        manager.addFilms("film1");
        manager.addFilms("film2");
        manager.addFilms("film3");

        String[] expected = {"film3", "film2", "film1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void last0Films() {

        String[] expected = {};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    FilmManager manager1 = new FilmManager(3);

    @Test
    public void test3limitFilms() {

        manager1.addFilms("film1");
        manager1.addFilms("film2");
        manager1.addFilms("film3");
        manager1.addFilms("film4");
        manager1.addFilms("film5");

        String[] expected = {"film5", "film4", "film3"};
        String[] actual = manager1.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
