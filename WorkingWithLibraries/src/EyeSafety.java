import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.nitido.utils.toaster.Toaster;

public class EyeSafety {
    private static BufferedImage img = null;

    public static void eye() throws InterruptedException, IOException {
        Toaster t = new Toaster();
        // t.setStep(300);
        t.setBorderColor(new Color(100, 123, 123));
        t.setToasterHeight(400);
        t.setToasterWidth(500);
        img = ImageIO.read(new File("/home/emilian/Python-3.3.2/Mac/BuildScript/resources"));
        t.showToaster("Take a break!");
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        eye();
    }
}
