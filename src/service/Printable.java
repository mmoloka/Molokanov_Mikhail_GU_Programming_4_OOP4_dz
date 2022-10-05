package service;

import data.Computer;

import java.util.List;

public interface Printable <T extends Computer>{

    public  void print(List<T> list);
}
