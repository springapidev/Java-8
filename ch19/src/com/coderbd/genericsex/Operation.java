package com.coderbd.genericsex;

import java.util.List;

public interface Operation<E> {

    public E add(List<E> list);

    public E factorial(E num);
}
