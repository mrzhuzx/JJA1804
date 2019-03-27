### 1 创建springBoot项目 添加上支持

### 2 pom.xml(配置  msyql  jpa  redis web devtools bootstarter)

 ###3  添加上插件（bomlok  git   maven ）

### 4 git远程仓库配置（创建远程仓库，创建团队，加入项目中，开启提交权限）


### 5 远程数据库配置 （反向生成实体， 正向生成表结构，）  ddl-auto: update  #修改  create 创建   JSON

application.properties
spring.datasource.url=jdbc:mysql://teacherzhu.uicp.net:34626/jja1804?useUnicode=true&characterEncoding=utf-8&useSSL=true&serverTimezone=UTC
spring.datasource.username=jja1804
spring.datasource.password=jja1804
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
spring.jpa.properties.hibernate.hbm2ddl.auto=update
----------------------------------------------------------------------------------------------------
 application.yml
 spring:
   profiles:
     active: product
   datasource:
     driver-class-name: com.mysql.cj.jdbc.Driver
     url: jdbc:mysql://teacherzhu.uicp.net:34626/jja1804?useUnicode=true&characterEncoding=utf-8&useSSL=true&serverTimezone=UTC
     username: jja1804
     password: jja1804
   jpa:
     hibernate:
       ddl-auto: update  #修改  create 创建
     show-sql: true
   jackson:
     date-format: yyyy-MM-dd HH:mm:ss
     time-zone: UTC
 naming:
   implicit-strategy: org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl
   physical-strategy: org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl
  properties:
    hibernate.dialect: com.jane.utils.MySQL5DialectUTF8


  ### 6  实体类配置
       @Entity
       @Table(name = "dog")
       @Data // get/set/toString
       public class Dog {

         @Id
         @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
         private Integer dogId;
         @Column
         private String dogName;
         @Column
         private String  dogHobby;
         @Column
         private Integer  dogAge;

###7  repository   数据仓库DAO

import javax.transaction.Transactional;
@Repository
public interface DogRepository  extends JpaRepository<Dog,Integer> {
    //CURD
    @javax.transaction.Transactional
    @Modifying(clearAutomatically = true) //    代码提示ctrl+p
    @Query(" update Dog set dogHobby=?2 where dogId=?1") // :dogHobby
    int  update(Integer dogId,String dogHobby);


###8 测试类

 @RunWith(SpringRunner.class)
 @SpringBootTest
 @Log4j2
 @slf2j


###9 分页
       @Test
        public void testPage(){
         //import org.springframework.data.domain.Sort;
               Sort sort=new Sort(Sort.Direction.ASC,"dogId");//属性名dogid XXX
               //Sort sort=new Sort(Sort.Direction.DESC,"dogId");
                Integer pageNum=3; //  2   3页
                Integer size=5;

            PageRequest pageable = new PageRequest(pageNum-1, size,new Sort(Sort.Direction.ASC,"dogId")); //根据start、size、sort创建分页对象
            //Pageable pageable = new PageRequest(pageNum-1, size,sort); //根据start、size、sort创建分页对象

            Page<Dog> page = dogRepository.findAll(pageable);
            List<Dog> dogList = page.getContent();

            for (int i = 0; i < dogList.size(); i++) {

                Dog dog = dogList.get(i);
                log.info(dog.toString());
            }

        }

###10 项目数据库设计 （完善中...）
       domain包下有两个项目：
           在线网店（，水果，宠物）

           SMBMS 供应商系统
表分析：
     Guanggao  广告表
团队表：
      Team  团队
       Member  开发者
在线网店
OrderDetail   定单明细表
OrderMaster  写单主表
ProductCategory  分类
ProductInfo  产品
UserInfo  用户表
供应商系统：
 SmbmsAddress     供应商地址
SmbmsBill         定单    5
SmbmsProvider    供应商
SmbmsRole     角色表
SmbmsUser     用户表


###11 数据层接口， 业务层接口和实现, 编写测试类文件


  业务层接口和实现 BaseService JPA业务接口父类设计中

BaseService(练习Jpa数据库的接口中的方法实现)   String  ==  Long

extends JpaRepository<实体类, 主键类型>

                主键类型： 有两种   自动增长列、UUID

Repository中方法定义规范
1.        查询方法以find|read|get开头。
2.        涉及条件时，条件的属性用条件关键字连接。其中条件属性首字母大

使用And条件连接时，应这样写： 
findByLastNameAndFirstName(String lastName,StringfirstName); 

1)        条件的属性名称、个数要与参数的位置、个数一一对应。

2)        支持的关键字

