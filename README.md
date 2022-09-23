# hanghaeW2
First Assignment of Week 2

# Q1

첫번째 문제는 변수 타입에 관한 문제입니다. 3번제 줄을 보시면, var1/var2 를 var3 라는 double variable 에 저장합니다.

하지만, var1, var2 가 integer type 이기 때문에, var1 을 var2 로 나누면, 그 quotient 밖에 안남습니다. 즉, var3 에는 quotient(5/2) = 2 가 저장이 됩니다.

이를 방지하기 위해선, var1 또는 var2 를 double 로 바꾸면 됩니다. 가장 간편한 방법은 var3 = (double) var1 / var2 가 됩니다.

이렇게 바꾸면, var3 에 2.5 가 입력이 되고, (int) (var3 * var2) 를 하면, 우리가 원하는 5가 stdout 에 나오게 됩니다.


# Q2

두번쨰 문제를 풀기전에 x++ 와 ++x 의 차이를 알아야 합니다. x++ 는 ++ 가 변수 뒤에 있으므로, 먼저 주어진 코드 줄을 실행하고, 그 다음 x 를 increment 합니다.

비슷한 로직으로, ++x 는 ++ 가 앞에 있으므로, 먼저 x 를 increment 하고 연산을 합니다.

이제 Q2 코드를 보면 int z = (++x) + (y--); 가 있습니다. 이 줄에서 변수가 바뀌는건 x 밖에 없습니다. 즉 저 코드는 밑에 코드와 동일합니다.

int z = (x + 1) + y;
x += 1;
y += 1;

그러므로 z 에는 (10 + 1) + 20 인 31 이 실행 됩니다.


# Q3

세번쨰 문제는 Math.random() 함수를 이용해서 [1, 6] 사이에 integer를 구하는게 핵심입니다. 먼저 java.lang.Math libarary 에 있는 random() function 은 [0, 1) 사이에 real number 를 랜덤하게 줍니다. (0 포함, 1 비포함) 즉 Math.random() * 6 을 하면 [0, 6) 사이의 random real number 가 됩니다. (0 포함 6 비포함). 그런데, 여기에서 바로 integer type 으로 반환하면 0 에서 5 사이의 랜덤 integer 가 나옵니다. 그 이유는 자바에서 double/float 를 integer 로 바꾸면, decimal place 를 다 지우기 때문데, (int) 3.2423432 를 하면 3 만 남습니다. 하지면 여기에서 1만 더하면 주사위 roll 값이 나오기 떄문에, 이걸 이용해서 문제를 풀수 있습니다.
