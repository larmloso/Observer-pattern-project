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
public interface Observer {

    //method to update the observer, used by subject
    public String update();

    //attach with subject to observe
    public void setSubject(Subject sub);
    public void unsetSubject(Subject sub);
    


}
