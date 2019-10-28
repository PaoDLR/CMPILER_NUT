import java.io.IOException;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;

public class ParserTree {
    public static void main(String[] args) throws IOException {
        //prepare token stream
        CharStream stream = CharStreams.fromFileName("C:\\Users\\GeneralTank\\Documents\\College\\College 4th Year 1st Term\\CMPILER\\MP1\\CMPILER_NUT\\parser_test_case.txt");
        NutLexer lexer  = new NutLexer(stream);
        lexer.removeErrorListeners();
        lexer.addErrorListener(new NutErrorListener());
        TokenStream tokenStream = new CommonTokenStream(lexer);
        NutParser parser = new NutParser(tokenStream);
        parser.removeErrorListeners();
        parser.addErrorListener(new NutErrorListener());
        ParseTree tree = parser.startCode();

        //show AST in console
        System.out.println(tree.toStringTree(parser));

        //show AST in GUI
        JFrame frame = new JFrame("Antlr AST");
        JPanel panel = new JPanel();
        TreeViewer viewr = new TreeViewer(Arrays.asList(
                parser.getRuleNames()),tree);
        viewr.open();

        NutErrorListener errorListener = new NutErrorListener();



    }
    static class NutErrorListener extends ConsoleErrorListener{

        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
                throws ParseCancellationException {
            String err = msg.split("'")[1];
            if(msg.contains("missing"))
                System.err.println("Syntax Error at Line " + line + " - missing " + err + ".");
            else if(msg.contains("extraneous input"))
                System.err.println("Syntax Error at Line " + line + " - extra character/s " + err + ".");
            else if(msg.contains("mismatched input"))
                System.err.println("Syntax Error at Line " + line + " - unexpected " + err + ".");
            else if(msg.contains("token recognition"))
                System.err.println("Syntax Error at Line " + line + " - token " + err + " not recognized.");
            else
                System.err.println(msg);

        }

    }


}


