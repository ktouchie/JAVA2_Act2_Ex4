import java.util.*;
class cocktail {

	public static void main(String[] args) {
        
        int[] tab = {5,9,4,1,2,7,3,8,6,0};
        
        boolean swap = false;
        int lastSwapLeft = 0;
        int lastSwapRight = tab.length-1;
        int currentSwap = -1;
        
        do {
            swap = false;
            for (int i= 0; i<lastSwapRight; i++) {
                if (tab[i]>tab[i+1]) {
                    int x = tab[i];
                    tab[i] = tab[i+1];
                    tab[i+1] = x;
                    swap = true;
                    currentSwap = i+1;
                }
            }
            lastSwapRight = currentSwap;
            
            for (int j=lastSwapRight-1; j>lastSwapLeft; j--) {
                if (tab[j]<tab[j-1]) {
                    int y = tab[j];
                    tab[j] = tab[j-1];
                    tab[j-1] = y;
                    swap = true;
                    currentSwap = j-1;
                }
            }
            lastSwapLeft = currentSwap;
            
        } while (swap == true);
        System.out.println(Arrays.toString(tab));
    }
}
