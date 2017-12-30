# learn-java
Here we will learn some of the concepts about Java.

# Serialization and Deserialization of object:
Serialization and deserialization of object is one of the important task which is generally being
used inside the application. Here we will demonstrated diffrent types of serialization and deserialization technique.

* Firsly, we will show using (ObjectOutputStream/ObjectInputStream and FileOutputStream/FileInputStream).

* Concept of serialVersionUID
   
        Each class has its own serialVersionUID, which depends on the structure of the class.
   It is used at the time serialization and deserialization. For the compatibility serialVersionUID should be
   same at both of the time. Since some of the changes in class may not hurt deserialization like add a 
   new instance variables. But due to change in class serialVersionUID will be change which may result
   problem at the time of deserialization. Hence we give a final serialVersionUID for a class which remains
   constant for the class.
   
   
   
# Message Passing using Socket Networking:

* A Socket connection means the two machines have information about each other, including
network location (IP address) and TCP port.

* Socket provides InputStream for reading a message and OutputStream for writing something.

* Here, we only illustrated a simple demo of message passing b/w two devices using socket.