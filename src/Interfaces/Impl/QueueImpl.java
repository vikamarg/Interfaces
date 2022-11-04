package Interfaces.Impl;

import Interfaces.CustomExceptions.EmptyQueueException;
import Interfaces.CustomExceptions.EmptyStackException;
import Interfaces.DynamicArray;
import Interfaces.Queue;

public class QueueImpl implements Queue {
    DynamicArray dynamicArray ;
    private int peekCount;

    public QueueImpl(){
        this.dynamicArray = new DynamicArray();
        this.peekCount = 0;
    }

    public int getQueueSize(){
        return this.dynamicArray.getCurrentSize();
    }

    @Override
    public boolean add(Integer e) {
        dynamicArray.addByValue(e);
        return true;
    }

    @Override
    public Integer pop() {
        if(dynamicArray.getCurrentSize() ==0 )
        {
            throw new EmptyQueueException("Queue is empty. Pop is forbidden.\n");
        }
        return dynamicArray.removeIndex(0);
    }

    @Override
    public Integer peek() {

        if(this.dynamicArray.getCurrentSize() ==0 ||  this.peekCount >= this.dynamicArray.getCurrentSize())
        {
            throw new EmptyQueueException("Queue is over. Peek is forbidden");
        }
        int returnValue = dynamicArray.getByIndex(peekCount) ;
        peekCount++;
        return returnValue;
    }

    public String toString(){ return dynamicArray.toString();}
}
