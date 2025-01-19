Let's create a greeting app get the time from Localtime and based on hours log the greeting.<br>

Structure the app we will create the instance of localtime and as we created it it won't be a bean. So use @Bean to make it part of IOC.<br>

<img width="573" alt="Screenshot 2025-01-19 at 6 20 38 PM" src="https://github.com/user-attachments/assets/3e65c56e-7085-484d-be33-375ca772eacb" />

So the IOC has a reference of LocalTime. we can use @Autowired fr=or injection as there are no duplications injection will be done easily. <br>

Here we are using Field Injection (not setter or constructor injection) <br>

<img width="620" alt="Screenshot 2025-01-19 at 6 21 02 PM" src="https://github.com/user-attachments/assets/7513a037-acd0-433a-81ab-f9a642031238" />
