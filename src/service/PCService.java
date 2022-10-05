package service;

import data.NoteBook;
import data.PC;

import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class PCService implements Sortable<PC>, Printable<PC> {
    @Override
    public void print(List<PC> list) {
        Logger lg = Logger.getAnonymousLogger();
        lg.info(list.toString());
    }

    @Override
    public List<PC> sort(List<PC> list) {
        Collections.sort(list, new ComputerComparator());
        return list;
    }
}
