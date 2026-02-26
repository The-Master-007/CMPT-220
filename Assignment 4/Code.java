public class Main {
 public static void main(String[] args) {
   //Don't let the size of this scare you! no matter how big an array is, it all works the same!
   int[] myArray = {10,3,295,38,20,3,4,267,2445,10,5566,87,93,17,10,2,87,267,3176,3,82};
   //you cannot use the array util. Do this one by hand :(
   // without using arrayLists this dynamically makes sure we don't over/underflow
   int[] dupeArray = new int[myArray.length];
   // to avoid looping through 0's and confusing the code
   int dupes = 0;
   for (int i = 0; i < myArray.length; i++)
   {
       // Make sure not to double count each number as it starts with comparing x == x
       for (int j = i + 1; j < myArray.length; j++)
       {
           if (myArray[i] == myArray[j])
           {
               // We only add them to the list if they arent on it already
               boolean isRecorded = false;
               for (int k = 0; k < dupes; k++)
               {
                   if (dupeArray[k] == myArray[i])
                   {
                       isRecorded = true;
                       break;
                   }
               }
               if (!isRecorded)
               {
                    //System.out.println("This number appears more than once: " + myArray[i]);
                    dupeArray[dupes] = myArray[i];
                    dupes++;
               }
           }
       }
   }
   for (int x = 0; x < dupes; x++)
   {
       System.out.printf("%d appears multiple times in the array\n", dupeArray[x]);
   }
 }
}
/* Honestly after working with python last semester it made me realize how badly java
* handles arrays. This would be a really easy "if in print(x)" in python. I attempted to do 
* #4 but couldn't figure out double counting (I was getting 4,4,2,2, instead of 3,3,2,2)
*/
