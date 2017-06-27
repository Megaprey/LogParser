// Generated from Log.g4 by ANTLR 4.7

       import java.util.List;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LogParser}.
 */
public interface LogListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LogParser#log}.
	 * @param ctx the parse tree
	 */
	void enterLog(LogParser.LogContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogParser#log}.
	 * @param ctx the parse tree
	 */
	void exitLog(LogParser.LogContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogParser#statmenet}.
	 * @param ctx the parse tree
	 */
	void enterStatmenet(LogParser.StatmenetContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogParser#statmenet}.
	 * @param ctx the parse tree
	 */
	void exitStatmenet(LogParser.StatmenetContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogParser#address}.
	 * @param ctx the parse tree
	 */
	void enterAddress(LogParser.AddressContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogParser#address}.
	 * @param ctx the parse tree
	 */
	void exitAddress(LogParser.AddressContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogParser#protocol}.
	 * @param ctx the parse tree
	 */
	void enterProtocol(LogParser.ProtocolContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogParser#protocol}.
	 * @param ctx the parse tree
	 */
	void exitProtocol(LogParser.ProtocolContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(LogParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(LogParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogParser#ip}.
	 * @param ctx the parse tree
	 */
	void enterIp(LogParser.IpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogParser#ip}.
	 * @param ctx the parse tree
	 */
	void exitIp(LogParser.IpContext ctx);
}