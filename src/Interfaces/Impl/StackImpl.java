package Interfaces.Impl;

import Interfaces.DynamicArray;
import Interfaces.Stack;
import Interfaces.CustomExceptions.EmptyStackException ;

/*Last In First Out*/
public class StackImpl implements Stack {

    DynamicArray dynamicArray ;
    private int peekCount;

    public StackImpl(){
        this.dynamicArray = new DynamicArray();
        this.peekCount = 0;
    }

    public int getStackSize(){
       return this.dynamicArray.getCurrentSize();
    }

    @Override
    public int peek() {

        this.peekCount++;
        int lastIndex = dynamicArray.getCurrentSize()- this.peekCount;
        if(dynamicArray.getCurrentSize()==0 || lastIndex<0)
        {
            throw new EmptyStackException("Stack is finished. Peek is forbidden");
        }
        return dynamicArray.getByIndex(lastIndex);
    }

    @Override
    public int pop() {
        if(dynamicArray.getCurrentSize() ==0 )
        {
            throw new EmptyStackException("Stack is empty. Pop is forbidden.\n");
        }
        return dynamicArray.removeIndex(dynamicArray.getCurrentSize()-1) ;
    }

    @Override
    public void push(int item) {
        dynamicArray.addByValue(item);
    }

    public String toString(){ return dynamicArray.toString();}
}
