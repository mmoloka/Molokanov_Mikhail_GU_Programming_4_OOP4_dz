package service;

import data.Memory;
import data.NoteBook;
import data.PC;

import java.util.ArrayList;
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

    public List<PC> methodFindAndWriteFilteringValue(List<PC> list, String field, String value) { // данный метод выводит отфильтрованные строки
        List<PC> fList = new ArrayList<>();
        for (PC pc : list) {
            switch (field) {
                case "id":
                    if (pc.getId().equals(value)) {
                        fList.add(pc);
                    }
                    break;

                case "model":
                    if (pc.getModel().equals(value)) {
                        fList.add(pc);
                    }
                    break;

                case "memory":
                    if (pc.getMemory().equals(Memory.valueOf(value))) {
                        fList.add(pc);
                    }
                    break;


                case "ssd":
                    if (pc.getSsd().equals(value)) {
                        fList.add(pc);
                    }
                    break;

                case "powerSupply":
                    if(pc.getPowerSupply().equals(Integer.valueOf((value)))) {
                        fList.add(pc);
                    }


            }
        }

        return fList;
    }
}