关键字

方法名

条件

And

findByLastnameAndFirstname

…where x.lastname=? and x.firstname=?

Or

findByLastnameOrFirstname

… where x.lastname=? or x.firstname=?

Between

findByStartDateBetween

…where x.startDate between ? and ?

LessThan

findByAgeLessThan

…where x.age < ?

GreaterThan

findByAgeGreaterThan

…where x.age > ?

After

findByStartDateAfter

…where x.startDate > ?

Before

findByStartDateBafore

…where x.startDate < ?

IsNull

findByAgelsNull

…where x.age is null

IsNotNull,NotNull

findByAge(is)NotNull

…where x.age not null

Like

findByFirstnameLike

…where x.firstname like ?

NotLike

findByFirstnameStartingWith

…where x.firstname not like ?

StartingWith

findByFirstnameStartingWith

…where x.firstname like ?

EndingWith

findByFirstnameEndingWith

…where x.firstname like ?

Containing

findByFirstnameContaining

…wherex.firstname like ?

OrderBy

findByAgeOrderByLastnameDesc

…where .age=? orser by x.lastname desc

Not

findByLastnameNot

…where x.lastname<>?

In(NotIn)

findByAge(Not)In

…where x.age (not) in ?

True

findByActive True()

…where x.active = true

FALSE

findByActiveFalse

…where x.active = false

@Modifying注解和事务
1.        执行更新操作用：@Query 与 @Modifying 这两个 annotation一起声明。

@Modifying

@Query("UPDATE Customer c SET c.customerName=?1")

int updateCustomerName(String cn);

1)        方法的返回值应该是 int，表示更新语句所影响的行数

2)        在调用的地方必须加事务，没有事务不能正常执行



###12 junit4  当进行测试后 不想在数据库中留下测试数据 可以添加注解
          @Transcational  删除
          @Transcational 修改




###13 添加上springmvc配置

*添加后台bootstrap页面
* application.properties 配置文件中添加
server.servlet.context-path=/springmvc
        server.port=8088
        spring.mvc.view.prefix=/
        spring.mvc.view.suffix=.jsp
        server.tomcat.uri-encoding=UTF-8
        spring.thymeleaf.cache=false
        #热部署生效
        spring.devtools.restart.enabled: true
        #设置重启的目录
        spring.devtools.restart.additional-paths: src/main/java
        #classpath目录下的WEB-INF文件夹内容修改不重启
        spring.devtools.restart.exclude: WEB-INF/**
      
*在控制层中注入时间

   //At the time of initialization,convert the type "String" to type "date"
    /**spirngmvc对时间类型支持*/
    @InitBinder
    public void initBinder(ServletRequestDataBinder binder){
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"), true));
       // binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd "), true));
    }
	
* 添加上spring路径支持

* 添加对jsp页面支持
        <!--jsp页面使用jstl标签-->
        <dependency>
            <groupId>javax.servlet</groupId>
            <artifactId>jstl</artifactId>
        </dependency>
        <!--用于编译jsp-->
        <dependency>
            <groupId>org.apache.tomcat.embed</groupId>
            <artifactId>tomcat-embed-jasper</artifactId>
            <scope>provided</scope>
        </dependency>
        
 * 创建web目录
 
 
        


14 绑定项目功能 ，返回JSON













