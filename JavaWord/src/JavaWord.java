/**
 * Інтерфейсне виведення файлу з розширеннням png
 *
 */
import java.awt.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
    public class JavaWord {

        public static void main(String[] args) {
            EventQueue.invokeLater(new Runnable()
            {
                public void run()
                {
                    ImageFrame frame = new ImageFrame();
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);
                }
            });
        }

    }
    class ImageFrame extends JFrame
    {
        public ImageFrame()
        {
            setTitle("ImageTest");
            setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);



            ImageComponent component = new ImageComponent();
            add(component);
        }
        public static final int DEFAULT_WIDTH = 300;
        public static final int DEFAULT_HEIGHT = 300;
    }
    class ImageComponent extends JComponent
    {
        public ImageComponent()
        {

            try
            {
                image = ImageIO.read(new File("src/java.png"));
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        }
        public void paintComponent(Graphics g)
        {
            if(image == null) return;
            int imageWidth = image.getWidth(this);
            int imageHeight = image.getHeight(this);


            g.drawImage(image, 0, 0, null);



            for(int i = 0; i * imageWidth <= getWidth(); i++)
                for(int j = 0; j * imageHeight <= getHeight(); j++)
                    if(i + j > 0)
                        g.copyArea(0, 0, imageWidth, imageHeight, i * imageWidth, j * imageHeight);
        }
        private Image image;
    }

