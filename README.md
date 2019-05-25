# gkassist-backend

## 目录结构示例

```
.
├─main
│  ├─java
│  │  └─com
│  │      └─tangenta
│  │          └─gkassist
│  │              │  Application.java                       # 应用启动器
│  │              │
│  │              ├─common
│  │              │  ├─config
│  │              │  │      SwaggerConfiguration.java       # 生成Api文档
│  │              │  │
│  │              │  ├─ddd                                  # 领域驱动开发，备用
│  │              │  │      ApplicationService.java
│  │              │  │      Command.java
│  │              │  │      MarkerInterface.java
│  │              │  │      Repository.java
│  │              │  │      Representation.java
│  │              │  │
│  │              │  ├─exception
│  │              │  │      AppException.java
│  │              │  │      ErrorCode.java
│  │              │  │      ErrorDetail.java
│  │              │  │      ErrorRepresentation.java
│  │              │  │      RestErrorController.java
│  │              │  │
│  │              │  ├─logging
│  │              │  │      AutoNamingLoggerFactory.java
│  │              │  │
│  │              │  └─util
│  │              │          Basics.java
│  │              │
│  │              └─school                                  # 学校信息
│  │                  │  SchoolApplicationService.java      # 服务层
│  │                  │  SchoolController.java              # 控制器层
│  │                  │
│  │                  ├─converter                           # JPA需要的转换器
│  │                  │      ListGsonConverter.java
│  │                  │      SchoolIdConverter.java
│  │                  │
│  │                  ├─exception
│  │                  │      SchoolNonExistException.java
│  │                  │
│  │                  ├─model                               # 数据类型
│  │                  │      AdmissionGuide.java
│  │                  │      CampusScenery.java
│  │                  │      Link.java
│  │                  │      SchoolBadge.java
│  │                  │      SchoolId.java
│  │                  │      SchoolInfo.java
│  │                  │
│  │                  ├─repository                          # 数据库交互层
│  │                  │      AdmissionGuideRepository.java
│  │                  │      CampusSceneryRepository.java
│  │                  │      SchoolBadgeRepository.java
│  │                  │      SchoolInfoRepository.java
│  │                  │
│  │                  └─representation                      # 表现层
│  │                          AdmissionGuideRepresentation.java
│  │                          SceneryRepresentation.java
│  │                          SchoolIdNameRepresentation.java
│  │                          SchoolRepresentation.java
│  │                          SchoolRepresentationService.java
│  │
│  └─resources
│          application.properties
│
└─test
    └─java
```

几点说明：

- 按照业务分包，例如学校，专业。不同业务包之间无直接联系。
- 同一个业务包内自由划分，合理即可。Controller和Service尽量放在显眼的位置。
- Representation作为Controller方法返回值类型，方便统一管理。

## 技术选型

SpringBoot、Hibernate、MySQL

## 领域对象

| 领域对象 | 名称 | 业务功能                                   |
| -------- | ---- | ------------------------------------------ |
| School   | 学校 | 包含学校基本信息、校园风光图片、招生简章等 |