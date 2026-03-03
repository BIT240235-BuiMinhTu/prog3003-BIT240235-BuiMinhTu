package com.cmc.btgkb1;

import java.util.ArrayList;
import java.util.List;

public class GenericStudentManager<T> {

    private final List<T> data;

    public GenericStudentManager() {
        data = new ArrayList<>();
    }
        
        
    public void add(T item) {
        data.add(item);
    }

    public List<T> getAll() {
        return data;
    }
  }
