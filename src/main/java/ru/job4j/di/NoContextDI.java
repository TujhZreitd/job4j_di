package ru.job4j.di;

import ru.job4j.di.model.StartUI;
import ru.job4j.di.model.Store;

public class NoContextDI {
    public static void main(String[] args) {
        Store store = new Store();
        StartUI ui = new StartUI(store);
        ui.add("Egor Yakushev");
        ui.add("Ivan Ivanov");
        ui.print();
    }
}
