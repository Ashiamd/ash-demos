项目使用docker-compose编排部署docker容器。
nginx、springboot、mysql、ELK、FileBeat。
其中FileBeat获取Nginx的日志，Nginx => FileBeat => LogStash => ElasticSearch => Kibana

+ 需要注意的就是这里java文件夹下没有直接上传jar文件，需要拷贝代码后自己手动 `mvn clean install`
+ 该项目同样mysql是执行了指定的sql文件来进行数据库初始化的(和之前的[docker-java-mysql](https://github.com/Ashiamd/ash-demos/tree/main/docker-java-mysql)类似)
+ 正常运行后，可以通过访问 `127.0.0.1/api/test`或`127.0.0.1/api/swagger-ui/` 来检验是否正常(kiana则是`127.0.0.1:5601`、elasticsearch则`127.0.0.1:9200`)

该项目对应的博客文章[Nginx+Springboot+Mysql+ELK+FileBeat(部署记录)](https://www.cnblogs.com/Ashiamd/p/13956850.html)
