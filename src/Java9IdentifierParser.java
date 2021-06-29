import Java9gen.Java9Lexer;
import Java9gen.Java9Parser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.IOException;

public class Java9IdentifierParser {
    public static void main(String[] args) throws IOException {
        CharStream charstream = CharStreams.fromFileName("./example.java");
        Java9Lexer java9Lexer = new Java9Lexer(charstream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(java9Lexer);
        Java9Parser java9Parser = new Java9Parser(commonTokenStream);

        ParseTree parseTree = java9Parser.identifier();
        System.out.println("Done");
//        int i=0;
//        for(i=0; i<= parseTree.getChildCount(); i++){
//            ParseTree a = parseTree.getChild(i);
//            TerminalNode b = (TerminalNode) a;
//            Token c = b.getSymbol();
//            int d = c.getType();
//            if(d == 105){
//                System.out.println("Found Identifier");
//                System.out.println(a.getText());
//            }
//        }
    }
}
