package com.mkyong.common;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "requestScopedCounterBean")
@RequestScoped
public class RequestScopedCounterBean implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int count;
    
    @PostConstruct
    public void init(){
    	 
    	this.log("init");
        count = 0;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    public void countUp(){
    	this.log("countUp");
        count++;
    }
    
    private void log(String tag) {
        System.out.println(tag + " hash:" + this.hashCode());
    }

}