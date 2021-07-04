import Cgen.CLexer;
import Cgen.CMyListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class CIdentifierParser {
    public static void main(String[] args) throws IOException {
        CharStream charstream = CharStreams.fromFileName("G:\\Personal\\projects\\AntlrInJava\\exampleC\\FuncCallAsFuncArgument.c");
        CLexer cLexer = new CLexer(charstream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(cLexer);
        Cgen.CParser cParser = new Cgen.CParser(commonTokenStream);

        ParseTree parseTree = cParser.compilationUnit();
        CMyListener listener = new CMyListener();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, parseTree);

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