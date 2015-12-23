import java.util.*;
class cocktail {

	public static void main(String[] args) {
        
        int[] tab = {5,9,4,1,2,7,3,8,6,0};
        
        boolean swap = false;
        
        do {
            swap = false;
            for (int i= 0; i<tab.length-1; i++) {
                if (tab[i]>tab[i+1]) {
                    int x = tab[i];
                    tab[i] = tab[i+1];
                    tab[i+1] = x;
                    swap = true;
                }
            }
        } while (swap == true);
        System.out.println(Arrays.toString(tab));
    }
}
