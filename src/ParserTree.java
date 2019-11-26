import java.io.IOException;
import javax.swing.JFrame;

public class ParserTree {
    public static void main(String[] args) throws IOException {
        //prepare token stream
        NutInterpreter nut = new NutInterpreter("Interpreter");

        JFrame intFrame = nut;
        intFrame.setVisible(true);

    }

}


