package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SemanticImport
 *
 * Full name:        System`SemanticImport
 *
 *                   SemanticImport[file] attempts to import a file semantically to give a Dataset object.
 *                   SemanticImport[file, type] attempts to interpret all elements in the file as being of the specified type.
 *                   SemanticImport[file, {type , type , …}] attempts to interpret elements in successive columns as being of the specified types.
 *                                             1      2
 *                   SemanticImport[file,  col  -> type , col  -> type , … ] keeps only the columns col  specified by their positions or names.
 *                                             1        1     2        2                                 i
 * Usage:            SemanticImport[file, typespec, form] puts the result in the specified form.
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
 *                   local: paclet:ref/SemanticImport
 * Documentation:    web: http://reference.wolfram.com/language/ref/SemanticImport.html
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
fun semanticImport(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SemanticImport", arguments.toMutableList(), options)
}
