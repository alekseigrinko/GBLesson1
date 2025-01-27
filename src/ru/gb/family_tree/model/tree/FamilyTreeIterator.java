package ru.gb.family_tree.model.tree;

import java.util.Iterator;
import java.util.List;

public class FamilyTreeIterator<E> implements Iterator<E>{
    private List<E> elementList;
    private int index;

    public FamilyTreeIterator(List<E> humanList) {
        this.elementList = humanList;
    }

    @Override
    public boolean hasNext() {
        return elementList.size() > index;
    }

    @Override
    public E next() {
        return elementList.get(index++);
    }
}
