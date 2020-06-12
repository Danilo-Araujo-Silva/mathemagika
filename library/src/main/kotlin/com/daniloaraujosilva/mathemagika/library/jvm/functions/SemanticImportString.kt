package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SemanticImportString
 *
 * Full name:        System`SemanticImportString
 *
 *                   SemanticImportString["string"] attempts to import a string semantically to give a Dataset object.
 *                   SemanticImportString["string", type] attempts to interpret all elements in the string as being of the specified type.
 *                   SemanticImportString["string", {type , type , …}] attempts to interpret elements in successive columns as being of the specified types.
 *                                                       1      2
 *                   SemanticImportString["string",  col  -> type , col  -> type , … ] attempts to interpret elements in the named columns as being of the specified types.
 *                                                       1        1     2        2
 * Usage:            SemanticImportString["string", typespec, form] puts the result in the specified form.
 *
 *                   CharacterEncoding -> UTF-8
 *                   ColumnSpans -> {}
 *                   Delimiters -> Automatic
 *                   ExcludedLines -> {}
 *                   HeaderLines -> Automatic
 * Options:          MissingDataRules -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SemanticImportString
 * Documentation:    web: http://reference.wolfram.com/language/ref/SemanticImportString.html
 *
 * Definitions:      None
 *
 * Own values:       None
 *
 * Down values:      None
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun semanticImportString(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SemanticImportString", arguments.toMutableList(), options)
}
