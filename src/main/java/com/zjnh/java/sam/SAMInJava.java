package com.zjnh.java.sam;

import java.util.ArrayList;

public class SAMInJava {

    private ArrayList<Runnable> runnables=new ArrayList<>();

    public void addTask(Runnable runnable){
        runnables.add(runnable);
        System.out.println("add "+runnable+", total="+runnables.size());
    }

    public void removeTask(Runnable runnable){
        runnables.remove(runnable);
        System.out.println("remove "+runnable+", total="+runnables.size());
    }

}
