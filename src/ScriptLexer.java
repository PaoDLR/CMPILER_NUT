import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.Token;
import org.antlr.v4.runtime.CharStream;

import java.io.File;
import java.io.FileInputStream;

public class ScriptLexer {

    public static void main(String[] args) throws Exception {

        File file = new File("C:\\Users\\Thomasraf\\IdeaProjects\\CMPILER_NUT\\testCode.txt");
        
        System.out.println("Parsing: " + args[0]);

        FileInputStream fis = new FileInputStream(new File(args[0]));
        ANTLRInputStream input = new ANTLRInputStream(fis);
        LexerLexer lexer = new LexerLexer((CharStream) input);

        Token token = (Token) lexer.nextToken();
        while (token.getType() != LexerLexer.EOF) {
            System.out.println("\t" + getTokenType(token.getType()) + "\t\t" + token.getText());
            token = (Token) lexer.nextToken();

        }
    }

    private static String getTokenType(int tokenType) {
        switch (tokenType) {
            case LexerLexer.STRING_LITERAL:
                return "STRING_LITERAL";
            case LexerLexer.DECIMAL_LITERAL:
                return "DECIMAL_LITERAL";
            case LexerLexer.NULL_LITERAL:
                return "NULL_LITERAL";
//            case LexerLexer.keywords:
//                return "keywords";
//            case LexerLexer.identifier:
//                return "identifier";
//            case LexerLexer.separators:
//                return "separators;
//            case LexerLexer.operators:
//                return "operators";
//            case LexerLexer.datatype:
//                return "datatype";
            default:
                return "OTHER";
        }

    }
}
