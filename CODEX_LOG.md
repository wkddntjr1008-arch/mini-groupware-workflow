# CODEX_LOG

## 2026-06-18

### 오늘 한 작업

- Spring Boot 기반 `mini-groupware-workflow` 프로젝트의 초기 구조를 설계했다.
- 패키지명을 `com.wooseok.minigroupware`로 정리했다.
- `war` 패키징 기준으로 프로젝트를 구성했다.
- `Spring Security`는 이번 단계에서 제외했다.
- `MyBatisConfig.java` 없이 진행할 수 있도록 `@Mapper` 기반 매퍼 구성을 사용했다.
- `application.yml` 중심으로 JSP 뷰 경로와 MariaDB 연결 설정을 잡았다.
- `team` 도메인만 먼저 구현했다.
- `Team` 도메인의 `Mapper`, `Service`, `Controller`, JSP 화면을 생성했다.
- JDK 17을 설치하고, Maven도 별도 설치해서 빌드 환경을 맞췄다.
- MariaDB를 설치하고 `mini_groupware` 데이터베이스와 `team` 테이블을 생성했다.
- 실제 서버 실행과 JSP 응답 확인까지 완료했다.
- 이후 요청에 따라 서버와 MariaDB를 정상 종료했고, 포트가 닫혔는지 확인했다.

### 학습 메모

- JSP를 사용할 때는 `war` 구성이 자연스럽다.
- MyBatis는 `Mapper` 인터페이스와 XML SQL 파일을 분리해서 관리한다.
- `application.yml`은 실행 환경 설정을 한곳에 모으는 역할을 한다.
- `TeamController`는 요청과 화면 이동만 담당하고, 실제 DB 처리는 Service와 Mapper가 담당한다.
- `team` 등록/조회는 현재 프로젝트에서 가장 작은 동작 단위의 예제이다.
