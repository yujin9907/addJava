# 컬렉션

https://velog.io/@roberts/%EC%BB%AC%EB%A0%89%EC%85%98-%ED%94%84%EB%A0%88%EC%9E%84%EC%9B%8C%ED%81%AC

컬렉션 프레임워크, 데이터군을 저장하는 클래스들을 표준화한 설계.
<br> 다수의 데이터를 가진 클래스를 표준화된 방식으로 다르게 함 -> 인터페이스와 다형성을 이용한 객체지향 설계를 통해 표준화해주는 컬렉션 프레임워크를 통해 재사용성이 높은 코드를 작성할 수 있도록 함.

* 컬렉션 : 다수의 데이터=데이터그룹
* 프레임워크 : 표준화된 프로그래밍 방식

### 핵심 인터페이스 
1. List : 순서가 있는 데이터의 집합. 데이터 중복 허용
<br>구현 클래스 => ArrayList, LinkedList, Stack, Vector ...
2. Set : 집합 = 순서 x, 중복 x
<br>구현 클래스 => HashSet, TreeSet ...
3. Map : 키와 쌍의 값으로 이루어진 데이터 집합
<br>hashMap, TreeMap, hashTable, Properties ...

> list, set의 공통을 컬렉션 인터페이스로 정의, map은 다른 방식이어서 포함되지 않고 별도로.


