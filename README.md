# SelectVo
selectVO generate
写这个是由于自己暑期在做项目的时候，每次在mybatis的xml里对实体类VO书写select语句的时候一个一个字段书写太麻烦（如下图），此方法只是自己为了偷懒写的，对于使用resultMap的没有帮助。
![image](https://user-images.githubusercontent.com/72613433/186873031-d9e6a59e-1c5b-4f42-abb1-816c5da00508.png)
##使用效果：
![image](https://user-images.githubusercontent.com/72613433/186874340-464eb4be-db68-47fc-8419-bac7c2329472.png)
左边为一个VO类，读取该类之后生成右边的语句。

##使用方法：
引入依赖：
```pom
       <dependency>
            <groupId>com.sun</groupId>
            <artifactId>tools</artifactId>
            <scope>system</scope>
            <systemPath>${JAVA_HOME}/lib/tools.jar</systemPath>
        </dependency>
```
此依赖是为了读取到类内的注释（用于区分表名）
![image](https://user-images.githubusercontent.com/72613433/186873423-390e2b2a-c999-498f-b96b-4edd83685f56.png)
在Run方法中添加要读取的实体类地址，然后调用Util里的println方法即可，可一次读取多个实体类，只需要在sources里添加
在每一个实体类中，使用注释告诉程序以下字段是哪个表的，如第二张图的/*work**/
