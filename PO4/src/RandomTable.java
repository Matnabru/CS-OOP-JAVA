public class RandomTable {
    private int[] tab;

    public RandomTable(int n){
        tab = new int[n];
    }
    public void fill(){
        for(int i=0;i< tab.length;i++){
            this.tab[i] = getRandomNumber(1,1000001);
        }
    }
    public void show(){
        for(int i=0;i< tab.length;i++){
            System.out.print(tab[i]+ " ");
        }
        System.out.print("\n");
    }
    private int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    public void optimizedAbundance(RandomTable x){
        int[] tab = new int[x.tab.length+this.tab.length];
        int i=0;
        int numeration=0;
        // Merge 2 tables into 1
        for(;i<x.tab.length;i++){
            tab[i] = x.tab[i];
        }
        for(int a=0;i<x.tab.length+this.tab.length;i++,a++){
            tab[i] = this.tab[a];
        }

        bubbleSort(tab, tab.length);
        for(int j=0;j<tab.length-1;j++){
            //System.out.print(tab[j] + " ");
            numeration++;
            if(tab[j]!=tab[j+1]){
                System.out.println(tab[j] + " - " + numeration);
                if(numeration==1||numeration==2){
                    throw new IllegalArgumentException("Only 1 or 2 the same elements in array!");
                }
                numeration=0;
            }if(j==tab.length-2){
                System.out.println(tab[j+1] + " - " + (numeration+1));
                numeration=0;
            }
        }
    }
    // An optimized version of Bubble Sort
    static void bubbleSort(int arr[], int n)
    {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++)
        {
            swapped = false;
            for (j = 0; j < n - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    // swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // IF no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
    }

}
