# weather

날씨 일기 프로젝트



## 활용 기술

- Spring boot 2.7.7 (JDK1.8)
- Gradle
- Mysql
- JPA
- Swagger



## 구현된 기능

1. 매일 새벽 1시에 날씨 데이터를 외부 API(Open Weather Map)에서 받아 DB에 저장
2. DB와 관련된 함수들을 트랜잭션 처리
3. logback 을 이용하여 프로젝트에 로그를 남기기
4. ExceptionHandler 을 이용한 예외처리
5. swagger 을 이용하여 API documentation 생성



## API 문서

![image](https://user-images.githubusercontent.com/87798704/210480844-0fab1e92-2fe8-4850-a56f-abf321614f29.png)
