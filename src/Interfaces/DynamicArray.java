package Interfaces;

public class DynamicArray {
    private Integer[] array= new Integer[6];
    private int currentSize = 0;

    public int getCurrentSize(){return  this.currentSize;}

    public int getByIndex(int index){
        return  array[index];
    }

    public void addByValue(int val){
        if(this.currentSize == array.length)
        {
            this.scaleArray();
        }
        array[currentSize] = val;
        currentSize++;
    }

    public void removeByValue(int value)
    {
        int delta = 0;
        Integer tempArray[] = new Integer[array.length];
        for (int i=0 ; i< currentSize; i++)
        {
            if(array[i] == value)
            {
                delta++;
                continue;
            }
            else
                tempArray[i-delta] = array[i];
        }
        currentSize-= delta;
        array = tempArray;
    }

    public void addIndex(int index, int value)
    {
        Integer tempArray[] = new Integer[array.length];
        for(int i=0; i<currentSize ; i++ )
        {
            if(i==index)
            {
                tempArray[i]= value;
            }
            else if ( i>index)
            {
                tempArray[i] = array[i-1];
            } else
            {
                tempArray[i] = array[i];
            }
        }
        currentSize++;
        array = tempArray ;
    }

    public int removeIndex(int index)
    {
        if(index>currentSize)
        {
            throw new ArrayIndexOutOfBoundsException("This index is out of bounds");
        }
        Integer tempArray[] = new Integer[array.length];
        for (int i=0 ; i< currentSize; i++)
        {
            if(i>=index)
            {
                tempArray[i] = array[i+1];
            }
            else
                tempArray[i] = array[i];
        }
        currentSize--;
        int removedValue =  this.array[index] ;
        array = tempArray;
        return removedValue;
    }

    private void scaleArray()
    {
        Integer tempArray[] = new Integer[this.array.length*2];
        for(int i=0 ; i< array.length; i++)
        {
            tempArray[i] = array[i];
        }
        array = tempArray;
    }

    @Override
    public String toString()
    {
        String string="";
        for (int i=0; i<currentSize; i++)
        {
            string += array[i]+ "  ";
        }
        return string ;
    }
}
