package com.springapps.firstapp.beanscopes;

public class Count {
    private Integer counter;

    public Count(Integer counter) {
        this.counter = counter;
    }

    public Integer getCounter() {
        return counter;
    }

    public void setCounter(Integer counter) {
        this.counter = counter;
    }

    public void increment(){
        counter ++;

    }
}
