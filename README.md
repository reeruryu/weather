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



## feedback

1. openapi를 통해서 날씨를 가져오는 부분은 DiaryService에 있기 보다는, 따로 서비스 클래스를 만들어서 처리
2. 서비스 부분은 인터페이스와 구현체를 따로 작성
3. 스케쥴 관련 처리에 있어도, 스케쥴이 호출되는 부분은 따로 클래스로 작성하고, 이곳에서 관련 기능들에 대한 클래스나 함수를 호출해 주도록 처리
4. DiaryService 클래스의 parseWeather 함수 구현에 있어서, get으로 특정 값을 가져오기 전에 키가 존재하는지를 체크하던지, 아니면 가져온 값이 널이 아닌지를 체크하는 방어 로직 필요
5. 사용하지 않는 클래스의 import부분은 정리
