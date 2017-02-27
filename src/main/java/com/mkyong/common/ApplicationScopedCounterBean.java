package com.mkyong.common;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "applicationScopedCounterBean")
@ApplicationScoped
public class ApplicationScopedCounterBean implements Serializable{

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