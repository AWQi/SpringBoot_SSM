# SpringBoot_SSM
基于SpringBoot的SSM搭建

1、Application.java的目录层级必须高于其他，才能自动扫描的注解 @Controller @Service 

2、mapper.xml文件放在resources下，才能在编译时被打包，放在包目录下不行

3、mapper.xml 必须与mapper.java对应，否则会有ibatis 错误

4、yml内排版全部用tab


5、jdbc 问题  url加时区参数  serverTimezone=UTC



<img src="https://github.com/AWQi/SpringBoot_SSM/blob/master/目录结构.png" width= "175" height="275"/>


<img src="https://github.com/AWQi/SpringBoot_SSM/blob/master/访问截图.png" width= "175" height="275"/>
