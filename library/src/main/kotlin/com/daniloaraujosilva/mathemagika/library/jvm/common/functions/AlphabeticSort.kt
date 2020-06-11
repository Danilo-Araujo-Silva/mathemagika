package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AlphabeticSort
 *
 * Full name:        System`AlphabeticSort
 *
 *                   AlphabeticSort[list] sorts the elements of list into alphabetical order.
 * Usage:            AlphabeticSort[list, lang] sorts using an ordering suitable for the language lang.
 *
 *                   CaseOrdering -> Automatic
 *                   IgnoreCase -> False
 *                   IgnoreDiacritics -> False
 *                   IgnorePunctuation -> False
 * Options:          Language :> $Language
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AlphabeticSort
 * Documentation:    web: http://reference.wolfram.com/language/ref/AlphabeticSort.html
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
fun alphabeticSort(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AlphabeticSort", arguments.toMutableList(), options)
}
