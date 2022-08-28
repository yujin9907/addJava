package generic;


import java.util.ArrayList;

public class GenericEx01 {
//    다양한 타입의 객체를 다루는 메서드, 컬렉션 클래스에 컴파일시
//    타입체크를 해주는 기능: 타입의 안정성 제공, 타입체크와 형변환 생략 가능
}

// 제네릭 클래스 선언
class Box<T> {
// T : 타입변수, 타입 매개변수,
// Box : 원시타입
}

// 제네릭 클래스의 사용
class Box2<T>{
    ArrayList<T> list = new ArrayList<>();
    // 제너릭 리스트의 추가
    void add(T item) {
        list.add(item);
    }
    // 조회
    T get(int i){
        return list.get(i);
    }
    // 리스트의 크기
    int size(){
        return list.size();
    }
}


// 타입 제한
class FruitBox<T extends Box> {
    ArrayList<T> list = new ArrayList<>();
    // extends를 통해 특정 타입의 자손만 대입할 수 있도록
}