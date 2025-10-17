import java.util.*;
// Node class
 
// Linked List cl
// Main function to test
public class prac {
    public static void main(String[] args) {
         int num[]={1,2,5,0,4};
         int i=0,j=1,k=0,second=0;
         for(j=1;j<num.length;j++){
            if(num[j]>num[i]){
                second=j;
                i=j;
            }
            else if(num[i]>second && num[i]!=i){
                second=num[i];

            }
         }
         System.out.println(second);
         }

         
     }