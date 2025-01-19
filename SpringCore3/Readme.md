**XML + Annoation  approch**

In the real world the application will be devloped in a layered Approch. <br>
<img width="963" alt="Screenshot 2025-01-19 at 1 14 13 PM" src="https://github.com/user-attachments/assets/5a28eb09-13e1-4fcb-a8a0-c30e3d23a701" />

Before going ahead let's see the types of annotations : <br>
**1)Stereotype annotations(Class Level annotaions)** <br>
_Eg : Component,Service,Repository_ .<br>
**2)Non - Stereotype annotations(Class Level annotaions)**
_Eg : Bean annotation._  <br>

In this approch we need ti config the xml file saying two things: <br>
1. We are using Anotations. <br>
2. The base package. <br>



<img width="637" alt="Screenshot 2025-01-19 at 1 56 17 PM" src="https://github.com/user-attachments/assets/5344b7d9-13d4-4b42-a446-36b035af95d0" />



For Password class we don't have any sterotype annoataions but we are trying to access it via IOC Container. It will throw an error.<br>
<img width="685" alt="Screenshot 2025-01-19 at 2 06 40 PM" src="https://github.com/user-attachments/assets/b35f21b8-ac46-413a-acfc-2268c8afa5c7" />
<img width="750" alt="Screenshot 2025-01-19 at 2 07 11 PM" src="https://github.com/user-attachments/assets/0343c741-5034-455a-9201-cdd0176a56e3" />

If an object is created by the developer and you want srping to maintain it in IOC we can use the **Bean** annotation
<img width="555" alt="Screenshot 2025-01-19 at 2 07 28 PM" src="https://github.com/user-attachments/assets/2fed548e-0bed-411d-a994-d72a4779f88b" />
