package demo;

public class SendMailSSL {

    public static void main(String[] args) {
        //from,password,to,subject,message  
        EmailSending.send("rajaul.cse@gmail.com", "", "springapidev@gmail.com", "hello Coderbd", "How r u?");
        //change from, password and to  
    }
}
