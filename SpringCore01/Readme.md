**Spring Core and XML approch**

There are 2 ways to use spring framework(Spring Core) one is by using Application Context and Bean Factory. <br>
Here in this repo we will see the ApplicationContext approch. <br>
Here we will need a configuration file/Instructions which is a xml file only. <br>
We will give the instructions to the container which is cretaed from Application context. <br>
The dependency injection will be taken care by The continer only. <br>
<img width="620" alt="Screenshot 2025-01-17 at 9 20 55 PM" src="https://github.com/user-attachments/assets/b0bf8b95-464f-4fb1-b207-ae6c13e2901e" />

**Eager initilization**
Even though we are not using all objects but spring is creating objcts for all.So in ApplicationContext it is always eager intilization.<br>
But in BeanFactory objects/beans will be created for the applications which are being used, <br>
<img width="963" alt="Screenshot 2025-01-18 at 10 25 52 PM" src="https://github.com/user-attachments/assets/d13a47e5-37f2-4835-af9c-dafab8bc58d0" />

<img width="1273" alt="Screenshot 2025-01-18 at 10 19 50 PM" src="https://github.com/user-attachments/assets/b2161816-0458-4bea-99c9-45befe13776b" />


**Setter Injection**
<bean id="ts" class="Services.TshapedSkills">
  <property ref="java" name="course"/>  <!-- Injecting java in the setter course reference in tshapedSkills -->
</bean> 

<img width="527" alt="Screenshot 2025-01-18 at 10 52 13 PM" src="https://github.com/user-attachments/assets/c60b1685-8404-47bd-b060-fd53d70e4a95" />


**Constructor Injection**
<bean id="ts" class="Services.TshapedSkills">
<constructor-arg ref="java" name="course"/>  <!-- Injecting via constructor -->
</bean> 
<img width="552" alt="Screenshot 2025-01-18 at 11 16 49 PM" src="https://github.com/user-attachments/assets/f0a7ad27-58e6-4b06-95e0-0eb29c181111" />



ApplicationContext container = new ClassPathXmlApplicationContext("applicationconfig.xml");
We are getting the bean from container. <br>

TshapedSkills t = container.getBean(TshapedSkills.class); <br>

Using that bean we are gettong the status.<br>
Boolean status = t.buyTheCourse(454.4);
