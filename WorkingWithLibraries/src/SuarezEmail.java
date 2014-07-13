import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

public class SuarezEmail {
    public static void main(String[] args) throws EmailException, MalformedURLException {
        sendEmail();
    }

    public static void sendEmail() throws EmailException, MalformedURLException {
        EmailAttachment attachment = new EmailAttachment();
        attachment.setURL(new URL("http://d3dsacqprgcsqh.cloudfront.net/photo/azbW3zq_460sa_v1.gif"));
        attachment.setDisposition(EmailAttachment.ATTACHMENT);
        attachment.setDescription("Gif of Suarez biting!");
        attachment.setName("yo mama");

        MultiPartEmail email = new MultiPartEmail();
        email.setHostName("smtp.googlemail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("javatesteclipse@gmail.com", "koliokolio"));
        email.setSSLOnConnect(true);
        email.addTo("eminstine@abv.bg", "Emilian Stankov");
        email.setFrom("pytestemail@gmail.com", "Me");
        email.setSubject("Suarez biting accident");
        email.setMsg("This shit is hilarious");

        email.attach(attachment);

        email.send();
    }
}
