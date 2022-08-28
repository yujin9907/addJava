package collection;

import javax.imageio.ImageReader;
import javax.print.attribute.HashPrintJobAttributeSet;
import java.util.HashMap;

public class HashMapEx {
    public static void main(String[] args) {

        // 선언
        HashMap<String, Integer> map1 = new HashMap<>();


        map1.put("no1", 1); // 추가
        map1.put("no2", 2); // 추가
        map1.put("no3", 3); // 추가

        map1.remove("no"); // 삭제
        map1.clear(); // 모두 제거

        System.out.println(map1); // 전체 출력
        System.out.println(map1.get(1)); // 특정 key 출력

        // 연속출력시 출력상 문제로 keySet()보다 entrySet().iterator()을 사용하는 게 좋음음
    }
}
