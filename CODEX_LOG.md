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
## 2026-06-20

### 오늘 한 일

- `application.yml`에서 MariaDB 접속 정보를 분리했다.
- 로컬 전용 `application-local.yml`을 만들었다.
- `.gitignore`에 `application-local.yml`을 추가했다.
- 공통 설정과 로컬 비밀값을 나눠서 GitHub 노출 위험을 줄였다.
- 처음에는 실행 명령으로 `local` 프로필을 넣는 방식으로 설명했으나, 이후 요청에 맞춰 `application.yml`에 기본 프로필을 두는 방식으로 변경했다.
- `spring.profiles.active: local`을 `application.yml`에 넣어, 실행 명령에 프로필을 반복 입력하지 않아도 로컬 설정이 자동으로 적용되게 했다.

### 왜 이렇게 했는가

- DB 계정과 비밀번호를 GitHub에 올리지 않기 위해서다.
- 공통 설정과 환경별 설정을 분리하면 나중에 STS나 다른 PC에서도 관리가 쉽다.
- `application.yml`은 공개 가능한 설정만 남기고, 로컬 정보는 프로필 파일로 빼는 구조가 Spring Boot 학습에 더 좋다.
- 사용자가 프레임워크를 쓰는 이유는 반복 작업을 줄이고 규칙으로 자동화하기 위함이므로, 실행 명령보다 설정 파일에서 기본 동작을 정의하는 편이 더 학습에 맞는다.

### 학습 포인트

- `application.yml`은 기본으로 읽힌다.
- `application-local.yml`은 `local` 프로필이 켜졌을 때 함께 읽힌다.
- Spring Boot는 파일 이름 규칙과 프로필 규칙만 맞으면 별도 자바 설정 없이도 설정을 합쳐서 처리한다.
- 실행 시에는 `SPRING_PROFILES_ACTIVE=local` 또는 `-Dspring-boot.run.profiles=local`을 사용하면 된다.
- 기본 프로필을 `application.yml`에 두면 실행 명령을 매번 기억하지 않아도 된다.
