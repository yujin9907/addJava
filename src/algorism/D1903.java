package algorism;

// 달팽이집
public class D1903 {

    // 미완

    public static void main(String[] args) {
        // 배열 생성
        int[][] arr = new int[5][5];
        // 배열 좌표
        int x=0;
        int y=0;
        int num = 1;
        int width = 5; // 반복 길이
        //int length = 4;

        // 값 반복
        while (num<=25){
            for(int i=0;i<width;i++){
                arr[x][y] = num;
                x++; num++;
            } width--; y++; // 4,1

            for(int i=0;i<width;i++){
                arr[x][y]=num;
                y++; num++; // 4,4
            }x--;

            for(int i=0;i<width;i++){
                arr[x][y]=25;
                x--; num++; //0.4
            } width--; y--;

            for(int i=0;i<width;i++){
                arr[x][y]=25;
                y--; num++; //0.1
            } x++;
        }
    }
}
