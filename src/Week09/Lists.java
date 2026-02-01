package Week09;

interface IList {
    int indexOf(int[] arr, int item);

}

class Matrix implements IList{


    @Override
    public int indexOf(int[] arr, int item) {
        return 0;
    }
}



public class Lists implements IList{


    @Override
    public int indexOf(int[] arr, int item) {
        return 0;
    }
}
