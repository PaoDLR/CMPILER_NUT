import java.io.IOException;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class ParserTree {
    public static void main(String[] args) throws IOException {
        //prepare token stream
        CharStream stream = CharStreams.fromFileName("D:\\School\\CMPILER\\MP\\CMPILER_NUT\\parser_test_case.txt");
        NutLexer lexer  = new NutLexer(stream);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        NutParser parser = new NutParser(tokenStream);
        ParseTree tree = parser.startCode();

        //show AST in console
        System.out.println(tree.toStringTree(parser));

        //show AST in GUI
        JFrame frame = new JFrame("Antlr AST");
        JPanel panel = new JPanel();
        TreeViewer viewr = new TreeViewer(Arrays.asList(
                parser.getRuleNames()),tree);
        viewr.open();
    }

}
