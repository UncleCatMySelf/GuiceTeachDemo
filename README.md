<h2>Guice，一个专注于Dependency Injection的开源框架，本Demo从零开始教你入手一个Google的轻量级架构</h2>
<h2>Guice, an open-source framework focused on dependency injection, teaches you to start with a Google lightweight architecture</h2>

<p>本Demo将带领大家通过Google Guice来系统的学习DI思想中的绑定，注入，生命周期，aop等方面的技巧。并示范Guice和Spring Boot如何协作。对于熟悉Spring的同学，学完本Demo后可以了解两者异同，加深对DI和Spring的理解。</P>
<p>Guice不同于Spring：取消xml、取消Bean的概念、使用Constructor来注入、泛型支持、一个专注于Dependency Injection的开源框架</p>

<p>This demo will lead you through Google Guice to learn about the binding, injection, lifecycle, and AOP techniques in Di's mind. and demonstrate how guice and spring boot collaborate. For those of you who are familiar with spring, you can learn about the similarities and differences and deepen your understanding of Di and spring after you finish this demo.</p>
<p>Guice is different from spring: Canceling XML, canceling the concept of beans, injecting with constructor, generics support, an open source framework focused on dependency injection</p>

<h4>master分支</h4>
<p>演绎无Guice下的Dependency Injection，通过Hello World案例来改造实现面向对象化，消除Dependency。经典的Hello World的核心算法？将指定内容输出至指定目标。我通过对象类及接口抽象将Hello World功能脱离出来，成为依赖注入。先理解master分支的原生demo对你的帮助将更大哦。</p>
<h4>Master Branch</h4>
<p>Deduce the dependency injection under no guice, through the Hello World case to transform to realize object-oriented, eliminate dependency. The classic Hello World core algorithm? Outputs the specified content to the specified destination. I get rid of the Hello World function through object class and interface abstraction, and become dependency injection. First understanding of the master branch of the original demo will help you a lot more oh.</p>

<h4>master-guice分支</h4>
<p>此分支是通过Guice配置实现Master示例中的HelloWorldDemo，通过继承AbstractModule，实现configure配置，使用注解@Inject告诉Guice依赖注入</p>
<h4>Master-Guice Branch</h4>
<p>This branch implements the Helloworlddemo in the master example through the Guice configuration, implements configure configuration by inheriting Abstractmodule, uses annotations @inject tells Guice dependency Injection</p>

<h4>related分支</h4>
<p>此分支主要讲解Guice的注入（构造函数、成员变量），构造函数注入：使用final来区分dependency和状态，注入时不要考虑如何实现或绑定、成员变量注入：用于测试、使用injectMembers来注入测试用例、命名注入；绑定：类名绑定、实例绑定、连接绑定、Provider绑定、命名绑定、泛型绑定、集合绑定；选择作用域：默认（一般实例，stateless，构造速度快）、Singleton（Stateful的实例、构造速度慢的实例、必须线程安全）、Session/Request（含有session/request信息的实例、stateful的实例），及Guice AOP的相关介绍</p>
<h4>Related Branch</h4>
<p>This branch focuses on Guice injection (constructors, member variables), constructor injection: Use final to distinguish between dependency and state, and do not consider how to implement or bind, member variable injection when injected: for testing, using injectmembers to inject test cases, Named injection; binding: Class name bindings, instance bindings, connection bindings, provider bindings, named bindings, generic bindings, collection bindings, selection scopes: Default (General instance, stateless, fast construction), Singleton (instance of stateful, slow construction) , must be thread safe), Session/request (instances with session/request information, stateful instances), and Guice AOP related introduction</p>

<h4>Spring-boot-guice分支</h4>
<p>此分支主要使用Guice与Spring Boot协作搭建Web应用(使用Spring Boot搭建简单的Web应用、使用Guice搭建业务逻辑)，其中SpringBoot进行总控，各自绑定Guice Injector和Spring AllpicationContext，同时我们需要注意对象生命周期。Guice不是Spring的重制版，Spring绑定（配置文件体现完整装配结构、大量使用字符串：实例名：属性名、在Config Time完成组装）；Guice绑定：（Java代码描述绑定规则，每个注入/绑定仅描述局部依赖，没有Config Time）；Guice的优点：代码量少、性能优异、支持泛型、Constructor绑定：Immutable objects，不在需要getter/setter、强类型、易于Refactor；Guice的缺点：Module和绑定规则不易理解、文档教程少、社区资源少、无法方便搭出特殊结构：如循环依赖；新项目需要选择Dependency Injection方案时，可以尝试Guice，注意对象生命周期</p>
<h4>Spring-Boot-Guice Branch</h4>
<p>This branch uses Guice to build Web applications in collaboration with spring boot (using spring boot to build simple Web applications, using Guice to build business logic), where Springboot is the master and bound Guice Injector and Spring Allpicationcontext, and we need to be aware of the object lifecycle. Guice is not a spring-plate, spring binding (the configuration file embodies a complete assembly structure, a large number of strings: Instance Name: Property name, complete assembly at config time); Guice binding: (Java code describes binding rules, each injection/binding describes only local dependencies, no config time); Guice Advantages: Less code, superior performance, support generics, constructor binding: Immutable objects, not needed getter/setter, strong type, easy to refactor Disadvantages of Guice: module and binding rules are not easy to understand, less documentation tutorials, less community resources, no easy to build special structure: such as circular dependency; when new projects need to select Dependency injection scenarios, you can try Guice, note the object lifecycle</p>


<h4>作者：UncleCatMySelf</h4>
<h4>email：zhupeijie_java@126.com</h4>
<h5>有什么问题，欢迎联系QQ：1341933031</h5>
<h4> Author: UncleCatMySelf</h4>
<h4>email:zhupeijie_java@126.com</h4>
<h5>what's the problem? Welcome to contact QQ:1341933031</h5>