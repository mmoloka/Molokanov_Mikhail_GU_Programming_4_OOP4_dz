import controller.NotebookConrtoller;
import controller.PCController;
import data.Memory;
import data.NoteBook;
import data.PC;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        NoteBook n1 = new NoteBook("14", "Air", Memory.ONE, "256", 1000);
        NoteBook n2 = new NoteBook("2", "MagicBook", Memory.SIXTEEN, "512", 1200);
        NoteBook n3 = new NoteBook("3", "Asus", Memory.TWO, "512", 1100);

        ArrayList<NoteBook> al = new ArrayList<>();
        al.add(n1);
        al.add(n2);
        al.add(n3);

        PC p1 = new PC("12", "HP", Memory.FOUR, "1024", 300);
        PC p2 = new PC("1", "Dell", Memory.SIXTEEN, "1024", 500);
        PC p3 = new PC("24", "Irbis", Memory.TWO, "512", 450);

        ArrayList<PC> pc = new ArrayList<>();
        pc.add(p1);
        pc.add(p2);
        pc.add(p3);

        NotebookConrtoller controller = new NotebookConrtoller();
        PCController pcController = new PCController();

        controller.printInLogNotebooks(controller.getFilteredNotebookList(al, "id", "2"));
        pcController.printInLogPCs(pcController.getFilteredPCList(pc, "powerSupply", "450"));

    }
}