package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;

public class Bag<T> implements Container<T>{


    ArrayList<T> container = new ArrayList<>();
    private int i = 0;

    @Override
    public boolean isEmpty() {
        return i == 0;
    }

    @Override
    public int size() {
        return i;
    }

    @Override
    public void add(T item) {
        container.add(item);
        i++;
    }

    @Override
    public Iterator<T> iterator() {
        return container.iterator();
    }
}

