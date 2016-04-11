Telegraph project.

Provide REST API to send email/sms messages.

Steps to build and run project:
    1. Navigate to root directory: telegraph
    2. Run cmd
    3. Run command: mvn install
    4. Navigate to directory telegraph\telegraph-presentation
    5. Run command to start web-app: mvn tomcat7:run-war
    6. After web-app had been started run the following test endpoint from browser:
       http://localhost:8080/telegraph-presentation/notifications/load-notification

Build will failure in case of any checkstyle, pmd, findbugs errors/violations or when unit tests have been crashed.
The reason of failure can be inspected in console or you can navigate to appropriate module directory:
    1. checkstyle - {module-name}/target/checkstyle-result.xml
    2. pmd - {module-name}/target/pmd.xml
    3. findbugs - {module-name}/target/findbugsXml.xml
    4. tests - {module-name}/target/surefire-reports/*Test.xml

Steps to see code coverage report:
    1. Navigate to appropriate module directory ( for example telegraph\telegraph-presentation )
    2. Run command: mvn site
    3. Navigate to directory: {module-name}/target/site/
    4. Open file index.html to investigate code coverage.