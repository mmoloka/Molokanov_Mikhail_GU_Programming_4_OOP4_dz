package controller;

import data.PC;
import service.PCService;

import java.util.List;

public class PCController {

    private PCService pcService;

    public PCController() {

        this.pcService = new PCService();
    }

    public List<PC> getSortedPCById(List<PC> list) {

        return pcService.sort(list);
    }

    public void printInLogPCs(List<PC> list) {
        pcService.print(list);
    }
}
