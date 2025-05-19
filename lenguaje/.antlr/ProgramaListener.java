// Generated from c:/Users/glben/OneDrive/Escritorio/final/prueba52519/lenguaje/Programa.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProgramaParser}.
 */
public interface ProgramaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProgramaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(ProgramaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(ProgramaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramaParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(ProgramaParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramaParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(ProgramaParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramaParser#repeticion}.
	 * @param ctx the parse tree
	 */
	void enterRepeticion(ProgramaParser.RepeticionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramaParser#repeticion}.
	 * @param ctx the parse tree
	 */
	void exitRepeticion(ProgramaParser.RepeticionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramaParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(ProgramaParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramaParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(ProgramaParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramaParser#salida}.
	 * @param ctx the parse tree
	 */
	void enterSalida(ProgramaParser.SalidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramaParser#salida}.
	 * @param ctx the parse tree
	 */
	void exitSalida(ProgramaParser.SalidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramaParser#terminar}.
	 * @param ctx the parse tree
	 */
	void enterTerminar(ProgramaParser.TerminarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramaParser#terminar}.
	 * @param ctx the parse tree
	 */
	void exitTerminar(ProgramaParser.TerminarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramaParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(ProgramaParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramaParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(ProgramaParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramaParser#caracter}.
	 * @param ctx the parse tree
	 */
	void enterCaracter(ProgramaParser.CaracterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramaParser#caracter}.
	 * @param ctx the parse tree
	 */
	void exitCaracter(ProgramaParser.CaracterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramaParser#letra}.
	 * @param ctx the parse tree
	 */
	void enterLetra(ProgramaParser.LetraContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramaParser#letra}.
	 * @param ctx the parse tree
	 */
	void exitLetra(ProgramaParser.LetraContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramaParser#digito}.
	 * @param ctx the parse tree
	 */
	void enterDigito(ProgramaParser.DigitoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramaParser#digito}.
	 * @param ctx the parse tree
	 */
	void exitDigito(ProgramaParser.DigitoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramaParser#simbolo}.
	 * @param ctx the parse tree
	 */
	void enterSimbolo(ProgramaParser.SimboloContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramaParser#simbolo}.
	 * @param ctx the parse tree
	 */
	void exitSimbolo(ProgramaParser.SimboloContext ctx);
}