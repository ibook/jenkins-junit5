# Coding API Test

## 开发环境及组件

 - JDK: 1.8.0+
 - REST-assured: 3.2.0
 - JUnit: 5.3.2
 
## test 准备

准备配置文件
src/test/resources/config.properties

## 执行测试

- mac
```
./gradlew test
```
- windows
```
gradlew test
```

测试报告位于 `build/reports/index.html` 目录。

## 更多玩法

### 自定义配置

执行 gradle 的时候可以通过 `-Dconfig.path` 来指定配置文件位置，例如：

- mac
```
./gradlew -Dconfig.path=config.properties test
```
- windows
```
gradlew.bat -Dconfig.path=config.properties test
```

### 测试指定类

添加 `--tests` 参数指定要测试的具体类或方法名，可以使用通配符：
- mac
```
./gradlew test --tests net.coding.api.test.project.*
./gradlew test --tests net.coding.api.test.project.MemberTest.testAddMore
```
- windows
```
gradlew.bat test --tests net.coding.api.test.project.*
gradlew.bat test --tests net.coding.api.test.project.MemberTest.testAddMore
```
