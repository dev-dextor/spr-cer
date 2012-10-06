spr-cer
=======

SSL setup requires:

[===]$ keytool -genkey -keystore keystore -keyalg RSA

What is the two-letter country code for this unit?
  [Unknown]:  
Is CN=Unknown, OU=Unknown, O=Unknown, L=Unknown, ST=Unknown, C=Unknown correct?
  [no]:  y

Enter key password for <mykey>
        (RETURN if same as keystore password):  

[===]$ ls

bin  keystore  pom.xml  README.md  src  target



[===]$  mvn clean  package 
[===]$  mvn  package 
[===]$  java -jar myRmi.jar &
[===]$  java -cp myRmi.jar org.devdexter.spr.rmi.plain.SpringRmiClient
[===]$  java -cp myRmi.jar org.devdexter.spr.rmi.plain.SpringRmiClientSsl

