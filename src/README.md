# daliyCoding

### Main23
#### Fibonacci Sequence Algorithm
> <b>기본 재귀풀이
```java
public static int fibonacci(int num) {
    if(num < 2) return num;
    else return fibonacci(num -1) + fibonacci(num -2);
    }
```
<br>

><b> 동적계획법을 사용한 풀이
피보나치 알고리즘에 동적 계획법을 쓰는 이유는 피보나치 알고리즘이 비효율적이기 때문이다. <br>
fibonacci(7)을 구하기 위해서 5와 6을 구해야 하고 이를 구하는 것을 "부분 문제를 푼다" 라고 한다. <br>
fibonacci(7)을 구할때 fibonacci(3)은 5번 등장한다.<br>
이는 n이 커질수록 기하급수적으로 커지게 되고 부분문제가 너무 많이 중복된다는 단점이 있다.<br>
<br>
부분문제의 답을 계산할 캐시의 형태는 문제의 특성에 따라 다양하게 설정할 수 있는데, 이렇게 간단한 문제에서는 1차원 배열이면 충분하다. <br>
```java
public static int fibonacci (int num) {
    if (num < 2) return num;
    else if(memo[num] != 0) return memo[num];
    else return memo[num] = fibonacci(num-1) + fibonacci(num-2);
}
```

-------
