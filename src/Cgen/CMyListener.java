package Cgen;

import org.antlr.v4.runtime.ParserRuleContext;

public class CMyListener extends CBaseListener {
    public String scope = "Global";
    public String type = "";
    public String identifier = "";
    @Override public void enterEveryRule(ParserRuleContext ctx) {  //see gramBaseListener for allowed functions
        if(ctx.getClass().getName() == "Cgen.CParser$FunctionDefinitionContext"){
            scope = "Function";
        }
        if(ctx.getClass().getName() == "Cgen.CParser$TypeSpecifierContext"){
            type = ctx.getText();
        }
        if(ctx.getClass().getName() == "Cgen.CParser$DirectDeclaratorContext"){
            identifier = ctx.getText();
            System.out.println("Scope: "+ scope + "; Type: " + type + "; Identifier: " + identifier);
            //System.out.println("rule entered: " + ctx.getText());
        }
//        System.out.println("rule entered: " + ctx.getClass().getName());
//        System.out.println("rule entered: " + ctx.getText());
    }

    @Override
    public void enterFunctionDefinition(CParser.FunctionDefinitionContext ctx) {
        System.out.println("works");
    }

    @Override public void exitEveryRule(ParserRuleContext ctx){  //see gramBaseListener for allowed functions
        if(ctx.getClass().getName() == "Cgen.CParser$FunctionDefinitionContext"){
            scope = "Global";
        }
//        if(ctx.getClass().getName() == "Cgen.CParser$TypeSpecifierContext"){
//            type = "";
//        }
//        if(ctx.getClass().getName() == "Cgen.CParser$DeclaratorContext") {
//            identifier = "";
//        }
    }
}
