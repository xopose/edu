package org.lazer.resources;

public interface UniInterface<T extends Comparable> {
    T min();
    T max();
}
