package Interfaces.CustomExceptions;

public class EmptyQueueException extends RuntimeException{
    public EmptyQueueException(String msg){super(msg);}
}
