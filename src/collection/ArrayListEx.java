package collection;

// list 인터페이스 상속
// 배열 기반
// 동적

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        // 선언
        List<Integer> list = new ArrayList<>();

        // 데이터 추가
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        System.out.println(list.size()); // 크기
        System.out.println(list.get(2)); // 특정 인덱스 값 얻기
        list.remove(1); // 삭제
        list.add(1, 1); // 특정 인덱스에 추가
        list.clear(); // 리스트 삭제
    }
}
