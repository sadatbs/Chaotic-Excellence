import JavaScriptgen.JavaScriptLexer;
import JavaScriptgen.JavaScriptParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.IOException;

public class JavaScriptIdentifierParser {
    public static void main(String[] args) throws IOException {
        CharStream charstream = CharStreams.fromFileName("./example.js");
        JavaScriptLexer javaScriptLexer = new JavaScriptLexer(charstream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(javaScriptLexer);
        JavaScriptParser javaScriptParser = new JavaScriptParser(commonTokenStream);

        ParseTree parseTree = javaScriptParser.identifierName();
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
