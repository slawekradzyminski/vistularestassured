# Windows setup guide

1. Install [IntelliJ IDEA Community Edition](https://www.jetbrains.com/idea/)

2. Install [Java 8 SDK](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

3. Download and unpack [Maven 3](http://ftp.ps.pl/pub/apache/maven/maven-3/3.6.3/binaries/apache-maven-3.6.3-bin.zip)

4. Set [JAVA_HOME](https://www.mkyong.com/java/how-to-set-java_home-on-windows-10/) and [configure Maven](https://www.mkyong.com/maven/how-to-install-maven-in-windows/)

5. Verify installation running `mvn -version` and `java -version`. You should see version number.

# Mac setup guide

1. Install [IntelliJ IDEA Community Edition](https://www.jetbrains.com/idea/)

2. Install [Brew](https://brew.sh)

3. Install [Java 8](https://stackoverflow.com/questions/24342886/how-to-install-java-8-on-mac)

4. Install Maven - `brew install maven`

5. Verify installation running `mvn -version` and `java -version`. You should see version number.

# Fork guide

1. Click Fork in top right corner

![Screenshot](setup/fork.png)

2. Do next steps on your fork. You can verify that URL contains your account name instead of `slawekradzyminski`

# API running guide

1. Download API jar from https://drive.google.com/file/d/1lPMnqKBpvHAD_qLYI2YN-cL6M9MqejPY/view

2. Run Jar from command line (open terminal via 'cmd' command in Windows)

`java -jar vistula-api.jar`

![Screenshot](setup/jar.PNG)

3. After around one minute verify that you can access Swagger

http://127.0.0.1:9999/swagger-ui.html

4. Application can be stopped by closing terminal or pressing CTRL + C

# Project setup guide

1. Open IntelliJ and select File -> New -> Project from Version Control -> Git

![Screenshot](setup/1.png)

2. Copy paste your project url to tab. **You should see your account name instead of 'slawekradzyminski'.**

![Screenshot](setup/2.png)

3. After project has loaded open green notification in bottom-right corner. Click on Add as Maven Project

![Screenshot](setup/3.png)

4. Open ArenaTest class and click Setup SDK i top-right corner.

![Screenshot](setup/4.png)

5. Pick Java 8

![Screenshot](setup/5.png)

6. Go to InformationControllerTest class and run test. It should work (assuming that API is running on localhost).

# More

[API source code](https://github.com/slawekradzyminski/vistulasampleapi)