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

    public List<NoteBook> methodFindAndWriteFilteringValue(List<NoteBook> list, String field, String value) { // данный метод выводит отфильтрованные строки
        List<NoteBook> fList = new ArrayList<>();
        for (NoteBook notebook : list) {
            switch (field) {
                case "id":
                    if (notebook.getId().equals(value)) {
                        fList.add(notebook);
                    }
                    break;

                case "model":
                    if (notebook.getModel().equals(value)) {
                        fList.add(notebook);
                    }
                    break;

                case "memory":
                    if (notebook.getMemory().equals(Memory.valueOf(value))) {
                        fList.add(notebook);
                    }
                    break;


                case "ssd":
                    if (notebook.getSsd().equals(value)) {
                        fList.add(notebook);
                    }
                    break;

                case "batteryCapacity":
                    if(notebook.getBatteryCapacity().equals(Integer.valueOf((value)))) {
                        fList.add(notebook);
                    }
            }
        }

        return fList;
    }

}
