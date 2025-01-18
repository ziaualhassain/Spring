**Spring Core with Xml and Beanfactory**

Beanfactory is an interface which will be implemented by multiple different classses.<br>

Unlike the ApplicationContext it follows a different Approch.<br>
But before that we know ApplicationContext is eager intilisation which means it creates all the beans and keep it ready in IOC container.<br>
But Beanfactory uses late intilization it will create beans only when they are needed.<br>
The another benifit is if we have multiple Configuration files we need to create multiple containers in ApplicationContext.<br>
But in BeanFactory as we are using method we can load multiple config files.<br>

<img width="939" alt="Screenshot 2025-01-19 at 12 09 12 AM" src="https://github.com/user-attachments/assets/a2675cdf-baf7-471b-b5ec-94759b0aa120" /> <br>

DefaultListableBeanFactory container = new DefaultListableBeanFactory(); //Create container <br>
		
XmlBeanDefinitionReader read = new XmlBeanDefinitionReader(container); //Read the cointer <br>
		
read.loadBeanDefinitions("applicationconfig.xml"); //Pass the config file via method <br>
read.loadBeanDefinitions("applicationconfig2.xml"); //Pass the config file via method <br>
		
TshapedSkills t = container.getBean(TshapedSkills.class); //Get the bean <br>
<img width="1099" alt="Screenshot 2025-01-19 at 12 07 44 AM" src="https://github.com/user-attachments/assets/a238202c-398e-4a77-8544-8c64e1e02af0" /> <br>

Even though we need multiple beans here the IOC created the beans which are necessary. <br>
**Tshaped and Java**
