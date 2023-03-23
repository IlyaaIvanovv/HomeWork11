package org.example.HomeWork11.Manager;

public class FilmManager {
    private String[] films = new String[0];

    private int limitFilm;

    public FilmManager() {
        this.limitFilm = 5;
    }

    public FilmManager(int limitFilm) {
        this.limitFilm = limitFilm;
    }

    public void addFilms(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int resultLenght;
        if (films.length < limitFilm) {
            resultLenght = films.length;
        } else {
            resultLenght = limitFilm;
        }
        String[] tmp = new String[resultLenght];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}
