package service;

import data.Memory;
import data.NoteBook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class NotebookService implements  Sortable<NoteBook>, Printable<NoteBook> {

    @Override
    public List<NoteBook> sort(List<NoteBook> list) {
        Collections.sort(list, new ComputerComparator());
        return list;
    }

    @Override
    public void print(List<NoteBook> list) {
        Logger lg = Logger.getAnonymousLogger();
        lg.info(list.toString());
    }

}
