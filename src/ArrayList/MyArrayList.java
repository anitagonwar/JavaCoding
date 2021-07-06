package ArrayList;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
 
public class MyArrayList<T> implements Iterable<T> {
	private static final int DEFAULT_CAPACITY = 10;//Specify the default size as 10
	private static final Object[] EMPTY_ELEMENTDATA = {};//Shared empty array instance for empty instance.
	public transient T[] elementData;//The underlying generic array is used to store elements
	public int size;//Number of record elements

	//---------------Constructors------------------------------------------
	//Constructor with an empty list with the specified initial capacity
	@SuppressWarnings("unchecked")
	public MyArrayList(int initialCapacity) {
		if (initialCapacity > 0) {
			this.elementData = (T[]) new Object[initialCapacity];
			this.size = 0;
		} else if (initialCapacity == 0) {
			this.elementData = (T[]) EMPTY_ELEMENTDATA;
		} else {
			throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
		}
	}
 
	//Construct an empty list with an initial capacity of 10.
	@SuppressWarnings("unchecked")
	public MyArrayList() {
		this.elementData = (T[]) new Object[10];
	}
 
    //Construct a list that contains the elements of the specified collection, the order of which is returned by the iterator of the collection.
    @SuppressWarnings("unchecked")
	public MyArrayList(Collection<Object> c) {
    	elementData = (T[]) c.toArray();//Convert the collection to an array, the array capacity is the number of collection elements
    	if ((size = elementData.length) != 0) {//The number of array elements at this time is equal to the array capacity
    		elementData = (T[]) Arrays.copyOf(elementData, size, Object[].class);
    	}
    }
    
    //Adjust the capacity of the underlying array to fit the current number of elements, 
    //avoiding too many empty elements and wasting memory. size is the actual number of elements in the array
    public void trimToSize() {
        int cur = elementData.length;
        if (size < cur) {
            elementData = Arrays.copyOf(elementData, size);
        }
    }
 
    //Realize capacity expansion
    public void ensureCapacity(int newCapacity) {
        int cur = elementData.length;
        if (newCapacity > cur) {
            elementData = Arrays.copyOf(elementData, newCapacity);
        }
    }
 
    public void RangeCheck(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
    }
 
    public int size() {
        return size;
    }
 
    public boolean isEmpty() {
        return size == 0;
    }
 
    /*
     * Returns the index of the first matching item of the specified element in this list, 
     * if this list does not contain the element, it returns -1
     */
    public int indexof(Object obj) {
        if (obj == null) {
            for (int i = 0; i < size; i++) {
                if (elementData[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (obj.equals(elementData[i])) {
                    return i;
                }
            }
        }
        return -1;
    }
 
    /*
     * Determine whether this list contains the element you want to find. 
     * If yes, return true if not, then return false
     */
    public boolean Contains(Object obj) {
        return indexof(obj) >= 0;
    }
 
    //Get the value of the element at the specified position
    public T get(int index) {
        RangeCheck(index);
 
        return elementData[index];
    }
 
    //Modify the element at the specified position
    public void set(int index, T newElement) {
        RangeCheck(index);
 
        elementData[index] = newElement;
    }
 
    //Convert to ordinary array
    public T[] toArray() {
        @SuppressWarnings("unchecked")
		T[] a = (T[]) new Object[size];
        System.arraycopy(elementData, 0, a, 0, size);
        return a;
    }
 
    //Empty the linked list
    public void clear() {
        for (int i = 0; i < size; i++) {
            elementData[i] = null;
        }
        size = 0;
    }
 
    //Add an element at the specified position
    public void add(int index, T element) {
        RangeCheck(index);
        //Check whether the number of elements in the current array has reached the maximum value,
        //that is, the capacity of the array is reached, if yes, expand the array
        if (size == elementData.length) {
            ensureCapacity(elementData.length * 2 + 1);
        }
        //Move the original data at the insertion position and the subsequent
        //data one bit to the right to make room
        System.arraycopy(elementData, index, elementData, index + 1, size - index);

        elementData[index] = element;
        size++;
    }
 
 
    //Append an element to the end of the list
    public boolean add(T element) {
        if (size == elementData.length) {
            ensureCapacity(elementData.length * 2 + 1);
        }
        elementData[size++] = element;
        return true;
    }
 
    //Insert a collection into a certain position in the list
    public void addAll(int index, Collection<? extends T> c) {
        RangeCheck(index);//Check whether it is out of range first
 
        //Get the inserted elements and the number
        @SuppressWarnings("unchecked")
		T[] a = (T[]) c.toArray();
        int numNewlength = a.length;
 
        //Expand the capacity of the array
        ensureCapacity(size + numNewlength);
 
        //Calculate the insertion position and the number of elements after it,
        //that is: the number of elements that need to be shifted right
        int numMoved = size - index;
        //Move the elements in the index~size range of the original array to make room
        if (numMoved > 0) {
            System.arraycopy(elementData, index, elementData, index + numNewlength,
                    numMoved);
        }
        //Copy the inserted array element to the position vacated in the elementData array
        System.arraycopy(a, 0, elementData, index, numNewlength);
                 size += numNewlength;//The number of elements also increases
    }
 
 
    //Delete the element at the specified position
    public T Remove(int index) {
        RangeCheck(index);
 
        T oldelement = elementData[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
        	//Move the element behind the original position to the left
        	System.arraycopy(elementData, index + 1, elementData, index, numMoved);
        }
        elementData[--size] = null;//Modify the last element position of the original array to be empty, and the number of elements is reduced accordingly
        return oldelement;
    }
 
    private void fastRemove(int index) {
        int numMoved = size - index - 1;
        if (numMoved > 0)
            System.arraycopy(elementData, index + 1, elementData, index, numMoved);
        elementData[--size] = null;
    }
 
    //Remove the first match of the specified element from this list.
    public boolean Remove(Object obj) {
        if (obj == null) {
            for (int index = 0; index < size; index++) {
                if (elementData[index] == null) {
                    fastRemove(index);
                    return true;
                }
            }
        } else {
            for (int index = 0; index < size; index++) {
                if (obj.equals(elementData[index])) {
                    fastRemove(index);
                    return true;
                }
            }
        }
        return false;
    }
 
    //Remove elements in a certain range (not including end)
    public void removeRange(int start, int end) {
        int NumMoved = size - end;
 
        //Move left element after end
        System.arraycopy(elementData, end, elementData, start, NumMoved);
 
        int newSize = size - (end - start);
        //Modify the position left by the left shift to be empty
        for (int i = newSize; i < size; i++) {
            elementData[i] = null;
        }
        size = newSize;
    }
 

    /*
     * Implement iterator
     */
    //Overwrite the construction method of Iterator
    @Override
    public Iterator<T> iterator() {
        return new ArrayListIterator();
    }
    /*
     * Override the next(), hasNext() and remove methods of Iterator
     */
    private class ArrayListIterator implements Iterator<T> {
        private int cur = 0;
 
        @Override
        public boolean hasNext() {
            return cur < size();
        }
 
        @Override
        public T next() {
            return elementData[cur++];
        }
 
        @Override
        public void remove() {
            MyArrayList.this.Remove(--cur);
 
        }
        
        @SuppressWarnings("unused")
		public void reset() {
            cur  = 0;
        }
    }
}

