import org.antlr.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.ArrayList;

public class ScriptLexer {

    public static void main(String[] args) throws Exception {
        //ArrayList<String> sal = new ArrayList();

        //Raf's path: C:\Users\Thomasraf\IdeaProjects\CMPILER_NUT\testCode.txt
        //Pao's path: D:\School\CMPILER\MP\CMPILER_NUT\testCode.txt
        System.out.println("Parsing: testCode.txt");

        //FileInputStream fis = new FileInputStream(file);
        CharStream cs = CharStreams.fromFileName("D:\\School\\CMPILER\\MP\\CMPILER_NUT\\testCode.txt");
        //System.out.println(sal);
        //ANTLRInputStream input = new ANTLRInputStream(file);
        LexerLexer lexer = new LexerLexer(cs);

        Token token = (Token) lexer.nextToken();
        while (token.getType() != LexerLexer.EOF) {
            System.out.println("\t" + getTokenType(token.getType()) + "\t\t" + token.getText());
            token = (Token) lexer.nextToken();

        }
    }

    private static java.lang.String getTokenType(int tokenType) {
        switch (tokenType) {
            case LexerLexer.KEYWORDS:
                return "keywords";
            case LexerLexer.IDENTIFIER:
                return "identifier";
            case LexerLexer.SEPARATORS:
                return "separators";
            case LexerLexer.OPERATORS:
                return "operators";
            case LexerLexer.DATATYPE:
                return "datatype";
            case LexerLexer.STRING_LITERAL:
                return "STRING_LITERAL";
            case LexerLexer.DECIMAL_LITERAL:
                return "DECIMAL_LITERAL";
            case LexerLexer.NULL_LITERAL:
                return "NULL_LITERAL";
            case LexerLexer.BOOLEAN_LITERAL:
                return "BOOLEAN_LITERAL";
            case LexerLexer.LINE_COMMENT:
                return "LINE_COMMENT";
            case LexerLexer.COMMENT:
                return "COMMENT";
            default:
                return "OTHER";
        }

    }
}
