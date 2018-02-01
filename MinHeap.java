

/**
 * A Heap implementation class
 * 
 * @param heap the array that holds the heap data
 * @param size the number of elements currently stored in the heap
 */
public class MinHeap 
{
	
	CompareInt[] heap;
	int size;

	/**
	 * Constructs a new heap with maximum capacity n
	 * Remember to index your heap at 1 instead of 0!
	 * @param n the maximum number of elements allowed in the heap
	 */
	public MinHeap(int n) 
	{
		heap = new CompareInt[n+1];
		size = 0;
	}
	
	/**
	 * Adds an element to the heap
	 * 
	 * @param val the value to be added to the heap
	 */
	
	private void sink()
	{
	  int k=1;
	  int leftChild=k*2;
	  int rightChild=k*2+1;
	  CompareInt temp;
	  while(leftChild<=size)
	  {
	    if(leftChild==size)
	    {
	      if(heap[k].compareTo(heap[leftChild])>0)
	      {
  	      temp=heap[k];
  	      heap[k]=heap[leftChild];
  	      heap[leftChild]=temp;
	      }
	      else
	      {
	        break;
	      }
	    }
	    else
	    {
	      if(heap[leftChild].compareTo(heap[rightChild])<0)
	      {
	        if(heap[k].compareTo(heap[leftChild])<0)
	        {
	          break;
	        }
	        else
	        {
  	        temp=heap[k];
  	        heap[k]=heap[leftChild];
  	        heap[leftChild]=temp;
  	        k=leftChild;
  	        leftChild=k*2;
  	        rightChild=k*2+1;
	        }
	      }
	      else
	      {
	        if(heap[k].compareTo(heap[rightChild])<0)
	        {
	          break;
	        }
	        else
	        {
  	        temp=heap[k];
  	        heap[k]=heap[rightChild];
  	        heap[rightChild]=temp;
  	        k=rightChild;
            leftChild=k*2;
            rightChild=k*2+1;
	        }
	      }
	    }
	  }
	}
	
	private void swin()
	{
	  int k=size;
	  int nextK=k/2;
	  while(k>1 && heap[nextK].compareTo(heap[k])>0)
	  {
	    CompareInt temp;
	    temp=heap[nextK];
	    heap[nextK]=heap[k];
	    heap[k]=temp;
	    k=nextK;
	    nextK=k/2;
	  }
	}
	
	public void add(CompareInt val) 
	{
		if(size==heap.length-1)
		{
		  return;
		}
		else
		{
		  size++;
		  heap[size]=val;
		  swin();
		}
	}
	
	/**
	 * Extracts the smallest element from the heap
	 */
	public CompareInt extractMin() 
	{
	  if(size<1)
	  {
	    return null;
	  }
	  else
	  {
  	  CompareInt min=heap[1];
  		heap[1]=heap[size];
  		size--;
  		sink();
  		return min;
	  }
	}
	
}
