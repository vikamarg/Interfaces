package Interfaces;

import Interfaces.CustomExceptions.EmptyStackException;

public interface Stack {
    public int peek() throws EmptyStackException;
    public int pop() throws EmptyStackException;
    void push(int item);
}
