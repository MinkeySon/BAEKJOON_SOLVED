## [Silver V] 집합
[문제 링크](https://www.acmicpc.net/problem/11723) 

## 성능 요약
> 메모리: 307456 KB, 시간: 1200 ms

## 분류
- 구현
- 비트마스킹

### 제출 일자
2024년 10월 24일

### 문제
비어있는 공집합 S가 주어졌을 때, 아래 연산을 수행하는 프로그램을 작성하시오.

- add x: S에 x를 추가한다. (1 ≤ x ≤ 20) S에 x가 이미 있는 경우에는 연산을 무시한다.
- remove x: S에서 x를 제거한다. (1 ≤ x ≤ 20) S에 x가 없는 경우에는 연산을 무시한다.
- check x: S에 x가 있으면 1을, 없으면 0을 출력한다. (1 ≤ x ≤ 20)
- toggle x: S에 x가 있으면 x를 제거하고, 없으면 x를 추가한다. (1 ≤ x ≤ 20)
- all: S를 {1, 2, ..., 20} 으로 바꾼다.
- empty: S를 공집합으로 바꾼다.

### 입력
첫째 줄에 수행해야 하는 연산의 수 M (1 ≤ M ≤ 3,000,000)이 주어진다.

둘째 줄부터 M개의 줄에 수행해야 하는 연산이 한 줄에 하나씩 주어진다.

```
26
add 1
add 2
check 1
check 2
check 3
remove 2
check 1
check 2
toggle 3
check 1
check 2
check 3
check 4
all
check 10
check 20
toggle 10
remove 20
check 10
check 20
empty
check 1
toggle 1
check 1
toggle 1
check 1
```

### 출력
check 연산이 주어질때마다, 결과를 출력한다.
```
1
1
0
1
0
1
0
1
0
1
1
0
0
0
1
0
```

### 구현 과정
- [x] static 리스트 생성
- [x] 개별 static 메서드 생성 
  - add => ArrayList.contains() 로 확인 후 추가 없으면 return;
  - remove => ArrayList.contains() 로 확인 후 삭제 없으면 return;
  - check => ArrayList.contains() 로 확인 후 출력
  - toggle => ArrayList.contains() 로 확인 후 있으면 remove() 없으면 add()
  - all => ArrayList 인스턴스 재부여
  - empty => ArrayList.clear()
- [x] M번 반복
- [x] 입력 받은 메서드 호출