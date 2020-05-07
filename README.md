# springboot-simple
## 一、简介

目的是成为一个实现基本功能封装的快速开发脚手架，无需多余配置，即可上手开发业务代码，写项目神器。

### 主要架构:

[**Springboot**](https://spring.io/projects/spring-boot) ：微服务入门框架 。用过的都懂，自动配置强无敌！

[**mybatis-plus**](https://mp.baomidou.com/guide/) ：（简称 MP）是一个 **[MyBatis](http://www.mybatis.org/mybatis-3/)** 的增强工具，在 MyBatis 的基础上只做增强不做改变，为简化开发、提高效率而生。

**[Hutool](https://hutool.cn/docs/#/)**  ：是一个小而全的Java工具类库，通过静态方法封装，降低相关API的学习成本，提高工作效率。Hutool的目标是使用一个工具方法代替一段复杂代码，从而最大限度的避免“复制粘贴”代码的问题，彻底改变我们写代码的方式

**[swagger](https://swagger.io/)** ：是一款让你更好的书写API文档的规范框架。所有的信息，都在代码里面了。代码即接口文档，接口文档即代码。

[**lombok**](https://projectlombok.org/) ：是一个可以通过简单的注解形式来帮助我们简化消除一些必须有但显得很臃肿的Java代码的工具，通过使用对应的注解，可以在编译源码的时候生成对应的方法。

**logging**  ：日志框架，目前为springboot的默认框架。

**[redis](https://redis.io/)** ：好用快速的key-value 数据库。

### 模块功能：

使用父模块对子模块的依赖做版本控制。

**business** ：业务代码模块

**common** ：通用模块，此模块设计目的是将无业务依赖的常用方法封装，可以引入到到任何项目中，提供公共方法，其实和hutool的思想是差不多的。

## 二、特性

- **MybatisCodeGenerator** 类可以生成 mybatis-plus的基本代码和数据库实体类。
- **controller** 统一异常处理。

## 三、项目运行

> idea 要添加 lombok 插件，要不会爆红

1. 新建数据库，将表结构插入 ，修改 properties 中的数据库连接和密码
2. 修改redis等连接。
3. 在springbootapplication运行即可，也可以用jar包方式运行。
4. 项目路径 http://localhost:9090/onion 和swagger 路径  http://localhost:9090/onion/swagger-ui.html 

