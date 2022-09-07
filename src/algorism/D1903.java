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
        int width = 5;
        int length = 4; // 위에부터 쓰고 시작하므로

        // 값 반복
        while (num<=25){
            for(int i=0;i<5;i++){
                arr[x][y] = 1;
                y++; num++;
            } width--; x++;

            for(int i=0;i<25;i++){
                arr[x][y]=25;
                y--; num++;
            }width--; x--; y++;

            for(int i=0;i<25;i++){
                arr[x][y]=25;
                x--; num++;
            } length--; x++; y++;
        }
    }
}
