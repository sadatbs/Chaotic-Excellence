import Cgen.CLexer;
import Cgen.CParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.IOException;

public class CIdentifierParser {
    public static void main(String[] args) throws IOException {
        CharStream charstream = CharStreams.fromFileName("./example.c");
        CLexer cLexer = new CLexer(charstream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(cLexer);
        Cgen.CParser cParser = new Cgen.CParser(commonTokenStream);

        ParseTree parseTree = cParser.designator();
        int i=0;
        for(i=0; i<= parseTree.getChildCount(); i++){
            ParseTree a = parseTree.getChild(i);
            TerminalNode b = (TerminalNode) a;
            Token c = b.getSymbol();
            int d = c.getType();
            if(d == 105){
                System.out.println("Found Identifier");
                System.out.println(a.getText());
            }
        }
    }
}