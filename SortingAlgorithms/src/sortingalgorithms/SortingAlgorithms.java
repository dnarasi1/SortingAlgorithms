
public class SortingAlgorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int unsorted[] = {98,34,56,23,65};
        //SelectionSort select = new SelectionSort();
        //BubbleSort bub = new BubbleSort();
        InsertionSort ins = new InsertionSort();
        ins.insert(unsorted, unsorted.length);
        //bub.bubble(unsorted, unsorted.length);
        //select.selection(unsorted, unsorted.length);
        for(int i =0; i<unsorted.length;i++){
            System.out.println(unsorted[i]);
        }
    }
    
}
