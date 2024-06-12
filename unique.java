import java.util.*;
public class unique {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();// The size of the original array or the one with duplicates
        int[] arr=new int[n];// The original array declared
        int uniquecount=0;// The count of unique elements initialised to 0
        int[] uniqueArray=new int[n];// The array to store the unique elements
        //The size of the unique array is declared to n- the size of the 
        //original array, that being the maximum size the unique array could ever get to; to avoid INDEX OUT OF BOUNDS error.

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();// The elements of the original array being initialised
        }
        for(int i=0;i<arr.length;i++)
        {
           boolean isUnique=true;//A Boolean value initialised to true if the element is not repeated.
           //And in the FOR loop- because we need to check the repitition of every element coming up the indexes
           //with every previous indexed element
        
        for(int j=0;j<i;j++)// The latest element
        {
          if(arr[i]==arr[j])// Check if the two elements are same
          {
             isUnique=false;//If they are equal, then "isUnique" becomes false
             break;// Once it is false,stop.
          }
        }
        
        if(isUnique)// If it is unique,i.e., not repeated,
        {
           uniqueArray[uniquecount]=arr[i];//Assign the elements to "uniqueArray" with the size of "uniquecount"
           //Uniquecount is incremented to add the values to the further indexes of the "uniqueArray"
           //The size is uniquecount because that is the no:of elemnts which are not repeated..i.e., unique.
           //Refer to the IF statement just above.
           uniquecount++;
         
        }
        } 
        for(int i=0;i<uniquecount;i++)//Traverse through the uniqueArray and print its elements
        //It is traversed till uniquecount. That is how many elements are present in the UniqueArray. Makes sense,huh?!
        {
            System.out.print(uniqueArray[i]+" ");
        }
        
    }


    
}
