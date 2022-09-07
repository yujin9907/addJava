package algorism;

// 소인수분해

public class D2001 {

    int num = 12; // 대상 숫자
    int count = 0; // 대상숫자의 소인수 갯수(나눠지면 +)

    for(int i=2; i<num ; i++){
        for(int j=1;j<i;j++){
            if(i%j==0){
                count++;
            }
        }
        if(count<2){
            System.out.println(j);
        }
    }
}
