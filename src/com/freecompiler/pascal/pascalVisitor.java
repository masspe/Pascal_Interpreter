// Generated from pascal.g4 by ANTLR 4.5.3
package com.freecompiler.pascal;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link pascalParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface pascalVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link pascalParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(pascalParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#programHeading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramHeading(pascalParser.ProgramHeadingContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(pascalParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(pascalParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#usesUnitsPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsesUnitsPart(pascalParser.UsesUnitsPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#labelDeclarationPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelDeclarationPart(pascalParser.LabelDeclarationPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(pascalParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#constantDefinitionPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDefinitionPart(pascalParser.ConstantDefinitionPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#constantDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDefinition(pascalParser.ConstantDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#constantChr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantChr(pascalParser.ConstantChrContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(pascalParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#unsignedNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedNumber(pascalParser.UnsignedNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#unsignedInteger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedInteger(pascalParser.UnsignedIntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#unsignedReal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedReal(pascalParser.UnsignedRealContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(pascalParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(pascalParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(pascalParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#typeDefinitionPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDefinitionPart(pascalParser.TypeDefinitionPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#typeDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDefinition(pascalParser.TypeDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#functionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionType(pascalParser.FunctionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#procedureType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureType(pascalParser.ProcedureTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(pascalParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#simpleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleType(pascalParser.SimpleTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#scalarType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalarType(pascalParser.ScalarTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#subrangeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubrangeType(pascalParser.SubrangeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#typeIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeIdentifier(pascalParser.TypeIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#structuredType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructuredType(pascalParser.StructuredTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#unpackedStructuredType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpackedStructuredType(pascalParser.UnpackedStructuredTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#stringtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringtype(pascalParser.StringtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(pascalParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(pascalParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#indexType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexType(pascalParser.IndexTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#componentType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentType(pascalParser.ComponentTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#recordType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordType(pascalParser.RecordTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#fieldList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldList(pascalParser.FieldListContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#fixedPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixedPart(pascalParser.FixedPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#recordSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordSection(pascalParser.RecordSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#variantPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariantPart(pascalParser.VariantPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag(pascalParser.TagContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#variant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariant(pascalParser.VariantContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#setType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetType(pascalParser.SetTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#baseType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseType(pascalParser.BaseTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#fileType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileType(pascalParser.FileTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#pointerType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerType(pascalParser.PointerTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#variableDeclarationPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationPart(pascalParser.VariableDeclarationPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(pascalParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#procedureAndFunctionDeclarationPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureAndFunctionDeclarationPart(pascalParser.ProcedureAndFunctionDeclarationPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#procedureOrFunctionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureOrFunctionDeclaration(pascalParser.ProcedureOrFunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDeclaration(pascalParser.ProcedureDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(pascalParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#formalParameterSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterSection(pascalParser.FormalParameterSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#parameterGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterGroup(pascalParser.ParameterGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(pascalParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#constList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstList(pascalParser.ConstListContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(pascalParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#resultType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResultType(pascalParser.ResultTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(pascalParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#unlabelledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnlabelledStatement(pascalParser.UnlabelledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#simpleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStatement(pascalParser.SimpleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(pascalParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(pascalParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(pascalParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#relationaloperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationaloperator(pascalParser.RelationaloperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpression(pascalParser.SimpleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#additiveoperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveoperator(pascalParser.AdditiveoperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(pascalParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#multiplicativeoperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeoperator(pascalParser.MultiplicativeoperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#signedFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedFactor(pascalParser.SignedFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(pascalParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#unsignedConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedConstant(pascalParser.UnsignedConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#functionDesignator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDesignator(pascalParser.FunctionDesignatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(pascalParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(pascalParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#elementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementList(pascalParser.ElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(pascalParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#procedureStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureStatement(pascalParser.ProcedureStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#actualParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualParameter(pascalParser.ActualParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#gotoStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotoStatement(pascalParser.GotoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(pascalParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#empty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty(pascalParser.EmptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#structuredStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructuredStatement(pascalParser.StructuredStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(pascalParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(pascalParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#conditionalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStatement(pascalParser.ConditionalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(pascalParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#caseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStatement(pascalParser.CaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#caseListElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseListElement(pascalParser.CaseListElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#repetetiveStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepetetiveStatement(pascalParser.RepetetiveStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(pascalParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#repeatStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatStatement(pascalParser.RepeatStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(pascalParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#forList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForList(pascalParser.ForListContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#initialValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialValue(pascalParser.InitialValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#finalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinalValue(pascalParser.FinalValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#withStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithStatement(pascalParser.WithStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#recordVariableList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordVariableList(pascalParser.RecordVariableListContext ctx);
}