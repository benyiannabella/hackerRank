package heckerRank;

public class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements){
        this.elements = elements;
    }

    public void computeDifference(){
        int temp = 0;
        for(int i = 0; i < elements.length; i++){
            for(int j = i+1; j < elements.length; j++){
                temp = Math.abs(elements[i] - elements[j]);
                if(temp > maximumDifference){
                    maximumDifference = temp;
                }

            }
        }
    }

    public static void main(String[] args) {
        Difference difference = new Difference(new int[]{1, 2, 5});

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
