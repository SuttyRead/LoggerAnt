package com.ua.sutty.Logger;

import interfaces.logging.LoggingArrayCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;
import java.util.Iterator;

public class LoggingArrayCollectionImpl<E> extends ArrayCollectionImpl implements LoggingArrayCollection {

    private final Logger LOGGER = LoggerFactory
        .getLogger(LoggingArrayCollectionImpl.class.getName());

    public LoggingArrayCollectionImpl() {
        super();
        LOGGER.trace("Initialize collection without param");
    }

    public LoggingArrayCollectionImpl(int capacity) {
        super(capacity);
        LOGGER.trace("Initialize collection with capacity");
    }

    @Override
    public Logger getLogger() {
        return LOGGER;
    }

    @Override
    public Object[] getArray() {
        LOGGER.trace("Get array with collection");
        return super.getArray();
    }

    @Override
    public void setArray(Object[] objects) {
        try {
            super.setArray(objects);
            LOGGER.trace("Set array in collection");
        } catch (NullPointerException e) {
            LOGGER.error("Flew out NullPointerException");
            throw new NullPointerException();
        }
    }

    @Override
    public int size() {
        LOGGER.trace("Get size collection");
        return super.size();
    }

    @Override
    public boolean isEmpty() {
        LOGGER.trace("Check on empty");
        return super.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        LOGGER.trace("Check on contains");
        return super.contains(o);
    }

    @Override
    public Iterator iterator() {
        LOGGER.trace("Get iterator");
        return super.iterator();
    }

    @Override
    public Object[] toArray() {
        LOGGER.trace("Lead collection to array");
        return super.toArray();
    }

    @Override
    public boolean add(Object o) {
        LOGGER.trace("Add object in collection");
        return super.add(o);
    }

    @Override
    public boolean remove(Object o) {
        LOGGER.trace("Remove object with collection");
        return super.remove(o);
    }

    @Override
    public boolean addAll(Collection c) {

        try {
            LOGGER.trace("Add all element with first collection to second collection");
            return super.addAll(c);
        } catch (IllegalArgumentException e) {
            LOGGER.error("This is the same collection");
        }
        return false;
    }

    @Override
    public void clear() {
        LOGGER.trace("Clear collection");
        super.clear();
    }

    @Override
    public boolean retainAll(Collection c) {
        try {
            super.retainAll(c);
            LOGGER.trace("Retain all collection");
        } catch (NullPointerException e) {
            LOGGER.error("String == null, null pointer exception");
        }
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        try {
            super.removeAll(c);
            LOGGER.trace("Remove all object with collection");
        } catch (NullPointerException e) {
            LOGGER.error("String == null, null pointer exception");
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        try {
            super.containsAll(c);
            LOGGER.trace("Contains all element two collection");
        } catch (NullPointerException e) {
            LOGGER.error("String == null, null pointer exception");
        }
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return super.toArray();
    }
}
