**Primary,Qualifier**

So here we have our classic javacourse and SpringBoot.<br>

When we make both of these as @Services and try to do dependency injection.<br>

In the IOC for same Icourse there are 2 eligible beans. So it will fail.<br>
<img width="593" alt="Screenshot 2025-01-19 at 6 29 34 PM" src="https://github.com/user-attachments/assets/41537b1e-c84c-4ca9-8b78-f9b5df1bb42d" /> <br>
In such cases we can make a class as @Primary. then the amibiguity will be solved.<br>
<img width="662" alt="Screenshot 2025-01-19 at 6 41 36 PM" src="https://github.com/user-attachments/assets/283350da-bcf4-41e6-830f-a477361599f9" /> <br>

The other way is to use @Qualifier.<br>
The id of beans will be camalcase of the Class name as we know from before hand.
<img width="654" alt="Screenshot 2025-01-19 at 6 42 48 PM" src="https://github.com/user-attachments/assets/2a7526a8-6a7d-49b0-a3e8-71b3880f1e23" />
we can use **@AutoWired on Constructor. But we can't use @Qualifier** on top of constructor injection.For constructor injection we need to pass it in arguments/Parameters. <br>
But we can use @Autowire and @Qualifier on Field injection also. <br>

But the main thing is **@Primary vs @Qualifier** <br>
The @Qualifier will overide the @Primary.<br>
The JavaCourse is **@Primary**<br>
But we use **@Qualifier** on SpringBoot.<br>

<img width="601" alt="Screenshot 2025-01-19 at 6 48 22 PM" src="https://github.com/user-attachments/assets/1a35b158-4396-4b2c-b87c-4afe124fbc10" /> <br>
<img width="557" alt="Screenshot 2025-01-19 at 6 48 38 PM" src="https://github.com/user-attachments/assets/1110d923-774b-4b8b-87cb-d62775b1477e" /> <br>
**The @Qualifier will overide the @Primary.<br>**
