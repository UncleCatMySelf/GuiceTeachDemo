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


<h4>作者：UncleCatMySelf</h4>
<h4>email：zhupeijie_java@126.com</h4>
<h5>有什么问题，欢迎联系QQ：1341933031</h5>
<h4> Author: UncleCatMySelf</h4>
<h4>email:zhupeijie_java@126.com</h4>
<h5>what's the problem? Welcome to contact QQ:1341933031</h5>