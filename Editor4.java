import java.awt.Color;

public class Editor4 {
    public static void main (String[] args){
        String filename = args[0];
        int n = Integer.parseInt(args[1]);
        Color[][] source = Runigram.read(filename);
        Runigram.setCanvas(source);

        while(n > 0){
            source = Runigram.grayScaled(source);
            Runigram.display(source);
            StdDraw.pause(500);
            n -= 1;
        }
    }
}
