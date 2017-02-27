package com.mkyong.common;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "viewScopedCounterBean")
@ViewScoped
public class ViewScopedCounterBean implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int count;
    
    @PostConstruct
    public void init(){
        count = 0;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    public void countUp(){
        count++;
    }
}