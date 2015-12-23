import java.util.*;
class cocktail {

	public static void main(String[] args) {
        
        int[] tab = {5,9,4,1,2,7,3,8,6,0};
        
        boolean swap = false;
        int j = tab.length-1;
        int lastSwapRight = -1;
        int lastSwapLeft = -1;
        int i = 0;
        
        do {
            swap = false;
           
            while (i<j) {
                
                if (tab[i]>tab[i+1]) {
                    int x = tab[i];
                    tab[i] = tab[i+1];
                    tab[i+1] = x;
                    swap = true;                   
                }
                lastSwapRight = i;
            }
            
            j = lastSwapRight;
            
            while (j>i) {
                
                if (tab[j]<tab[j-1]) {
                    int x = tab[j];
                    tab[j] = tab[j-1];
                    tab[j-1] = x;
                    swap = true;
                }
                lastSwapLeft = j;
            }
            
            i = lastSwapLeft;

            
        } while (swap == true);
        System.out.println(Arrays.toString(tab));
    }
}
