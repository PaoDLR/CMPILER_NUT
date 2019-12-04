import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.HashMap;

public class NutInterpreter extends JFrame{
    private JButton btnInterpret;
    private JTextArea inputStream;
    private JTextArea outputStream;
    private JPanel interpreterPanel;
    private JButton clearOutput;
    private NutInterpreter nut;

    public NutInterpreter(String interpreter){
        super(interpreter);



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(interpreterPanel);
        this.pack();
        nut = this;
        btnInterpret.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CharStream stream = CharStreams.fromString(getInputStream());
                NutLexer lexer  = new NutLexer(stream);
                lexer.removeErrorListeners();
                lexer.addErrorListener(new NutErrorListener());
                TokenStream tokenStream = new CommonTokenStream(lexer);
                NutParser parser = new NutParser(tokenStream);
                NutParserBaseVisitor baseParser = new NutParserBaseVisitor(nut);
                parser.removeErrorListeners();
                parser.addErrorListener(new NutErrorListener());
                ParseTree tree = parser.compilationUnit();
                baseParser.visit(tree);

                //show AST in console
                System.out.println(tree.toStringTree(parser));

                //show AST in GUI
                JFrame frame = new JFrame("ANTLR AST");
                JPanel panel = new JPanel();
                TreeViewer viewr = new TreeViewer(Arrays.asList(
                        parser.getRuleNames()),tree);
                viewr.open();

                NutErrorListener errorListener = new NutErrorListener();
            }
        });
        clearOutput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputStream.setText("");
            }
        });
    }

    public String getInputStream(){
       return inputStream.getText();
    }

    public void setOutputStream(String text){
        outputStream.append(text);
        outputStream.append("\n");
    }

    public class NutErrorListener extends ConsoleErrorListener {

        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
                throws ParseCancellationException {
            String err = msg.split("'")[1];
            if(msg.contains("missing"))
                setOutputStream("Syntax Error at Line " + line + " missing " + err);
            else if(msg.contains("extraneous input"))
                setOutputStream("Syntax Error at Line " + line + " extra character/s " + err);
            else if(msg.contains("mismatched input"))
                setOutputStream("Syntax Error at Line " + line + " unexpected " + err);
            else if(msg.contains("no viable alternative at input")){
                setOutputStream("Syntax Error at Line " + line + " missing \"\"");
            }
            else if(msg.contains("cannot find symbol")){
                setOutputStream("Logical Error at Line " + line + " missing symbol " + err);
            }
            else if(msg.contains("variable might not have been initialized")){
                setOutputStream("Syntax Error at Line" + line + "variable " + err + " is missing initialization");
            }
            else if(msg.contains("ArrayIndexOutOfBoundsException")){
                setOutputStream("Exception in thread due to trying to access the array at" + err + " which does not exist");
            }
            else if(msg.contains("Cannot resolve symbol")){
                setOutputStream("The variable " + err + " does not exist yet and cannot be accessed");
            }
            else
                setOutputStream(msg);

        }

    }
}
