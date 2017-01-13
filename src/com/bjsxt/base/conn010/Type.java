package com.bjsxt.base.conn010;

import java.util.Comparator;
import java.util.Queue;

/**
 * Created by Administrator on 2017/1/12.
 */
public class Type implements Comparable<Type>{


    private int id;
    private String name;

    @Override
    public String toString() {
        return "Type{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    public Type(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int compareTo(Type o2) {
        return this.id > o2.getId() ? 1 : (this.id < o2.getId() ? -1 : 0);
    }
}
