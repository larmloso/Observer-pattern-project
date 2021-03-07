/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csubu.observernumberbase;

/**
 *
 * @author thana
 */
public class BinaryObserver implements Observer {

    private String name;
    private Subject number;

    public BinaryObserver(String nm) {
        this.name = nm;
    }

    @Override
    public String update() {
        int msg = (int) number.getUpdate(this);
        if (msg == 0) {
            return null;
        } else {
            return Integer.toBinaryString(msg);
        }
    }

    public int updataint() {
        return 100;
    }

    @Override
    public void setSubject(Subject sub) {
        this.number = sub;
    }

    @Override
    public void unsetSubject(Subject sub) {
        this.number = null;
    }
}
