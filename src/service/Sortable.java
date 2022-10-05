package service;

import data.Computer;
import data.NoteBook;

import java.util.List;

public interface Sortable<T extends Computer> {
    public List<T> sort(List<T> list);
}
