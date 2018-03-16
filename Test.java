import static java.lang.System.out;

import java.util.Arrays;
import java.lang.Math;

public class Test
{
  public static void main(String[] args)
  {
//    MinHeap heap=new MinHeap(10);
//    CompareInt one=new CompareInt(1);
//    CompareInt two=new CompareInt(2);
//    CompareInt eight=new CompareInt(8);
//    CompareInt four=new CompareInt(4);
//    CompareInt three=new CompareInt(3);
//    heap.add(one);
//    heap.add(two);
//    heap.add(eight);
//    heap.add(four);
//    heap.add(three);
//    out.println(heap.extractMin().val);
//    out.println(heap.extractMin().val);
//    out.println(heap.extractMin().val);
//    out.println(heap.extractMin().val);
//    out.println(heap.extractMin().val);
    
    CompareInt[] arr=new CompareInt[5];
    CompareInt one=new CompareInt(1);
    CompareInt seven=new CompareInt(7);
    CompareInt twelve=new CompareInt(12);
    CompareInt five=new CompareInt(5);
    CompareInt twenty=new CompareInt(20);
    arr[0]=one;
    arr[1]=seven;
    arr[2]=twelve;
    arr[3]=five;
    arr[4]=twenty;
//    
//    Sorting.mergeSort(arr);
//    for(int i=0; i<=4; ++i)
//    {
//      out.println(arr[i].val);
//    }
    
//    CompareInt[] arr2=new CompareInt[5];
//    CompareInt two=new CompareInt(2);
//    CompareInt six=new CompareInt(6);
//    CompareInt sixteen=new CompareInt(16);
//    CompareInt eighteen=new CompareInt(18);
//    CompareInt twentytwo=new CompareInt(600);
//    arr2[0]=two;
//    arr2[1]=six;
//    arr2[2]=sixteen;
//    arr2[3]=eighteen;
//    arr2[4]=twentytwo;

    out.println(Sorting.quickSelect(5, arr).val);
  }
}
