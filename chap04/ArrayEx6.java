package chap04;

//최대와 최소
public class ArrayEx6 {
    public static void main(String[] args) {
        int [] score = {77, 89, 91, 33, 100, 55, 95};

        int max = score[0];
        int min = score[0];

        for (int i = 0; i < score.length; i++) {
            if(score[i] > max)
                max = score[i];
            else if(score[i]<min)
                min = score[i];
        }  //end for

        System.out.println("최댓값 : " + max);
        System.out.println("최솟값 : " + min);

    }  // end main method
}  //end Class
