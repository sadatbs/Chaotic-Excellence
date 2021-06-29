import Python3gen.Python3Lexer;
import Python3gen.Python3Parser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.IOException;

public class Python3IdentifierParser {
    public static void main(String[] args) throws IOException {
        CharStream charstream = CharStreams.fromFileName("./example.py");
        Python3Lexer python3Lexer = new Python3Lexer(charstream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(python3Lexer);
        Python3Parser python3Parser = new Python3Parser(commonTokenStream);

        ParseTree parseTree = python3Parser.exprlist();
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
