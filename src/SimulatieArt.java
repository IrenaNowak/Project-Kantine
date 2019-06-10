package src;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

public class SimulatieArt {

    public static void simuleerArt() {
        int width = 155;
        int height = 12;

        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics graphics = image.getGraphics();
        Font f = new Font("Dialog", Font.PLAIN, 10);
        graphics.setFont(f);

        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graphics2D.drawString("K A N T I N E  S I M U L A T I E", 5, 10);

        for (int y = 0; y < height; y++) {
            StringBuilder builder = new StringBuilder();

            for(int x = 0; x < width; x++) {
                builder.append(image.getRGB(x, y) == -16777216 ? " " : "■");
            }
            System.out.println(builder);
        }

    }

    public static void line() {
        System.out.println("≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡");
    }
}
