package controller;

import data.NoteBook;
import service.NotebookService;

import java.util.List;

public class NotebookConrtoller {
    private NotebookService notebookService;

    public NotebookConrtoller(){
        this.notebookService = new NotebookService();
    }

    public List<NoteBook> getSortedByIdNotebook(List<NoteBook> list) {

        return notebookService.sort(list);
    }

    public void printInLogNotebooks(List<NoteBook> list) {

        notebookService.print(list);
    }
}
