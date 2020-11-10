# HELP
> [docker-compose部署springboot+mysql(mysql制作镜像时执行指定sql文件)](https://www.cnblogs.com/Ashiamd/p/13954443.html)
+ demo目录就是java项目代码

  （jar包已经在docker_config目录放好了，可以不需要在自己生成了）

+ docker_config目录存放的是对应的docker配置文件和sql文件

+ 直接在docker_config目录执行`docker-compose`就好了。

  （当然前提开启了docker服务，且安装了docker-compose）

最后，如果正常运行,在url输入 `http://localhost:8081/api/test`就能看到数据库插入的100条数据了
